grammar pccsl;
cons : cons con  | con ;
con :   subclock | causality | union | infimum | exclusion | precedence | intersection
        | supremum | periodicity | delayfpr | pedoff | pedjitter | peddrify  ;

periodicity : CLOCK DEFINE CLOCK PED PAR 'and' NUM  CAU PAR CAU NUM  END ;
delayfpr : CLOCK DEFINE CLOCK DEL PAR 'on' CLOCK 'and' NUM CAU PAR  CAU NUM  END ;
subclock : CLOCK SUB CLOCK END;
causality : CLOCK CAU CLOCK END;
union : CLOCK DEFINE CLOCK UNI CLOCK END;
infimum: CLOCK DEFINE CLOCK INF CLOCK END;
exclusion : CLOCK EXC CLOCK END;
precedence : CLOCK '[' NUM ']' PRE CLOCK END;
intersection : CLOCK DEFINE CLOCK CON CLOCK END;
supremum : CLOCK DEFINE CLOCK SUP CLOCK END;
pedoff : CLOCK DEFINE CLOCK PED  NUM 'with' NUM  END ;
pedjitter: CLOCK DEFINE CLOCK PED  NUM '+-' NUM  END ;
peddrify: CLOCK DEFINE CLOCK PED  NUM '-+' NUM  END ;

END : ';' ;
SUB : 'in';
CAU : '<=' ;
UNI : '+';
INF : '^' ;
PED : 'P' ;
DEL : '$' ;
EXC : '#' ;
PRE : '<' ;
CON : '*' ;
SUP : 'v' ;
DEFINE : '=' ;
PAR : [a-z] ;
CLOCK : [a-zA-Z]([0-9a-zA-Z])* ;
NUM : [0-9]+ ;

WS : [ \t\n\r]+ ->skip ;
