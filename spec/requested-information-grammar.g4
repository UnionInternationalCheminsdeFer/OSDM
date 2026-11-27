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
    : Attribute (Opening_Index_Bracket index Closing_Index_Bracket)? (Point Attribute)+
    ;

index
    : Any
    | Number
    ;

// Any and Number must be declared before Attribute: ANTLR resolves
// equally long matches in favour of the rule declared first.
Any
    : 'ANY'
    ;

Number
    : [0-9]+
    ;

Attribute
    : [a-zA-Z_]+
    ;

WS
    : [ \t\r\n]+ -> skip
    ;
