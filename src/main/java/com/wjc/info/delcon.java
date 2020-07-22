package com.wjc.info;

import java.util.ArrayList;

public class delcon implements  ccslcon {
    String type = "delayfor";
    String consclock1;
    String consclock2;
    String defclock;
    String par;
    int low;
    int high;
    public delcon(){
       // System.out.println("ccsl: subclock");
    }
    public void setDefclock(String clock)
    {
        this.defclock = clock;
    }
    public void setConsclock1(String clock)
    {
        this.consclock1 = clock;
    }
    public void setConsclock2(String clock)
    {
        this.consclock2 = clock;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public void setLow(int low) {
        this.low = low;
    }

    public void setPar(String par) {
        this.par = par;
    }


    public String getDefclock() {
        return this.defclock;
    }

    public int getHigh() {
        return high;
    }

    public int getLow() {
        return low;
    }

    public String getPar() {
        return par;
    }

    @Override
    public void getText() {
        StringBuilder info = new StringBuilder("["+this.type+"]");
        info.append(this.defclock+" = " +this.consclock1 +" $ "+this.par + " on "+ this.consclock2 + " in [" + this.low+","+this.high+"]");
        System.out.println(info);

    }

    @Override
    public void getType() {
        System.out.println(this.type);
    }

    @Override
    public void genSMT(z3pycode z){
        StringBuilder sb = new StringBuilder();
        if(low == high && !consclock1.equals(consclock2)) {

            sb.append("ForAll([x],Implies(And(x>=1,x<=b),(T"+defclock+"(x) == And(T"+consclock2+"(x),Exists(m,And(m>=1,m<=x,T"+consclock1+"(m),H"+consclock2+"(x)-H"+consclock2+"(m) == "+low+"))))))");
            z.global_def.add(sb.toString());
//            sb.delete(0, sb.length());
//            sb.append("ForAll([x],Implies(And(x>=1,x<=b),Implies(Not(T"+defclock+"(x)),Or(Not(T"+consclock2+"(x)),ForAll(m,Implies(And(m>=1,m<=x),Or(Not(T"+consclock1+"(m)),H"+consclock2+"(x)-H"+consclock2+"(m) != "+low+"  )  ) )))))");
//            z.global_def.add(sb.toString());
        }
        else if(low == high && consclock1.equals(consclock2)) {

            sb.append("ForAll([x],Implies(And(x>=1,x<=b+1),Implies(H"+consclock1+"(x)-"+low+">0,H"+defclock+"(x)==H"+consclock1+"(x) - "+low+")))");
            z.global_def.add(sb.toString());
            sb.delete(0, sb.length());
            sb.append("ForAll([x],Implies(And(x>=1,x<=b+1),Implies(H"+consclock1+"(x)-"+low+"<=0,H"+defclock+"(x)== 0 )))");
            z.global_def.add(sb.toString());
        }
        else if(!(low == high) &&consclock1.equals(consclock2)) {
            z.Initdec.add(par+" = Int(\'"+par+"\')");
            z.global_def.add("And("+par+"<="+high+","+par+">="+low+")");

            sb.append("ForAll([x],Implies(And(x>=1,x<=b+1),Implies(H"+consclock1+"(x)-"+par+">0,H"+defclock+"(x)==H"+consclock1+"(x) - "+low+")))");
            z.global_def.add(sb.toString());
            sb.delete(0, sb.length());
            sb.append("ForAll([x],Implies(And(x>=1,x<=b+1),Implies(H"+consclock1+"(x)-"+par+"<=0,H"+defclock+"(x)== 0 )))");
            z.global_def.add(sb.toString());
        }
        else if(!(low == high) && !consclock1.equals(consclock2)) {
            z.Initdec.add(par+" = Int(\'"+par+"\')");
            z.global_def.add("And("+par+"<="+high+","+par+">="+low+")");

            sb.append("ForAll([x],Implies(And(x>=1,x<=b),(T"+defclock+"(x) == And(T"+consclock2+"(x),Exists(m,And(m>=1,m<=x,T"+consclock1+"(m),H"+consclock2+"(x)-H"+consclock2+"(m) == "+par+"))))))");
            z.global_def.add(sb.toString());
        }
    }
}
