package com.wjc.grammar;

import com.wjc.info.*;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashSet;

public class mypccslListener extends pccslBaseListener{
    public ArrayList<ccslcon> constraints = new ArrayList<>();
    public HashSet<String> clocks = new HashSet<>();
    //ccslcon curccslcon;
    int i = 0;
    @Override
    public void enterCon(pccslParser.ConContext ctx) {

    }

    @Override
    public void enterSubclock(pccslParser.SubclockContext ctx) {
        subcon curcon = new subcon();
        constraints.add(curcon);
        curcon.setsubclock(ctx.CLOCK(0).getText());
        //System.out.println(ctx);
        curcon.setpclock(ctx.CLOCK(1).getText());
        //System.out.println(curcon.getpclock());
        //curccslcon = curcon;
    }



    @Override
    public void enterCausality(pccslParser.CausalityContext ctx) {
        caucon curcon = new caucon();
        constraints.add(curcon);
        curcon.setpreclock(ctx.CLOCK(0).getText());
        curcon.setpostclock(ctx.CLOCK(1).getText());
        //curccslcon = curcon;

    }

    @Override
    public void enterUnion(pccslParser.UnionContext ctx) {
        unicon curcon = new unicon();
        constraints.add(curcon);
        curcon.setDefclock(ctx.CLOCK(0).getText());
        curcon.setConsclock1(ctx.CLOCK(1).getText());
        curcon.setConsclock2(ctx.CLOCK(2).getText());
    }

    @Override
    public void enterIntersection(pccslParser.IntersectionContext ctx) {
        intcon curcon = new intcon();
        constraints.add(curcon);
        curcon.setDefclock(ctx.CLOCK(0).getText());
        curcon.setConsclock1(ctx.CLOCK(1).getText());
        curcon.setConsclock2(ctx.CLOCK(2).getText());
    }

    @Override
    public void enterPrecedence(pccslParser.PrecedenceContext ctx) {
        precon curcon = new precon();
        constraints.add(curcon);
        curcon.setpreclock(ctx.CLOCK(0).getText());
        curcon.setpostclock(ctx.CLOCK(1).getText());
        curcon.setBound(Integer.parseInt(ctx.NUM().getText()));
    }

    @Override
    public void enterExclusion(pccslParser.ExclusionContext ctx) {
        exccon curcon = new exccon();
        constraints.add(curcon);
        curcon.setpreclock(ctx.CLOCK(0).getText());
        curcon.setpostclock(ctx.CLOCK(1).getText());
    }

    @Override
    public void enterInfimum(pccslParser.InfimumContext ctx) {
        infcon curcon = new infcon();
        constraints.add(curcon);
        curcon.setDefclock(ctx.CLOCK(0).getText());
        curcon.setConsclock1(ctx.CLOCK(1).getText());
        curcon.setConsclock2(ctx.CLOCK(2).getText());
    }

    @Override
    public void enterSupremum(pccslParser.SupremumContext ctx) {
        supcon curcon = new supcon();
        constraints.add(curcon);
        curcon.setDefclock(ctx.CLOCK(0).getText());
        curcon.setConsclock1(ctx.CLOCK(1).getText());
        curcon.setConsclock2(ctx.CLOCK(2).getText());
    }

    @Override
    public void enterPeriodicity(pccslParser.PeriodicityContext ctx) {
        pedcon curcon = new pedcon();
        constraints.add(curcon);
        curcon.setDefclock(ctx.CLOCK(0).getText());
        curcon.setConsclock(ctx.CLOCK(1).getText());
        curcon.setPar(ctx.PAR(0).getText());
        curcon.setLow(Integer.parseInt(ctx.NUM(0).getText()));
        curcon.setHigh(Integer.parseInt(ctx.NUM(1).getText()));

    }

    @Override
    public void enterPedoff(pccslParser.PedoffContext ctx) {
        pedoffcon curcon = new pedoffcon();
        constraints.add(curcon);
        curcon.setDefclock(ctx.CLOCK(0).getText());
        curcon.setConsclock(ctx.CLOCK(1).getText());
        curcon.setPeriod(Integer.parseInt(ctx.NUM(0).getText()));
        curcon.setOffset(Integer.parseInt(ctx.NUM(1).getText()));

    }

    @Override
    public void enterPedjitter(pccslParser.PedjitterContext ctx) {
        pedjitcon curcon = new pedjitcon();
        constraints.add(curcon);
        curcon.setDefclock(ctx.CLOCK(0).getText());
        curcon.setConsclock(ctx.CLOCK(1).getText());
        curcon.setPeriod(Integer.parseInt(ctx.NUM(0).getText()));
        curcon.setOffset(Integer.parseInt(ctx.NUM(1).getText()));
    }

    @Override
    public void enterPeddrify(pccslParser.PeddrifyContext ctx) {
        peddftcon curcon = new peddftcon();
        constraints.add(curcon);
        curcon.setDefclock(ctx.CLOCK(0).getText());
        curcon.setConsclock(ctx.CLOCK(1).getText());
        curcon.setPeriod(Integer.parseInt(ctx.NUM(0).getText()));
        curcon.setOffset(Integer.parseInt(ctx.NUM(1).getText()));
    }

    @Override
    public void enterDelayfpr(pccslParser.DelayfprContext ctx) {
        delcon curcon = new delcon();
        constraints.add(curcon);
        curcon.setDefclock(ctx.CLOCK(0).getText());
        curcon.setConsclock1(ctx.CLOCK(1).getText());
        curcon.setConsclock2(ctx.CLOCK(2).getText());
        curcon.setPar(ctx.PAR(0).getText());
        curcon.setLow(Integer.parseInt(ctx.NUM(0).getText()));
        curcon.setHigh(Integer.parseInt(ctx.NUM(1).getText()));
    }

    @Override
    public void exitCon(pccslParser.ConContext ctx) {


    }

    @Override
    public void visitTerminal(TerminalNode node) {

        if(node.getSymbol().getType()==21)
        {
            if(!clocks.contains(node.getText()))
                clocks.add(node.getText());
        }
    }

    public void pt()
    {
        int i = 0;
        while(i<constraints.size())
        {
            constraints.get(i).getText();
            i++;
        }
        System.out.println(clocks.size());
    }
}
