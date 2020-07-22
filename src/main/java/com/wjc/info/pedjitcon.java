package com.wjc.info;

import java.util.ArrayList;

public class pedjitcon implements  ccslcon {
    String type = "periodicity with jitter";
    String consclock;
    String defclock;
    int period;
    int offset;
    public pedjitcon(){
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
        info.append(this.defclock+" = " +this.consclock +" oc "+this.period + " +- " +this.offset);
        System.out.println(info);

    }

    @Override
    public void getType() {
        System.out.println(this.type);
    }

    public void genSMT(z3pycode z){
        StringBuilder sb = new StringBuilder();
        sb.append("S"+defclock+"(1) <= S"+consclock+"(1)+"+offset);
        z.global_def.add(sb.toString());
        sb.delete(0,sb.length());
        sb.append("ForAll(x,Implies(And(x>=1,x<H"+defclock+"(b+1)), And(x*"+period+" - "+offset+" <= H"+consclock+"(S"+defclock+"(x+1)) - H"+consclock+"(S"+defclock+"(1)),  H"+consclock+"(S"+defclock+"(x+1)) - H"+consclock+"(S"+defclock+"(1)) <= x*"+period+"+"+offset+" )))");
        z.global_def.add(sb.toString());
        sb.delete(0,sb.length());
        sb.append("ForAll(x,Implies(And(x>=1,x<=b),Implies(H"+consclock+"(x) % "+period+" == 0 ,H"+defclock+"(S"+consclock+"(H"+consclock+"(x)+2+"+offset+")) - H"+defclock+"(S"+consclock+"(H"+consclock+"(x)+1-"+offset+")) == 1) ))");
        z.global_def.add(sb.toString());

    }
}
