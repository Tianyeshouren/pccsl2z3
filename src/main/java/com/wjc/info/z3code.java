package com.wjc.info;

import javafx.geometry.HPos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class z3code {
    int size = 0;
    int bound = 100;
    ArrayList<String> declare_fun_H = new ArrayList<>();
    ArrayList<String> declare_fun_T = new ArrayList<>();
    ArrayList<String> global_def = new ArrayList<>();
    public  z3code(HashSet<String> clocks,ArrayList<ccslcon> cons,int b)
    {
        size = clocks.size();
        bound = b;
        StringBuilder cur =  new StringBuilder();

        String hpre = "(declare-fun H";
        String tpre = "(declare-fun T";
        String hpost = " (Int) Int )";
        String tpost = " (Int) Bool )";

        Iterator<String> it = clocks.iterator();
        //System.out.println("process!");
        while(it.hasNext())
        {
            cur.delete(0,cur.length());
            cur.append(hpre);
            String tx = it.next();
            cur.append(tx);
            cur.append(hpost);
            //System.out.println(cur);
            declare_fun_H.add(cur.toString());
            cur.delete(0,cur.length());
            cur.append(tpre);
            cur.append(tx);
            cur.append(tpost);
            declare_fun_T.add(cur.toString());


            String prefor = "(assert (forall ((x Int)) ";
            String bd = "(=> (and (> x 1) (< x "+ Integer.toString(bound+1) +"))";
            cur.delete(0,cur.length());
            cur.append("(assert (= (H"+tx+" 1 ) 0 ) )");
            global_def.add(cur.toString());
            cur.delete(0,cur.length());
            cur.append(prefor).append(bd).append("(=> (T"+tx+" x) (= (H"+tx+" x)  (+ (H"+tx+" (- x 1) ) 1) ) )").append(")))");
            global_def.add(cur.toString());
            cur.delete(0,cur.length());
            cur.append(prefor).append(bd).append("(=> (not (T"+tx+" x)) (= (H"+tx+" x)  (H"+tx+" (- x 1) )  ) )").append(")))");
            global_def.add(cur.toString());





        }

        int i = 0;
//        while(i<cons.size())
//        {
//            cons.get(i).genSMT(this);
//            i++;
//        }

       noempty(clocks);

    }
    public void pt()
    {
        int i = 0;
        while(i<global_def.size())
        {
            System.out.println(global_def.get(i));
            i++;

        }
         i = 0;
        while(i<declare_fun_T.size())
        {
            System.out.println(declare_fun_T.get(i));
            i++;

        }
        i = 0;
        while(i<declare_fun_H.size())
        {
            System.out.println(declare_fun_H.get(i));
            i++;

        }
    }

    public void noempty(HashSet<String> clocks)
    {
        String prefor = "(assert (forall ((x Int)) ";
        String bd = "(=> (and (> x 0) (< x "+ Integer.toString(bound+1) +"))";

        Iterator<String> it = clocks.iterator();
        StringBuilder sb = new StringBuilder();
        String clock1 = it.next();

        String clock2 = it.next();
        sb.append("(or (T"+clock1+"  x) (T"+clock2+"  x) )");


        while(it.hasNext())
        {
            String curck = it.next();
            StringBuilder tp = new StringBuilder(sb);
            sb.delete(0,sb.length());
            sb.append("(or (T").append(curck).append(" x) ").append(tp).append(" )");


        }
        StringBuilder tp = new StringBuilder(sb);
        sb.delete(0,sb.length());
        sb.append(prefor).append(bd).append(tp).append(")))");
        global_def.add(sb.toString());




    }



}
