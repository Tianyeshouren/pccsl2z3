package com.wjc.info;

import java.util.ArrayList;

public class precon implements  ccslcon {
    String type = "precedence";
    String preclock;
    String postclock;
    int bound  = 0;
    public precon(){
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
    public void setBound(int num) {this.bound = num;}
    public String getPreclock()
    {
        return this.preclock;
    }
    public String getPostclock()
    {
        return this.postclock;
    }
    public int getBound() {return this.bound;}
    @Override
    public void getText() {
        StringBuilder info = new StringBuilder("["+this.type+"]");
        info.append(this.preclock+" [" +bound +"]" + "< " + this.postclock);
        System.out.println(info);

    }

    @Override
    public void getType() {
        System.out.println(this.type);
    }

    public void genSMT(z3pycode z){
        StringBuilder sb = new StringBuilder();
        sb.append("ForAll([x],Implies(And(x>=1,x<=b),Implies(H"+postclock+"(x)-H"+preclock+"(x) == "+bound+" ,Not(T"+postclock+"(x)) ) )  )");
        //System.out.println(sb);
        z.global_def.add( sb.toString());
    }
}
