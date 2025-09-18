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

## If Statements

Structure:

```
// if
if (condition) {
	if_body
}

// if-else
if (condition) {
	if_body
} else {
	else_body
}
```

- if and else are Java keywords
- the condition is a boolean expression and must be wrapped in parenthesis
- the if_body is one or more statements and will only be executed if the condition evaluates to true
- the else_body is one or more statements and will only be executed if the condition evaluates to false
- else is optional; you can have an if statement with no else

## While Statements (While Loops)

Structure:

```
while (condition) {
	while_body
}
```

- while is a keyword
- the condition is a boolean expression wrapped in parenthesis, just like if
- the body is one or more statements
- if the condition evaluates to true, then the body will execute and this process will repeat
- every time the condition is true, we re-evaluate after the body and potentially keep repeating the process indefinitely

To end a running program stuck in a loop, ctrl+c (even on Mac it's control, not command)

## Counting Loop

If you know how many times a loop must repeat or can calculate it while the program is running, then you may want to use this pattern:

```
// init: create a counter variable and initialize it to 0
int i = 0;
// condition: check whether the counter variable is less than the desired number of repetitions
while (i < repetitions) {
	// body: whatever the loop does
	
	// update: increment the counter variable (increase its value by 1)
	i = i + 1;
}
```
