# Week 5 Notes

## Functions

function: a block of code we can call into by name

terms

- function call: run the code inside of a function
- function definition/implementation: where we define
  the function's return/parameter types and state what
  happens when it's called (always go together)
  - definition/declaration: stating return type, name,
    and parameters (the first line)
  - implementation: the code block containing the code
    that the function runs when called
- parameters (formal parameters): define variables for the
  function's input, what information other code has to
  provide when calling this function
- arguments (actual parameters): values provided when
  calling the function; each argument is assigned to a
  parameter when the function body runs
- return type: type of value function returns
- return: provides a value to the code that called the
  function
- name/identifier: how we refer to the function, just like
  a variable's identifier

## Using Functions

To define a function:

```
type identifier(parameters) {
    implementation
}
```

To call a function:

```
// just the function call
identifier(arguments)

// a void function can be called as a statement
identifier(arguments);

// a non-void function's result should be assigned to
// a variable or used in an expression
variable = identifier(arguments);
```

Returning from a function:

- `return` is a keyword that stops the function execution
- if a function's return type is `void`, then we don't have
  to explicitly return (happens at the end of the function)
- if a function's return type isn't `void`, then it must be
  guaranteed to return a value of that type




