# Week 4 Notes

## Booleans

Boolean expressions are used in control flow statements like if and while.

Comparisons result in true or false:

- Comparison operators for numbers: >, >=, <, <=, ==, !=
- Comparison operators for booleans: ==, !=
- Strings use the .equals(string) method

Boolean logic: && (AND), || (OR), ! (NOT)

- AND: results in true only when both operands are true
- OR: results in true when at least one operand is true
- NOT: unary operator, results in the opposite of the operand

Truth table

A | B | A && B | A || B | !A | !B
--+---+--------+--------+----+---
T | T | T      | T      | F  | F
T | F | F      | T      | F  | T
F | T | F      | T      | T  | F
F | F | F      | F      | T  | T

How not to use comparisons:

0 <= x <= 50

0 <= x is either true or false, let's say true

we now have to evaluate true <= 50

How to fix this:

0 <= x && x <= 50

### Assignment vs Equality Operators

- Assignment operator: =
	- Does not result in true/false, don't use for comparisons
	- This is for assigning a value to a variable
- Equality operator: ==
	- Compares two values and evaluates to true or false
	- Use this in comparisons
	- Do not use this to reassign variables

