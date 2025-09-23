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




