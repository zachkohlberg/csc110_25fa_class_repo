# Week 3 Notes

## Types

- computers only work with 1s and 0s (binary)
- types tell the compiler how to interpret binary data
- for now, we're using int, double, String
- Java uses static typing
	- in statically typed languages, the type of a variable is fixed when you create it
	- in dynamicaly typed languages, a variable's type can change
	- Java, C++, C#, Rust are all statically typed languages
	- Javascript, Python, Lua, Lisp are dynamically typed

## Syntax Terms

- statement vs expression
	- statement: a complete instruction; normally ends with semicolon
	- expression: evaluates to a result; has a value and a type
		- 5, 2.5, "Hello World" are all expressions
		- 2 + 2, 10 / 3, IO.readln(...) are all expressions
		- variables can be expressions or used in expressions
- literals vs variables
	- literal: the value/information is written directly in the code
	- variable: the variable name represents an unknown value
- operators
	- symbols like +, -, *, /, % that represent operations we can perform in expressions
	- unary operators operate on one value (+3, -x)
	- binary operators operate on two values (2 + 2, 10 / 3)
- identifiers
	- names for functions, variables, etc.
	- rules:
		- only contain letters, digits, underscores, dollar signs
		- can't start with a digit
		- can't be a keyword
	- Java conventions
		- function and variable names are written in lowerCamelCase
		- files are named in UpperCamelCase

## Variables

- var infers variable type
- writing the type before the name explicitly states the type

// implicit typing
var x = 5;
// explicit typing
int x = 5;

- declare, initialize, assign
	- declaring a variable creates the variable
	- initializing a variable sets its initial value (this is also an assignment)
	- assigning to a variable sets its value

// declare and initialize (this should be your default)
int x = 5;
// declare only
double y;
// initialize y
y = 3.14;

// declared, not initialized
String z;
// can't use uninitialized variable in an expression
IO.println(z);

### Assignment Operator

The = symbol is the assignment operator. Assignment means "set a variable equal to a value".

x = 5 // replace the value of x with the number 5

In a math class...

x = 5
x = 6

"x = 5" is stating a fact about x. This is a contradiction. x can't be both 5 and 6.

In a program...

x = 5
x = 6

This is fine. This means "set x to 5", then "set x to 6"

## Conversions

see notes from section 01 or 02
