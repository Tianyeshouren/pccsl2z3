package com.wjc.info;

import java.util.ArrayList;

public class infcon implements  ccslcon {
    String type = "infimum";
    String consclock1;
    String consclock2;
    String defclock;
    public infcon(){
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
        info.append(this.defclock+" = " +this.consclock1 +" ^ "+this.consclock2);
        System.out.println(info);

    }

    @Override
    public void getType() {
        System.out.println(this.type);
    }
    public void genSMT(z3pycode z){
        StringBuilder sb = new StringBuilder();
        sb.append("ForAll([x],Implies(And(x>=1,x<=b),Implies(H"+consclock1+"(x) >= H"+consclock2+"(x),H"+defclock+"(x)==H"+consclock1+"(x) )  ))");
        z.global_def.add(sb.toString());
        sb.delete(0,sb.length());
        sb.append("ForAll([x],Implies(And(x>=1,x<=b),Implies(H"+consclock2+"(x) >= H"+consclock1+"(x),H"+defclock+"(x)==H"+consclock2+"(x) )  ))");
        z.global_def.add(sb.toString());
    }
}
