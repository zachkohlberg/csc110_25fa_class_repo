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
- the condition is a boolean expression, must be inside parenthesis
- the if_body and else_body are blocks of one or more statements
- if the condition evaluates to true, then the if_body is executed
- if the condition evaluates to false, then the else_body is executed (if it exists)

## While Statements (While Loops)

While structure:

```
while (condition) {
	while_body
}
```

- while is a keyword (just like if)
- the condition is a boolean expression in parenthesis (just like if)
- the body is one or more statements in a code block (just like if)
- if the condition is true, then the body is executed and this whole process repeats
- if the condition is false, then the body is not executed and the program continues

## Counting Loop

When to use it?

- You want a loop to repeat a specific number of times.
- Your program can calculate the number of repetitions.

```
// init: declare and set a counter variable to 0
int i = 0;
// condition: the counter variable is less than the number of repetitions
while (i < repetitions) {
	// body: whatever else the loop does
	
	// update: increment (increase by 1) the counter at the end of the body
	i = i + 1;
}
```
