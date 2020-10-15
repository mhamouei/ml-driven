// Generated from /home/mhit/IdeaProjects/MlSqliTester/src/main/resources/Injection.g4 by ANTLR 4.7.2
package io.github.mhamooei.antlrparser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link InjectionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface InjectionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link InjectionParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(InjectionParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#dQuoteContext}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDQuoteContext(InjectionParser.DQuoteContextContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#sQuoteContext}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSQuoteContext(InjectionParser.SQuoteContextContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#numericContext}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericContext(InjectionParser.NumericContextContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#sqliAttack}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqliAttack(InjectionParser.SqliAttackContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#piggyAttack}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPiggyAttack(InjectionParser.PiggyAttackContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#unionAttack}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionAttack(InjectionParser.UnionAttackContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#union}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion(InjectionParser.UnionContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#unionPostfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionPostfix(InjectionParser.UnionPostfixContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#cols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCols(InjectionParser.ColsContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#distinct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistinct(InjectionParser.DistinctContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#all}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll(InjectionParser.AllContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#t1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT1(InjectionParser.T1Context ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#t2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT2(InjectionParser.T2Context ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#t3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT3(InjectionParser.T3Context ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#t4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT4(InjectionParser.T4Context ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#t5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT5(InjectionParser.T5Context ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#booleanAttack}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAttack(InjectionParser.BooleanAttackContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#andAttack}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndAttack(InjectionParser.AndAttackContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#orAttack}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrAttack(InjectionParser.OrAttackContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#booleanFalseExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanFalseExpr(InjectionParser.BooleanFalseExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#unaryFalse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryFalse(InjectionParser.UnaryFalseContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#falseAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseAtom(InjectionParser.FalseAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#falseConst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseConst(InjectionParser.FalseConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#booleanTrueExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanTrueExpr(InjectionParser.BooleanTrueExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#binaryTrue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryTrue(InjectionParser.BinaryTrueContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#unaryTrue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryTrue(InjectionParser.UnaryTrueContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#trueAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueAtom(InjectionParser.TrueAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#trueConst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueConst(InjectionParser.TrueConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#wsp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWsp(InjectionParser.WspContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#cmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmt(InjectionParser.CmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#hashtag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHashtag(InjectionParser.HashtagContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#doubleDash}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleDash(InjectionParser.DoubleDashContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#funcSleep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncSleep(InjectionParser.FuncSleepContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#sleep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSleep(InjectionParser.SleepContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#blank}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlank(InjectionParser.BlankContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#inlineCmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineCmt(InjectionParser.InlineCmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#parOpen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParOpen(InjectionParser.ParOpenContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#par}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPar(InjectionParser.ParContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#terOne}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerOne(InjectionParser.TerOneContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#terSQuote}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerSQuote(InjectionParser.TerSQuoteContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#terDQuote}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerDQuote(InjectionParser.TerDQuoteContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#terDigitZero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerDigitZero(InjectionParser.TerDigitZeroContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#terDigitOne}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerDigitOne(InjectionParser.TerDigitOneContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#terDigitExcludingZero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerDigitExcludingZero(InjectionParser.TerDigitExcludingZeroContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#terDigitIncludingZero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerDigitIncludingZero(InjectionParser.TerDigitIncludingZeroContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#terChar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerChar(InjectionParser.TerCharContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#opNot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpNot(InjectionParser.OpNotContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#opBinInvert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpBinInvert(InjectionParser.OpBinInvertContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#opEqual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpEqual(InjectionParser.OpEqualContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#opLt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpLt(InjectionParser.OpLtContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#opGt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpGt(InjectionParser.OpGtContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#opLike}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpLike(InjectionParser.OpLikeContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#opIs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpIs(InjectionParser.OpIsContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#opMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpMinus(InjectionParser.OpMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#opOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpOr(InjectionParser.OpOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#opAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpAnd(InjectionParser.OpAndContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#opSel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpSel(InjectionParser.OpSelContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#opUni}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpUni(InjectionParser.OpUniContext ctx);
	/**
	 * Visit a parse tree produced by {@link InjectionParser#opSem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpSem(InjectionParser.OpSemContext ctx);
}