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

## Scope

- function parameters are scoped to the function's body
- because functions have separate scopes, we can use the
  same variable/parameter name in different functions
- variable arguments don't need the same name as the
  corresponding parameter

## Arrays

- arrays are collections of values that all share a type; has a fixed length
- to create an array:

```
elementType[] identifier = new elementType[length];

elementType[] identifier = new elementType[] { list of elements };
```

- first version initializes each element to a default value (zero for
  numbers, null for strings)
- don't try to print an array variable directly, iterate over the elements
  and print them separately

