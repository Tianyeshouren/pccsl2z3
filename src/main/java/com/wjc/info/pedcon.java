package com.wjc.info;

import java.util.ArrayList;

public class pedcon implements  ccslcon {
    String type = "periodicity";
    String consclock;
    String defclock;
    String par;
    int low;
    int high;
    public pedcon(){
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

    public void setHigh(int high) {
        this.high = high;
    }

    public void setLow(int low) {
        this.low = low;
    }

    public void setPar(String par) {
        this.par = par;
    }

    public String getConsclock()
    {
        return this.consclock;
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
        info.append(this.defclock+" = " +this.consclock +" oc "+this.par + " in [" + this.low+","+this.high+"]");
        System.out.println(info);

    }

    @Override
    public void getType() {
        System.out.println(this.type);
    }
    public void genSMT(z3pycode z){
        StringBuilder sb = new StringBuilder();
        if(low == high)
        {

            sb.append("ForAll([x],Implies(And(x>=1,x<=b),Implies( And((H"+consclock+"(x)) % "+low+"  == 0,T"+consclock+"(x)),T"+defclock+"(x) )  ))");
            z.global_def.add(sb.toString());
            sb.delete(0,sb.length());
            sb.append("ForAll([x],Implies(And(x>=1,x<=b),Implies( Not(And((H"+consclock+"(x)) % "+low+"  == 0,T"+consclock+"(x))),Not(T"+defclock+"(x) ))  ))");
            z.global_def.add(sb.toString());
        }
        else
        {
            z.Initdec.add(par+" = Int(\'"+par+"\')");
            z.global_def.add("And("+par+"<="+high+","+par+">="+low+")");

            sb.append("ForAll([x],Implies(And(x>=1,x<=b),Implies( And((H"+consclock+"(x)) % "+par+"  == 0,T"+consclock+"(x)),T"+defclock+"(x) )  ))");
            z.global_def.add(sb.toString());
            sb.delete(0,sb.length());
            sb.append("ForAll([x],Implies(And(x>=1,x<=b),Implies( Not(And((H"+consclock+"(x)) % "+par+"  == 0,T"+consclock+"(x))),Not(T"+defclock+"(x) ))  ))");
            z.global_def.add(sb.toString());

        }



    }
}
