package com.wjc.info;

import java.util.ArrayList;

public class unicon implements  ccslcon {
    String type = "union";
    String consclock1;
    String consclock2;
    String defclock;
    public unicon(){
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
    public String getConsclock1()
    {
        return this.consclock1;
    }
    public String getConsclock2()
    {
        return this.consclock2;
    }

    public String getDefclock() {
        return this.defclock;
    }

    @Override
    public void getText() {
        StringBuilder info = new StringBuilder("["+this.type+"]");
        info.append(this.defclock+" = " +this.consclock1 +" + "+this.consclock2);
        System.out.println(info);

    }

    @Override
    public void getType() {
        System.out.println(this.type);
    }
    public void genSMT(z3pycode z) {
        StringBuilder sb = new StringBuilder();
        sb.append("ForAll([x],Implies(And(x>=1, x<=b),Implies(T"+consclock1+"(x),T"+defclock+"(x))))");
        z.global_def.add(sb.toString());
        sb.delete(0,sb.length());
        sb.append("ForAll([x],Implies(And(x>=1, x<=b),Implies(T"+consclock2+"(x),T"+defclock+"(x))))");
        z.global_def.add(sb.toString());
        sb.delete(0,sb.length());
        sb.append("ForAll([x],Implies(And(x>=1, x<=b),Implies(T"+defclock+"(x),Or(T"+consclock1+"(x),T"+consclock2+"(x)))))");
        z.global_def.add(sb.toString());
        //System.out.println(sb);
    }
}
