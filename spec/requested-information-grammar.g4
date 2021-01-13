grammar RequestedInformation;

requested_informations
    : requested_information (boolean_operator requested_information)*
    | boolean_expression
    ;

requested_information
    : boolean_expression_with_brackets boolean_operator boolean_expression_with_brackets
    ;

boolean_expression_with_brackets
    : Opening_Bracket boolean_expression Closing_Bracket
    ;

boolean_expression
    : class_index_attribute boolean_operator class_index_attribute
    ;

class_index_attribute
    : Class Opening_Index_Bracket Identifier Closing_Bracket (Point Attribute)+
    ;

Class
    : [A-Z][a-z_]*[a-z]
    ;

Attribute
    : [a-z_][a-z]*
    ;   

Identifier
    : UUID
    | '0'
    ;

UUID
    : Block Block '-' Block '-' Block '-' Block '-' Block Block Block
    ;

fragment Block
    : [A-Za-z0-9] [A-Za-z0-9] [A-Za-z0-9] [A-Za-z0-9]
    ;

boolean_operator
    : And_Operator
    | Or_Operator
    ;

Opening_Index_Bracket
    : '['
    ;

Closing_Index_Bracket
    : ']'
    ;

Opening_Bracket
    : '('
    ;

Closing_Bracket
    : ')'
    ;

And_Operator
    : 'AND'
    ;

Or_Operator
    : 'OR'
    ;

Point
    : '.'
    ;
