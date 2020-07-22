// Generated from D:/pCCSL2SMT/src/res\pccsl.g4 by ANTLR 4.8
package com.wjc.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link pccslParser}.
 */
public interface pccslListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link pccslParser#cons}.
	 * @param ctx the parse tree
	 */
	void enterCons(pccslParser.ConsContext ctx);
	/**
	 * Exit a parse tree produced by {@link pccslParser#cons}.
	 * @param ctx the parse tree
	 */
	void exitCons(pccslParser.ConsContext ctx);
	/**
	 * Enter a parse tree produced by {@link pccslParser#con}.
	 * @param ctx the parse tree
	 */
	void enterCon(pccslParser.ConContext ctx);
	/**
	 * Exit a parse tree produced by {@link pccslParser#con}.
	 * @param ctx the parse tree
	 */
	void exitCon(pccslParser.ConContext ctx);
	/**
	 * Enter a parse tree produced by {@link pccslParser#periodicity}.
	 * @param ctx the parse tree
	 */
	void enterPeriodicity(pccslParser.PeriodicityContext ctx);
	/**
	 * Exit a parse tree produced by {@link pccslParser#periodicity}.
	 * @param ctx the parse tree
	 */
	void exitPeriodicity(pccslParser.PeriodicityContext ctx);
	/**
	 * Enter a parse tree produced by {@link pccslParser#delayfpr}.
	 * @param ctx the parse tree
	 */
	void enterDelayfpr(pccslParser.DelayfprContext ctx);
	/**
	 * Exit a parse tree produced by {@link pccslParser#delayfpr}.
	 * @param ctx the parse tree
	 */
	void exitDelayfpr(pccslParser.DelayfprContext ctx);
	/**
	 * Enter a parse tree produced by {@link pccslParser#subclock}.
	 * @param ctx the parse tree
	 */
	void enterSubclock(pccslParser.SubclockContext ctx);
	/**
	 * Exit a parse tree produced by {@link pccslParser#subclock}.
	 * @param ctx the parse tree
	 */
	void exitSubclock(pccslParser.SubclockContext ctx);
	/**
	 * Enter a parse tree produced by {@link pccslParser#causality}.
	 * @param ctx the parse tree
	 */
	void enterCausality(pccslParser.CausalityContext ctx);
	/**
	 * Exit a parse tree produced by {@link pccslParser#causality}.
	 * @param ctx the parse tree
	 */
	void exitCausality(pccslParser.CausalityContext ctx);
	/**
	 * Enter a parse tree produced by {@link pccslParser#union}.
	 * @param ctx the parse tree
	 */
	void enterUnion(pccslParser.UnionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pccslParser#union}.
	 * @param ctx the parse tree
	 */
	void exitUnion(pccslParser.UnionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pccslParser#infimum}.
	 * @param ctx the parse tree
	 */
	void enterInfimum(pccslParser.InfimumContext ctx);
	/**
	 * Exit a parse tree produced by {@link pccslParser#infimum}.
	 * @param ctx the parse tree
	 */
	void exitInfimum(pccslParser.InfimumContext ctx);
	/**
	 * Enter a parse tree produced by {@link pccslParser#exclusion}.
	 * @param ctx the parse tree
	 */
	void enterExclusion(pccslParser.ExclusionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pccslParser#exclusion}.
	 * @param ctx the parse tree
	 */
	void exitExclusion(pccslParser.ExclusionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pccslParser#precedence}.
	 * @param ctx the parse tree
	 */
	void enterPrecedence(pccslParser.PrecedenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link pccslParser#precedence}.
	 * @param ctx the parse tree
	 */
	void exitPrecedence(pccslParser.PrecedenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link pccslParser#intersection}.
	 * @param ctx the parse tree
	 */
	void enterIntersection(pccslParser.IntersectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pccslParser#intersection}.
	 * @param ctx the parse tree
	 */
	void exitIntersection(pccslParser.IntersectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pccslParser#supremum}.
	 * @param ctx the parse tree
	 */
	void enterSupremum(pccslParser.SupremumContext ctx);
	/**
	 * Exit a parse tree produced by {@link pccslParser#supremum}.
	 * @param ctx the parse tree
	 */
	void exitSupremum(pccslParser.SupremumContext ctx);
	/**
	 * Enter a parse tree produced by {@link pccslParser#pedoff}.
	 * @param ctx the parse tree
	 */
	void enterPedoff(pccslParser.PedoffContext ctx);
	/**
	 * Exit a parse tree produced by {@link pccslParser#pedoff}.
	 * @param ctx the parse tree
	 */
	void exitPedoff(pccslParser.PedoffContext ctx);
	/**
	 * Enter a parse tree produced by {@link pccslParser#pedjitter}.
	 * @param ctx the parse tree
	 */
	void enterPedjitter(pccslParser.PedjitterContext ctx);
	/**
	 * Exit a parse tree produced by {@link pccslParser#pedjitter}.
	 * @param ctx the parse tree
	 */
	void exitPedjitter(pccslParser.PedjitterContext ctx);
	/**
	 * Enter a parse tree produced by {@link pccslParser#peddrify}.
	 * @param ctx the parse tree
	 */
	void enterPeddrify(pccslParser.PeddrifyContext ctx);
	/**
	 * Exit a parse tree produced by {@link pccslParser#peddrify}.
	 * @param ctx the parse tree
	 */
	void exitPeddrify(pccslParser.PeddrifyContext ctx);
}