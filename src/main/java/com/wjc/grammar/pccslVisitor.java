// Generated from D:/pCCSL2SMT/src/res\pccsl.g4 by ANTLR 4.8
package com.wjc.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link pccslParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface pccslVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link pccslParser#cons}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCons(pccslParser.ConsContext ctx);
	/**
	 * Visit a parse tree produced by {@link pccslParser#con}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCon(pccslParser.ConContext ctx);
	/**
	 * Visit a parse tree produced by {@link pccslParser#periodicity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPeriodicity(pccslParser.PeriodicityContext ctx);
	/**
	 * Visit a parse tree produced by {@link pccslParser#delayfpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelayfpr(pccslParser.DelayfprContext ctx);
	/**
	 * Visit a parse tree produced by {@link pccslParser#subclock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubclock(pccslParser.SubclockContext ctx);
	/**
	 * Visit a parse tree produced by {@link pccslParser#causality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCausality(pccslParser.CausalityContext ctx);
	/**
	 * Visit a parse tree produced by {@link pccslParser#union}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion(pccslParser.UnionContext ctx);
	/**
	 * Visit a parse tree produced by {@link pccslParser#infimum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfimum(pccslParser.InfimumContext ctx);
	/**
	 * Visit a parse tree produced by {@link pccslParser#exclusion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusion(pccslParser.ExclusionContext ctx);
	/**
	 * Visit a parse tree produced by {@link pccslParser#precedence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecedence(pccslParser.PrecedenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link pccslParser#intersection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntersection(pccslParser.IntersectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link pccslParser#supremum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupremum(pccslParser.SupremumContext ctx);
	/**
	 * Visit a parse tree produced by {@link pccslParser#pedoff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPedoff(pccslParser.PedoffContext ctx);
	/**
	 * Visit a parse tree produced by {@link pccslParser#pedjitter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPedjitter(pccslParser.PedjitterContext ctx);
	/**
	 * Visit a parse tree produced by {@link pccslParser#peddrify}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPeddrify(pccslParser.PeddrifyContext ctx);
}