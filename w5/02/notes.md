# Week 5 Notes

## Functions

function: block of code we can run by calling its name

Terms:

- function call: tells the program to execute a function
- function definition/implementation: defines the signature
  of a function and the code that runs when we call it
  - definition/declaration: first line, states return
    type, name (identifier), and parameters
  - implementation: the code block after the definition
- parameters (formal parameters): in definition, define
  variables for any values the function needs from the
  calling code
- arguments (actual parameters): actual values assigned to
  the parameters, provided whenever you call the funciton
- return type: tells us the type of value returned by the
  function
- identifier: same as a variable identifier, how we refer
  to the function

How to write a function:

```
returnType identifier(parameters) {
    implementation
}
```

Returning from a function

- `return` is a keyword, triggers the end of the function
- `return` can be followed by an expression; gives the result
  of that expression to the calling code
- `void` return type indicates no return value
- `void` functions don't need return statements
- if your function has a return type other than `void`,
  then it must guarantee that it ends by returning a value
  of that type

## Scope

- scope: part of a program where a variable exists, normally
  the block in which you declared it
- parameters are scoped to the function's implementation
- functions have separate scopes, so names can be reused
  without conflict
- names of arguments don't need to match names of parameters;
  they can, but it doesn't matter

## Arrays

- can make arrays of any type by putting `[]` after the type
- initializing an array:

```
elementType[] identifier = new elementType[length];

elementType[] identifier = new elementType[] { list of elements };
```

- don't try to print an array variable or convert the variable to a string,
  just produces garbage
- the counting loop pattern is perfect for iterating over an array: the length
  is the number of repetitions and the counter variable can be used to index
  the array at a different location with every repetition

