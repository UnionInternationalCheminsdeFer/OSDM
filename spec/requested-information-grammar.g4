grammar RequestedInformation;

And_Operator : 'AND';
Or_Operator : 'OR';
Opening_Index_Bracket: '[';
Closing_Index_Bracket: ']';
Opening_Bracket: '(';
Closing_Bracket: ')';
Point: '.';

requested_informations: requested_information+ EOF;

requested_information
    : class_index_attribute
    | requested_information And_Operator requested_information
    | requested_information Or_Operator requested_information
    | Opening_Bracket requested_information Closing_Bracket
    ;

class_index_attribute
    : Attribute Opening_Index_Bracket Identifier Closing_Index_Bracket (Point Attribute)+
    ;

Attribute
    : [a-zA-Z_]+
    ;

Identifier
    : 'ANY'
    ;

boolean_operator
    : And_Operator
    | Or_Operator
    ;

WS
    : [ \t\r\n]+ -> skip
    ;
