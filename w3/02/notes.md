# Week 3 Notes

## Types

- everything on the computer is binary (1s and 0s)
- types tell the computer how to interpret this data
- Java is "statically typed"
	- static typing: a variable's type cannot change
	- dynamic typing: a variable's type can change
	- Java, C++, C#, Rust are examples of statically typed languages
	- Javascript, Python, Lua, Lisp are all dynamically typed languages
- String, int, double are the types we care about right now

## Syntax

- statements vs expressions
	- statement: a complete instruction, does something, usually ends with a semicolon
	- expression: has a type an value; something that can be evaluated
		- 5, 2.5, "hello" are all expressions
		- 2 + 2, IO.readln(...) are expressions
		- x, y, z (if these variables exist) are expressions
- literals
	- literal: information is written directly in your code (a hard-coded value)
	- variables: variable's name is in the code, information is stored in the variable
	- normally specify the type of literal:
		- "hello world" is a String literal
		- 10.3 is a double literal
		- 10 is an int literal
- operators
	- symbols such as +, -, *, /, %
	- represent an operation that can be performed on one or more operands
	- unary operators take one operand, binary operators take two operands
		- +3, -x use + and - as unary operators
		- 2 + 2 and x / 3 use + and / as binary operators
- identifiers
	- names for functions and variables
	- rules for identifiers:
		- only contains letters, digits, underscores, and dollar signs
		- don't start with a digit
	- Java convention: use lowerCamelCase for variable and function names

## Variables

- two ways to create a variable:

// implicitly typed variable: Java infers type from initial value
var x = 5;
// explicitly typed variable: we write the type
int x = 5;

- declare vs init vs assignment
	- declaring a variable creates it
	- initializing a variable assigns its first value
	- assigning to a variable is setting its value

// declare and init (should be your default)
int x = 5;
// declare without init
double y;
// initialize y
y = 10.0;

// can't use an unintialized variable in an expression
String z;
IO.println(z); // error!

### Assignment Operator

The = symbol is the assignment operator. Assignment is not equality.

In a math class...

x = 5
x = 6

This would be a contradiction! x can't be equal to 5 and 6.

As programmers...

x = 5
x = 6

This is fine. This means "store the number 5 in x, then overwrite it with the number 6"

## Conversions

- implicit
	- Java will automatically convert between types when the conversion isn't lossy
	  (doesn't risk losing information)
	- int -> double
	- anything -> String (during concatenation)
- explicit
	- cast double to int wth (int)2.5
	- functions that parse Strings into other types
		- Integer.parseInt(a string that represents an int)
		- Double.parseDouble(a strings the represents a double)
