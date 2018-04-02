grammar GramaticaSQL;
CREATE: 'create'|'CREATE'|'Create';
DATABASE: 'database'|'DATABASE'|'Database';
DATABASES: 'databases'|'DATABASES'|'Databases';
ALTER: 'alter'|'ALTER'|'Alter';
RENAME: 'rename'|'RENAME'|'Rename';
DROP: 'drop'|'DROP'|'Drop';
TO: 'to'|'TO'|'To';
SHOW: 'show'|'SHOW'|'Show';
USE: 'use'|'USE'|'Use';
CONSTRAINT: 'constraint'|'CONSTRAINT'|'Constraint';
PRIMARY: 'primary'|'PRIMARY'|'Primary';
FOREIGN: 'foreign'|'FOREIGN'|'Foreign';
KEY: 'key'|'KEY'|'Key';
REFERENCES: 'references'|'REFERENCES'|'References';
CHECK: 'check'|'CHECK'|'Check';
INT: 'int'|'INT'|'Int';
FLOAT: 'float'|'FLOAT'|'Float';
DATE: 'date'|'DATE'|'Date';
CHAR: 'char'|'CHAR'|'Char';
AND: 'and'|'AND'|'And';
OR: 'or'|'OR'|'Or';
NOT: 'not'|'NOT'|'Not';
TABLE: 'table'|'TABLE'|'Table';
TABLES: 'tables'|'TABLES'|'Tables';
ADD: 'add'|'ADD'|'Add';
COLUMN: 'column'|'COLUMN'|'Column';
COLUMNS: 'columns'|'COLUMNS'|'Columns';
SHOWX: 'show'|'SHOW'|'Show';
FROM: 'from'|'FROM'|'From';
INSERT: 'insert'|'INSERT'|'Insert';
SELECT: 'select'|'SELECT'|'Select';
VALUES: 'values'|'VALUES'|'Values';
INTO: 'into'|'INTO'|'Into';
UPDATE: 'update'|'UPDATE'|'Update';
SET : 'set'|'SET'|'Set';
WHERE: 'where'|'WHERE'|'Where';
DELETE: 'delete'|'DELETE'|'Delete';
ORDER: 'order'|'ORDER'|'Order';
BY: 'by'|'BY'|'By';
ASC: 'asc'|'ASC'|'Asc';
DESC: 'desc'|'DESC'|'Desc';
NULL: 'null'|'NULL'|'Null';


APOS: '\'';

DIGIT_four: DIGIT DIGIT DIGIT DIGIT;
DIGIT_two: DIGIT DIGIT;


DIGIT: [0-9];

NUMX: [0-9][0-9]*;





CHARX: [a-zA-Z];

IDX: ([a-zA-Z])([a-zA-Z0-9]|'_')*;
WORD: ([a-zA-Z0-9]|'#'|'^') ([a-zA-Z0-9]|'#'|'^')*;










literal : int_literal | float_literal | char_literal | date_literal | NULL ;

int_literal: (NUMX|DIGIT|DIGIT_four|DIGIT_two);

float_literal: (NUMX|DIGIT|DIGIT_four|DIGIT_two) '.' (NUMX|DIGIT|DIGIT_four|DIGIT_two);

char_literal: APOS ( CHARX|IDX|WORD|NUMX|DIGIT|DIGIT_four|DIGIT_two) APOS ;

date_literal: APOS DIGIT_four '-' DIGIT_two '-' DIGIT_two APOS ;



COMMENT: '\\' ~( '\r' | '\n' )*;
WS: [ \t\r\n]+ -> skip;






//fragment LETTERX: ('A'..'Z'|'a'..'z');





//fragment SPACEX: (' '|'\n'|'\t'|'\f'|'\r\n'|'\r');
//WS: SPACEX+ {skip();};

//SPACEX: (' '|'\n'|'\t'|'\f'|'\r\n'|'\r'){skip();};


//COMMENTX: '//'(~('\r'|'\n'))*{skip();};



programa: database|(database)*;

database:
	(createDatabase
	|alterDatabase
	|dropDatabase
	|showDatabase
	|useDatabase
	|createTable
	|alterTable
	|alterModifyTable
	|dropTable
	|showTables
	|showColumns
	|insertInto
	|updateSet
	|deleteFrom
	|selectFrom);

createDatabase: CREATE DATABASE IDX;

alterDatabase: ALTER DATABASE IDX RENAME TO IDX;

dropDatabase: DROP DATABASE IDX;

showDatabase: SHOW DATABASES;

useDatabase: USE DATABASE IDX;

tipo: INT|FLOAT|DATE|CHAR '(' (NUMX|DIGIT|DIGIT_four|DIGIT_two)* ')' ;

createTable: CREATE TABLE IDX '(' columna (',' columna)* ( CONSTRAINT constraint)*')';

columna: IDX tipo;

constraint: primaryKey | foreignKey | check;

primaryKey: IDX PRIMARY KEY '(' IDX (','IDX)* ')';

foreignKey: IDX FOREIGN KEY '(' IDX ')' REFERENCES IDX '(' IDX ')' ;

check: IDX CHECK (exp);

exp: (cond | notOp) ;

location: IDX ;

operacion: location | literal;

cond:
	(rel | notOp ) (cond_op (rel | notOp ))* ;

rel:
	(operacion) (rel_op operacion)? ;

notOp: (NOT)? '('(rel|cond)')';

alterTable: ALTER TABLE IDX RENAME TO IDX ;

alterModifyTable: ALTER TABLE IDX action (',' action)* ;

action:
	addColumn |
	addConstraint |
	dropConstraint |
	dropColumn;

addColumn: ADD COLUMN columna (CONSTRAINT constraint (',' CONSTRAINT constraint)*)? ;

addConstraint: ADD CONSTRAINT constraint;

dropColumn: DROP COLUMN IDX;

dropConstraint: DROP CONSTRAINT IDX ;


dropTable: DROP TABLE IDX;

showTables: SHOW TABLES;

showColumns: SHOW COLUMNS FROM IDX ;


// Gramatica para parte 2

insertInto: INSERT INTO IDX ('(' IDX (',' IDX)*')')? VALUES '(' literal (',' literal)* ')';

updateSet: UPDATE IDX SET updateColumas (WHERE exp)? ;
updateColumas: cambio (',' cambio)*;
cambio: IDX '=' literal;


deleteFrom: DELETE FROM IDX (WHERE exp)? ;

selectFrom: SELECT cols FROM tabs (WHERE exp)? (orden)? ;

orden: ORDER BY colOrder (',' colOrder)* ;

colOrder: location (ASC|DESC)? ;

cols: '*' | location(',' location)*;

tabs: IDX (',' IDX)*;


// Operadores rel y eq

rel_op: '<' | '>' | '<=' | '>='| '='|'<>';

cond_op : AND | OR ;