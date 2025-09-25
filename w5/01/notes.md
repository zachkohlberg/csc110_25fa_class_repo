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
- return is normally followed by an expression; this expression
  is evaluated and the result is returned to the calling code
- if a function's return type is `void`, then we don't have
  to explicitly return (happens at the end of the function)
- if a function's return type isn't `void`, then it must be
  guaranteed to return a value of that type

## Variable Scope

- scope = part of the program a variable is valid
- normally, scope is the block in which we declare the variable
- function parameters are scoped to the function's body/implementation
- separate functions have completely different scopes, so you can
  reuse names between functions with no conflict
- parameter names never have to match argument names: you can supply
  a variable named x for a parameter named age as long as the types
  are compatible

## Arrays

- don't print array variables directly
- the benefit of arrays is that we can batch process them with a counting loop,
  which scales much better than writing the same code for individual variables


