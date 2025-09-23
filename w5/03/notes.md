# Week 5 Notes

## Functions

function: a block of code that we can run by writing its
name

- function call: runs the code inside a function and
  produces a result
- function definition: states the return type, name
  (identifier), and parameters of the function
- function implementation: code block containing everything
  that happens when you call the function
- parameters (formal parameters): declare variables for
  the function's input (input provided by the calling code)
- arguments (actual parameters): values provided when
  calling the function; these are assigned to the parameters
  for that function call
- return type: type of value returned by the function
- identifier: functions have names just like variables

creating functions

- can't nest function definitions
- all your functions are created outside main

```
returnType identifier(parameters) {
    implementation
}
```

returning from a function

- `return` is a java keyword
- this ends the function execution
- if you have an expression after the `return`, then the
  expression is evaluated and the result is passed back
  to the code that called the function
- `void` means a function returns nothing
- `void` functions don't need explicit return statements
- other functions must guarantee that they always return
  a value of their return type







