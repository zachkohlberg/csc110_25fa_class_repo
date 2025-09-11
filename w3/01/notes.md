# Week 3 Notes

## Types

- For now, our types are: String, int, double
- Types tell the computer how to interpret binary data

Declaring a variable with an explicit type:

int x = 5;
double y = 3.14;
String z = "Hello World";

instead of:

var x = 5; // infers type based on initial value: int

- Java is "statically typed"
	- all variables have a type
	- variables can only store data of their type
	- opposite is dynamic typing
		- Javascript, Python, Lua, Lisp all use dynamic typing
		- Java, C#, C++, Rust all use static typing

// illegal!
int x = 5;
x = "Hello World";

## Syntax

- statements vs expressions
	- statement: a complete instruction, does something, normally ends in a semicolon
	- expression: a value, variable, or more complex that must be evaluated; results in a value with a type

Expression examples:

- 5
- 3.14
- "Hello World"
- a variable: x, y, etc.
- more complex, requires computation: 5 + 3, x * y

- jshell is great for checking the result of expressions
- where we've already used expressions:
	- initial value for a variable
	- new value when reassinging a variable
	- whenever we call IO.print, IO.println, IO.readln
- statements we've already used
	- creating and reassinging variables
	- calling one of the IO functions

- literals
	- literal values are written directly into our code
	- 5, 3.14, "Hello World" are all literals
	- literals are expressions and can be used as part of a larger expression
	- literals have a type, just like other expresions
	- normally refer to them by type; "an integer literal" or "a string literal"
- operators
	- symbols used to operate on expressions
	- most are binary operators (require two operands)
		- example: + operator can add two numbers (2 + 2)
	- several unary operators (only involve one operand)
		- example: - operator can negate one number (-5)
- identifiers: names assigned to variables, functions, etc.
	- can contain letters and numbers (also underscores and dollar signs)
	- cannot start with a number
	- no spaces!
	- cannot be a keyword (word with special meaning in the language, like int or if)

variable and function call syntax:

int x = 5;
IO.println(x);

- variable creation:
	- type identifier = initial value;
- function call:
	- identifier(arguments);
	- namespace.identifier(arguments);
	- IO is the namespace, println is the identifier

## Variables

- declaration, initialization, and assignment
	- declare: create a variable
	- initialize: assign the first value to a variable
	- assign: set the value stored in a variable

// declare and initialize
int x = 5;

// declare only
int y;
// initialize
y = 5;

// can't use an uninitialized variable in an expression
int z;
IO.println(z); // error!!

// reassigning initialized variables
x = 10;
y = x * 2;

### Assignment Operator

= is an operator
	- "a = b" means store the result of evaluating the expression b in the variable a

this is not math class:

x = 5
x = 6

in algebra, this is just a contradiction (x can't be equal to 5 and 6)

in programming:

x = 5
x = 6

this just means set x to 5, then change it to 6

## Conversions

- implicit, cast, parse functions
- cast from double to int:

(int) _double_expression_

- parse functions: attempt to convert from String to int or double
	- these can fail if the string doesn't represent a number ("abc" for example)
	- failure causes a NumberFormatException, which will crash the program

Integer.parseInt(a string) // returns an int
Double.parseDouble(a string) // returns a double
