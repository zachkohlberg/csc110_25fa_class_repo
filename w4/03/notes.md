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

## If Statements

If structure:

```
if (condition) {
	if_body
}

if (condition) {
	if_body
} else {
	else_body
}
```

- if and else are keywords
- the condition is a boolean expression wrapped in parenthesis
- the if_body and else_body are one or more statements
- if the condition evaluates to true, then we execute the if_body
- if the condition evaluates to false, then we execute the else_body (if we have one)

## While Statement (While Loop)

While structure:

```
while (condition) {
	while_body
}
```

- while is a keyword (just like if)
- the condition is a boolean expression in parenthesis (like if)
- the body is one or more statements (like if)
- if the condition is true, then the body is executed and this process repeats
- if the condition is false, then we move on

## Counting Loop

When to use one:

- You know how many times the loop should repeat.
- Your code can calculate how many times the loop should repeat.

```
// init: create a counter variable and set it to 0
int i = 0;
// condition: the counter is less than the desired number of repetitions
while (i < repetitions) {
	// body: whatever the loop is repeating
	
	// update: increment the counter (increase its value by 1)
	i = i + 1;
}
```
