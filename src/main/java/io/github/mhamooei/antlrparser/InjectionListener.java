// Generated from /home/mhit/IdeaProjects/MlSqliTester/src/main/resources/Injection.g4 by ANTLR 4.7.2
package io.github.mhamooei.antlrparser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link InjectionParser}.
 */
public interface InjectionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link InjectionParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(InjectionParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(InjectionParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#dQuoteContext}.
	 * @param ctx the parse tree
	 */
	void enterDQuoteContext(InjectionParser.DQuoteContextContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#dQuoteContext}.
	 * @param ctx the parse tree
	 */
	void exitDQuoteContext(InjectionParser.DQuoteContextContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#sQuoteContext}.
	 * @param ctx the parse tree
	 */
	void enterSQuoteContext(InjectionParser.SQuoteContextContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#sQuoteContext}.
	 * @param ctx the parse tree
	 */
	void exitSQuoteContext(InjectionParser.SQuoteContextContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#numericContext}.
	 * @param ctx the parse tree
	 */
	void enterNumericContext(InjectionParser.NumericContextContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#numericContext}.
	 * @param ctx the parse tree
	 */
	void exitNumericContext(InjectionParser.NumericContextContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#sqliAttack}.
	 * @param ctx the parse tree
	 */
	void enterSqliAttack(InjectionParser.SqliAttackContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#sqliAttack}.
	 * @param ctx the parse tree
	 */
	void exitSqliAttack(InjectionParser.SqliAttackContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#piggyAttack}.
	 * @param ctx the parse tree
	 */
	void enterPiggyAttack(InjectionParser.PiggyAttackContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#piggyAttack}.
	 * @param ctx the parse tree
	 */
	void exitPiggyAttack(InjectionParser.PiggyAttackContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#unionAttack}.
	 * @param ctx the parse tree
	 */
	void enterUnionAttack(InjectionParser.UnionAttackContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#unionAttack}.
	 * @param ctx the parse tree
	 */
	void exitUnionAttack(InjectionParser.UnionAttackContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#union}.
	 * @param ctx the parse tree
	 */
	void enterUnion(InjectionParser.UnionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#union}.
	 * @param ctx the parse tree
	 */
	void exitUnion(InjectionParser.UnionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#unionPostfix}.
	 * @param ctx the parse tree
	 */
	void enterUnionPostfix(InjectionParser.UnionPostfixContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#unionPostfix}.
	 * @param ctx the parse tree
	 */
	void exitUnionPostfix(InjectionParser.UnionPostfixContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#cols}.
	 * @param ctx the parse tree
	 */
	void enterCols(InjectionParser.ColsContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#cols}.
	 * @param ctx the parse tree
	 */
	void exitCols(InjectionParser.ColsContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#distinct}.
	 * @param ctx the parse tree
	 */
	void enterDistinct(InjectionParser.DistinctContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#distinct}.
	 * @param ctx the parse tree
	 */
	void exitDistinct(InjectionParser.DistinctContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#all}.
	 * @param ctx the parse tree
	 */
	void enterAll(InjectionParser.AllContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#all}.
	 * @param ctx the parse tree
	 */
	void exitAll(InjectionParser.AllContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#t1}.
	 * @param ctx the parse tree
	 */
	void enterT1(InjectionParser.T1Context ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#t1}.
	 * @param ctx the parse tree
	 */
	void exitT1(InjectionParser.T1Context ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#t2}.
	 * @param ctx the parse tree
	 */
	void enterT2(InjectionParser.T2Context ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#t2}.
	 * @param ctx the parse tree
	 */
	void exitT2(InjectionParser.T2Context ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#t3}.
	 * @param ctx the parse tree
	 */
	void enterT3(InjectionParser.T3Context ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#t3}.
	 * @param ctx the parse tree
	 */
	void exitT3(InjectionParser.T3Context ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#t4}.
	 * @param ctx the parse tree
	 */
	void enterT4(InjectionParser.T4Context ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#t4}.
	 * @param ctx the parse tree
	 */
	void exitT4(InjectionParser.T4Context ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#t5}.
	 * @param ctx the parse tree
	 */
	void enterT5(InjectionParser.T5Context ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#t5}.
	 * @param ctx the parse tree
	 */
	void exitT5(InjectionParser.T5Context ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#booleanAttack}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAttack(InjectionParser.BooleanAttackContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#booleanAttack}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAttack(InjectionParser.BooleanAttackContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#andAttack}.
	 * @param ctx the parse tree
	 */
	void enterAndAttack(InjectionParser.AndAttackContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#andAttack}.
	 * @param ctx the parse tree
	 */
	void exitAndAttack(InjectionParser.AndAttackContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#orAttack}.
	 * @param ctx the parse tree
	 */
	void enterOrAttack(InjectionParser.OrAttackContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#orAttack}.
	 * @param ctx the parse tree
	 */
	void exitOrAttack(InjectionParser.OrAttackContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#booleanFalseExpr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanFalseExpr(InjectionParser.BooleanFalseExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#booleanFalseExpr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanFalseExpr(InjectionParser.BooleanFalseExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#unaryFalse}.
	 * @param ctx the parse tree
	 */
	void enterUnaryFalse(InjectionParser.UnaryFalseContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#unaryFalse}.
	 * @param ctx the parse tree
	 */
	void exitUnaryFalse(InjectionParser.UnaryFalseContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#falseAtom}.
	 * @param ctx the parse tree
	 */
	void enterFalseAtom(InjectionParser.FalseAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#falseAtom}.
	 * @param ctx the parse tree
	 */
	void exitFalseAtom(InjectionParser.FalseAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#falseConst}.
	 * @param ctx the parse tree
	 */
	void enterFalseConst(InjectionParser.FalseConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#falseConst}.
	 * @param ctx the parse tree
	 */
	void exitFalseConst(InjectionParser.FalseConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#booleanTrueExpr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanTrueExpr(InjectionParser.BooleanTrueExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#booleanTrueExpr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanTrueExpr(InjectionParser.BooleanTrueExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#binaryTrue}.
	 * @param ctx the parse tree
	 */
	void enterBinaryTrue(InjectionParser.BinaryTrueContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#binaryTrue}.
	 * @param ctx the parse tree
	 */
	void exitBinaryTrue(InjectionParser.BinaryTrueContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#unaryTrue}.
	 * @param ctx the parse tree
	 */
	void enterUnaryTrue(InjectionParser.UnaryTrueContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#unaryTrue}.
	 * @param ctx the parse tree
	 */
	void exitUnaryTrue(InjectionParser.UnaryTrueContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#trueAtom}.
	 * @param ctx the parse tree
	 */
	void enterTrueAtom(InjectionParser.TrueAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#trueAtom}.
	 * @param ctx the parse tree
	 */
	void exitTrueAtom(InjectionParser.TrueAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#trueConst}.
	 * @param ctx the parse tree
	 */
	void enterTrueConst(InjectionParser.TrueConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#trueConst}.
	 * @param ctx the parse tree
	 */
	void exitTrueConst(InjectionParser.TrueConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#wsp}.
	 * @param ctx the parse tree
	 */
	void enterWsp(InjectionParser.WspContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#wsp}.
	 * @param ctx the parse tree
	 */
	void exitWsp(InjectionParser.WspContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#cmt}.
	 * @param ctx the parse tree
	 */
	void enterCmt(InjectionParser.CmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#cmt}.
	 * @param ctx the parse tree
	 */
	void exitCmt(InjectionParser.CmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#hashtag}.
	 * @param ctx the parse tree
	 */
	void enterHashtag(InjectionParser.HashtagContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#hashtag}.
	 * @param ctx the parse tree
	 */
	void exitHashtag(InjectionParser.HashtagContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#doubleDash}.
	 * @param ctx the parse tree
	 */
	void enterDoubleDash(InjectionParser.DoubleDashContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#doubleDash}.
	 * @param ctx the parse tree
	 */
	void exitDoubleDash(InjectionParser.DoubleDashContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#funcSleep}.
	 * @param ctx the parse tree
	 */
	void enterFuncSleep(InjectionParser.FuncSleepContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#funcSleep}.
	 * @param ctx the parse tree
	 */
	void exitFuncSleep(InjectionParser.FuncSleepContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#sleep}.
	 * @param ctx the parse tree
	 */
	void enterSleep(InjectionParser.SleepContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#sleep}.
	 * @param ctx the parse tree
	 */
	void exitSleep(InjectionParser.SleepContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#blank}.
	 * @param ctx the parse tree
	 */
	void enterBlank(InjectionParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#blank}.
	 * @param ctx the parse tree
	 */
	void exitBlank(InjectionParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#inlineCmt}.
	 * @param ctx the parse tree
	 */
	void enterInlineCmt(InjectionParser.InlineCmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#inlineCmt}.
	 * @param ctx the parse tree
	 */
	void exitInlineCmt(InjectionParser.InlineCmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#parOpen}.
	 * @param ctx the parse tree
	 */
	void enterParOpen(InjectionParser.ParOpenContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#parOpen}.
	 * @param ctx the parse tree
	 */
	void exitParOpen(InjectionParser.ParOpenContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#par}.
	 * @param ctx the parse tree
	 */
	void enterPar(InjectionParser.ParContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#par}.
	 * @param ctx the parse tree
	 */
	void exitPar(InjectionParser.ParContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#terOne}.
	 * @param ctx the parse tree
	 */
	void enterTerOne(InjectionParser.TerOneContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#terOne}.
	 * @param ctx the parse tree
	 */
	void exitTerOne(InjectionParser.TerOneContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#terSQuote}.
	 * @param ctx the parse tree
	 */
	void enterTerSQuote(InjectionParser.TerSQuoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#terSQuote}.
	 * @param ctx the parse tree
	 */
	void exitTerSQuote(InjectionParser.TerSQuoteContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#terDQuote}.
	 * @param ctx the parse tree
	 */
	void enterTerDQuote(InjectionParser.TerDQuoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#terDQuote}.
	 * @param ctx the parse tree
	 */
	void exitTerDQuote(InjectionParser.TerDQuoteContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#terDigitZero}.
	 * @param ctx the parse tree
	 */
	void enterTerDigitZero(InjectionParser.TerDigitZeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#terDigitZero}.
	 * @param ctx the parse tree
	 */
	void exitTerDigitZero(InjectionParser.TerDigitZeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#terDigitOne}.
	 * @param ctx the parse tree
	 */
	void enterTerDigitOne(InjectionParser.TerDigitOneContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#terDigitOne}.
	 * @param ctx the parse tree
	 */
	void exitTerDigitOne(InjectionParser.TerDigitOneContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#terDigitExcludingZero}.
	 * @param ctx the parse tree
	 */
	void enterTerDigitExcludingZero(InjectionParser.TerDigitExcludingZeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#terDigitExcludingZero}.
	 * @param ctx the parse tree
	 */
	void exitTerDigitExcludingZero(InjectionParser.TerDigitExcludingZeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#terDigitIncludingZero}.
	 * @param ctx the parse tree
	 */
	void enterTerDigitIncludingZero(InjectionParser.TerDigitIncludingZeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#terDigitIncludingZero}.
	 * @param ctx the parse tree
	 */
	void exitTerDigitIncludingZero(InjectionParser.TerDigitIncludingZeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#terChar}.
	 * @param ctx the parse tree
	 */
	void enterTerChar(InjectionParser.TerCharContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#terChar}.
	 * @param ctx the parse tree
	 */
	void exitTerChar(InjectionParser.TerCharContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#opNot}.
	 * @param ctx the parse tree
	 */
	void enterOpNot(InjectionParser.OpNotContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#opNot}.
	 * @param ctx the parse tree
	 */
	void exitOpNot(InjectionParser.OpNotContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#opBinInvert}.
	 * @param ctx the parse tree
	 */
	void enterOpBinInvert(InjectionParser.OpBinInvertContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#opBinInvert}.
	 * @param ctx the parse tree
	 */
	void exitOpBinInvert(InjectionParser.OpBinInvertContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#opEqual}.
	 * @param ctx the parse tree
	 */
	void enterOpEqual(InjectionParser.OpEqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#opEqual}.
	 * @param ctx the parse tree
	 */
	void exitOpEqual(InjectionParser.OpEqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#opLt}.
	 * @param ctx the parse tree
	 */
	void enterOpLt(InjectionParser.OpLtContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#opLt}.
	 * @param ctx the parse tree
	 */
	void exitOpLt(InjectionParser.OpLtContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#opGt}.
	 * @param ctx the parse tree
	 */
	void enterOpGt(InjectionParser.OpGtContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#opGt}.
	 * @param ctx the parse tree
	 */
	void exitOpGt(InjectionParser.OpGtContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#opLike}.
	 * @param ctx the parse tree
	 */
	void enterOpLike(InjectionParser.OpLikeContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#opLike}.
	 * @param ctx the parse tree
	 */
	void exitOpLike(InjectionParser.OpLikeContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#opIs}.
	 * @param ctx the parse tree
	 */
	void enterOpIs(InjectionParser.OpIsContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#opIs}.
	 * @param ctx the parse tree
	 */
	void exitOpIs(InjectionParser.OpIsContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#opMinus}.
	 * @param ctx the parse tree
	 */
	void enterOpMinus(InjectionParser.OpMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#opMinus}.
	 * @param ctx the parse tree
	 */
	void exitOpMinus(InjectionParser.OpMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#opOr}.
	 * @param ctx the parse tree
	 */
	void enterOpOr(InjectionParser.OpOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#opOr}.
	 * @param ctx the parse tree
	 */
	void exitOpOr(InjectionParser.OpOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#opAnd}.
	 * @param ctx the parse tree
	 */
	void enterOpAnd(InjectionParser.OpAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#opAnd}.
	 * @param ctx the parse tree
	 */
	void exitOpAnd(InjectionParser.OpAndContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#opSel}.
	 * @param ctx the parse tree
	 */
	void enterOpSel(InjectionParser.OpSelContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#opSel}.
	 * @param ctx the parse tree
	 */
	void exitOpSel(InjectionParser.OpSelContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#opUni}.
	 * @param ctx the parse tree
	 */
	void enterOpUni(InjectionParser.OpUniContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#opUni}.
	 * @param ctx the parse tree
	 */
	void exitOpUni(InjectionParser.OpUniContext ctx);
	/**
	 * Enter a parse tree produced by {@link InjectionParser#opSem}.
	 * @param ctx the parse tree
	 */
	void enterOpSem(InjectionParser.OpSemContext ctx);
	/**
	 * Exit a parse tree produced by {@link InjectionParser#opSem}.
	 * @param ctx the parse tree
	 */
	void exitOpSem(InjectionParser.OpSemContext ctx);
}