package com.wjc.info;

import java.util.ArrayList;

public class subcon implements  ccslcon {
    String type = "subclock";
    String subclock;
    String pclock;
    public subcon(){
       // System.out.println("ccsl: subclock");
    }
    public void setpclock(String clock)
    {
        this.pclock = clock;
    }
    public void setsubclock(String clock)
    {
        this.subclock = clock;
    }
    public String getsubclock()
    {
        return this.subclock;
    }
    public String getpclock()
    {
        return this.pclock;
    }

    @Override
    public void getText() {
        StringBuilder info = new StringBuilder("["+this.type+"]");
        info.append(this.subclock+" in " +this.pclock);
        System.out.println(info);

    }

    @Override
    public void getType() {
        System.out.println(this.type);
    }

    public void genSMT(z3pycode z)
    {

        StringBuilder sb = new StringBuilder();
        sb.append("ForAll([x],Implies(And(x>=1, x<=b),Implies(T"+subclock+"(x),T"+pclock+"(x))))");
        //System.out.println(sb);
        z.global_def.add( sb.toString());
    }
}
