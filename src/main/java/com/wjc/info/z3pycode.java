package com.wjc.info;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class z3pycode {
    public int bd = 0;
    public int ck_num =0;


    ArrayList<String> declare_fun_H = new ArrayList<>(); //定义History
    ArrayList<String> declare_fun_T = new ArrayList<>(); //定义tick
    ArrayList<String> global_def = new ArrayList<>();  //要增加的约束
    ArrayList<String> Initdec = new ArrayList<>(); //初始化变量,边界等
    ArrayList<String> declare_fun_S = new ArrayList<>(); //)
    StringBuilder opt = new StringBuilder();
    StringBuilder z3py = new StringBuilder();
    public z3pycode(HashSet<String> clocks, ArrayList<ccslcon> cons, int b)
    {
        bd = b;
        Initdec.add("x = Int(\'x\')");
        Initdec.add("m = Int(\'m\')");
        Initdec.add("b = Int(\'b\')");
        String bound = "b == " + b;
        global_def.add(bound);
        Initdec.add("v = Function(\"v\",BoolSort(),IntSort())");
        Initdec.add("HIC = Function(\"HIC\",IntSort(),IntSort())");
        Initdec.add("TIC = Function(\"TIC\",IntSort(),BoolSort())");
        Initdec.add("SIC = Function(\"SIC\",IntSort(),IntSort())");
        global_def.add("v(False) == 0");
        global_def.add("v(True) == 1");
        global_def.add("ForAll(x,TIC(x) == True)");
        global_def.add("ForAll(x,SIC(x) == x )");
        global_def.add("ForAll(x,HIC(x) == x-1 )");
        StringBuilder cur =  new StringBuilder();
        if(clocks.contains("IC"))
        {
            clocks.remove("IC");
        }
        Iterator<String> it = clocks.iterator();
        //System.out.println("process!");
        while(it.hasNext())
        {
            ck_num++;
            cur.delete(0,cur.length());
            String ck = it.next();
            cur.append("H").append(ck).append(" = Function(\'H").append(ck).append("\',IntSort(),IntSort())");
            //System.out.println(cur);
            declare_fun_H.add(cur.toString());
            cur.delete(0,cur.length());
            cur.append("S").append(ck).append(" = Function(\'S").append(ck).append("\',IntSort(),IntSort())");
            //System.out.println(cur);
            declare_fun_S.add(cur.toString());
            cur.delete(0,cur.length());
            cur.append("T").append(ck).append(" = Function(\'T").append(ck).append("\',IntSort(),BoolSort())");
            declare_fun_T.add(cur.toString());

            cur.delete(0,cur.length());
            cur.append("H").append(ck).append("(1) == 0");
            global_def.add(cur.toString());
            cur.delete(0,cur.length());
            for(int i = 2;i<=b+1;i++)
            {
               // cur.append("Or(And(T"+ck+"("+(i-1)+"),H"+ck+"("+i+")==H"+ck+"("+(i-1)+")+1),And(Not(T"+ck+"("+(i-1)+")),H"+ck+"("+i+")==H"+ck+"("+(i-1)+")))");
                cur.append("H"+ck+"("+i+") == H"+ck+"("+(i-1)+") + v(T"+ck+"("+(i-1)+"))");
                global_def.add(cur.toString());
                cur.delete(0,cur.length());
            }

//            cur.append("ForAll([x],Implies(And(x>=2, x<=b+1),(Implies(T").append(ck).append("(x-1),H").append(ck).append("(x) == H").append(ck).append("(x-1)+1))))");
//            global_def.add(cur.toString());
//            cur.delete(0,cur.length());
//            cur.append("ForAll([x],Implies(And(x>=2, x<=b+1),(Implies(Not(T").append(ck).append("(x-1)),H").append(ck).append("(x) == H").append(ck).append("(x-1)))))");
//            global_def.add(cur.toString());

            cur.delete(0,cur.length());
            cur.append("ForAll(x,Implies(And(x>=1,x<=b),Implies(T"+ck+"(x),S"+ck+"(H"+ck+"(x)+1) == x)))");
            global_def.add(cur.toString());
            cur.delete(0,cur.length());
            cur.append("ForAll(x,Implies(x>H"+ck+"(b+1),S"+ck+"(x) == b+2))");
            global_def.add(cur.toString());


            opt.append("print(\""+ck+": \")\n");
            opt.append("trace += \""+ck).append(": \"\n");
            opt.append("for i in range(1,"+(bd+1)+"):\r\n");
            opt.append("\ttemp=str(m.eval(v(T"+ck+"(i))))\n");
            opt.append("\tprint(temp,end=\' \'),\r\n").append("\ttrace += temp\n").append("print(\"\\n\")\n");;
            opt.append("trace += \"\\n\"\n");



        }

        int i = 0;
        while(i<cons.size())
        {
            cons.get(i).genSMT(this);
            i++;
        }

       noempty(clocks);

    }
    public void pt()
    {
        z3py.append("# -*- coding: utf-8 -*-\n" +
                "from z3 import *\n"+
                "trace = \"\"\n");
        //z3py.append("bd = "+bd+"\n");
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(i<Initdec.size())
        {
            //System.out.println(Initdec.get(i));
            z3py.append(Initdec.get(i)).append("\n");
            i++;

        }
         i = 0;
        while(i<declare_fun_T.size())
        {
            //System.out.println(declare_fun_T.get(i));
            z3py.append(declare_fun_T.get(i)).append("\n");
            i++;

        }
        i = 0;
        while(i<declare_fun_S.size())
        {
            //System.out.println(declare_fun_T.get(i));
            z3py.append(declare_fun_S.get(i)).append("\n");
            i++;

        }
        i = 0;
        while(i<declare_fun_H.size())
        {
            //System.out.println(declare_fun_H.get(i));
            z3py.append(declare_fun_H.get(i)).append("\n");
            i++;

        }
        i=0;
        z3py.append("t=Tactic(\"auflira\")\n");
        z3py.append("s=t.solver()").append("\n");

        while(i<global_def.size())
        {
            String cur = global_def.get(i);
            sb.append("s.add(").append(cur).append(")");
            //System.out.println(sb.toString());
            z3py.append(sb).append("\n");
            sb.delete(0,sb.length());
            i++;
        }
        z3py.append("print(s.check())\n");
        z3py.append("if (str(s.check())==\'unsat\'):\n" +
                "\twith open(r'traces.txt', 'w', encoding='utf-8') as f:\n" +
                "\t\tf.write(\"unsat\")\n"+
                "\tquit()\n");
        z3py.append("m = s.model()\n");
        //System.out.print(opt.toString());
        z3py.append(opt);
        z3py.append("print(trace)\n");
        z3py.append("with open(r'traces.txt', 'w', encoding='utf-8') as f:\n" +
                "\tf.write(trace[:-1])");
        System.out.println(z3py.toString());

    }

    public void noempty(HashSet<String> clocks)
    {
        Iterator<String> it = clocks.iterator();
        StringBuilder sb = new StringBuilder();
        String clock1 = it.next();

        String clock2 = it.next();
        sb.append("T"+clock1+"(x) , T"+clock2+"(x) ");


        while(it.hasNext())
        {
            String curck = it.next();
            sb.append(", T"+curck+"(x) ");


        }
        StringBuilder tp = new StringBuilder(sb);
        sb.delete(0,sb.length());
        sb.append("ForAll([x],Implies(And(x >= 1, x<=b),(Or(").append(tp).append("))))");
        global_def.add(sb.toString());




    }
    public String getpycode()
    {return z3py.toString();}



}
