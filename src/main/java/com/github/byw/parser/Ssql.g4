grammar Ssql;

statements : tableName '--' expression ( logic expression )* ;
expression: commonExpression | sortExpression | limitExpression;
commonExpression: fieldName compareCondition value;
sortExpression: fieldName sortCondition;
limitExpression: limitCondition value;

logic : ';'|',';// ; 是 and , 是 or
VALUE_STRING : '\'' (STRING|LIKE_STRING) '\'';
compareCondition : '=' | '>' | '>=' | '<' | '<=' | '=like=';
sortCondition : '->' | '<-' ;
limitCondition : '<->';
tableName : STRING | STRING + '.' + STRING; //schema
fieldName : STRING;
value : VALUE_STRING | NUMBER | INTERVAL;
NUMBER : '-'? INT ('.' [0-9] +)? EXP?;
STRING : ID_LITERAL;
LIKE_STRING : ('*')? STRING ('*')?;
INTERVAL : '(' NUMBER','NUMBER ')' ;

fragment INT : '0' | [1-9] [0-9]*;
fragment EXP: [Ee] [+\-]? INT;
fragment ID_LITERAL:[A-Za-z_$0-9\u0080-\uFFFF]*?[A-Za-z_$\u0080-\uFFFF]+?[A-Za-z_$0-9\u0080-\uFFFF]*;

WS : [ \t\r\n]+ -> skip;