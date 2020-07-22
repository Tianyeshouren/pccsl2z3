package com.wjc.info;

import java.util.ArrayList;

public class pedoffcon implements  ccslcon {
    String type = "periodicity with offset";
    String consclock;
    String defclock;
    int period;
    int offset;
    public pedoffcon(){
       // System.out.println("ccsl: subclock");
    }
    public void setDefclock(String clock)
    {
        this.defclock = clock;
    }
    public void setConsclock(String clock)
    {
        this.consclock = clock;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public String getConsclock()
    {
        return this.consclock;
    }
    public String getDefclock() {
        return this.defclock;
    }



    @Override
    public void getText() {
        StringBuilder info = new StringBuilder("["+this.type+"]");
        info.append(this.defclock+" = " +this.consclock +" oc "+this.period + " with e = " +this.offset);
        System.out.println(info);

    }

    @Override
    public void getType() {
        System.out.println(this.type);
    }

    public void genSMT(z3pycode z){


            StringBuilder sb = new StringBuilder();
            sb.append("ForAll([x],Implies(And(x>=1,x<=b),Implies( And((H"+consclock+"(x)+"+offset+") % "+period+"  == 0,T"+consclock+"(x)),T"+defclock+"(x) )  ))");
            z.global_def.add(sb.toString());
            sb.delete(0,sb.length());
            sb.append("ForAll([x],Implies(And(x>=1,x<=b),Implies( Not(And((H"+consclock+"(x)+"+offset+") % "+period+"  == 0,T"+consclock+"(x))),Not(T"+defclock+"(x) ))  ))");
            z.global_def.add(sb.toString());



    }
}
