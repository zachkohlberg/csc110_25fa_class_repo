# Week 10 Notes

## Program I/O vs Function I/O

- Input/Output, generally: information entering and leaving a system, like a program or function
- Program-level I/O: communication between program and user
    - IO.readln lets us prompt user for input, also prints output
    - IO.print and IO.println just print output
    - This is all through standard in/out an the terminal, but there are many
      other ways for programs to communicate
- Function-level I/O: communication between parts of your program, functions
    - Functions declare parameters to state what type of input they need
    - Callers provide arguments to fill the parameters
    - Functions declare return types to state what kind of value they return, if any
    - Functions can return a value to the caller
- side-effect: anything that affects the state of the program outside the function
    - not inherently bad, but should be avoided when you don't need them
- Functional Programming: programming paradigm like OOP
    - roots in mathematics
    - variables aren't reassigned, most/all state is immutable
    - functions are "pure", no side-effects
    - functional languages: Haskell, Ocaml, F#, Scala (FP and OOP)

## Misc Topics

- null: a reference to nothing
    - default value for all reference types, any ref type can be null
    - can check for null with == and !=
    - if you try to call a method on a null value or access its properties, you trigger
      a `NullPointerException`
- do-while loops

TODO: do-while syntax
