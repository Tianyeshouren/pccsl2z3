package com.wjc.info;

import java.util.ArrayList;

public class caucon implements  ccslcon {
    String type = "causality";
    String preclock;
    String postclock;
    public caucon(){
        //System.out.println("ccsl: subclock");
    }
    public void setpreclock(String clock)
    {
        this.preclock = clock;
    }
    public void setpostclock(String clock)
    {
        this.postclock = clock;
    }
    public String getPreclock()
    {
        return this.preclock;
    }
    public String getPostclock()
    {
        return this.postclock;
    }

    @Override
    public void getText() {
        StringBuilder info = new StringBuilder("["+this.type+"]");
        info.append(this.preclock+" <= " +this.postclock);
        System.out.println(info);

    }

    @Override
    public void getType() {
        System.out.println(this.type);
    }
    public void genSMT(z3pycode z)
    {

        StringBuilder sb = new StringBuilder();
        sb.append("ForAll([x],Implies(And(x>=1,x<=b+1),H").append(preclock).append("(x) >= H").append(postclock).append("(x)))");

       // System.out.println(sb);
        z.global_def.add(sb.toString());
    }
}
