# Week 4 Notes

## Booleans

Boolean expressions are used in control flow statements like if and while.

Comparisons result in booleans:

- numbers can be compared with >, >=, <, <=, ==, !=
- booleans can be compared with ==, != (usually no point in doing this)
- Strings can be compared with .equals(...)

Boolean Logic: && (AND), || (OR),  ! (NOT)

- a && b: true when both operands are true; false otherwise
- a || b: true when at least one operand is true; false otherwise
- !a: opposite of a

True Table

A | B | A && B | A || B | !A | !B
--+---+--------+--------+----+---
T | T | T      | T      | F  | F
T | F | F      | T      | F  | T
F | T | F      | T      | T  | F
F | F | F      | F      | T  | T

How do we ask whether x in between 0 and 50 (inclusive)?

Wrong: 0 <= x <= 50

0 <= x is true or false, let's say true for this example

true <= 50

Right: 0 <= x && x <= 50

### Assignment vs Equality

- Assignment op: =
	- assign a value to a variable
	- not a comparison
	- does not evaluate to true/false
	- do not use in boolean expresions
- Equality op: ==
	- compares two values
	- evaluates to true/false
	- used in boolean expressions
	- not for assigning to a variable

