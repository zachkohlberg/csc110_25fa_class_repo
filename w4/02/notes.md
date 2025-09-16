# Week 4 Notes

## Booleans

Boolean expressions are necessary for control flow statements like if and while

Comparisons

- Numbers can be compared with: >, >=, <, <=, ==, !=
- Booleans can be compared with: ==, != (usually no point to doing this)
- Strings can be compared with the .equals(...) method

Boolean Logic: && (AND), || (OR), ! (NOT)

- a && b is true if both a and b are true, otherwise false
- a || b is true if at least one of the operands are true, false if both are false
- !a is the opposite of a

Truth table

A | B | A && B | A || B | !A | !B
--+---+--------+--------+----+---
T | T | T      | T      | F  | F
T | F | F      | T      | F  | T
F | T | F      | T      | T  | F
F | F | F      | F      | T  | T

How would you ask whether x is between 0 and 50 (inclusive)?

Wrong:

0 <= x <= 50

0 <= x is either true or false, let's say true

true <= 50 (error!)

Correct:

0 <= x && x <= 50

### Assignment vs Equality

- assignment op is =
	- used to change the value stored in a variable
	- does not evaluate to true/false
	- do not use this when writing boolean expressions
- equality op is ==
	- used to compare two values
	- evaluates to true/false
	- use this when writing boolean expressions, not for assignments

## If statements

