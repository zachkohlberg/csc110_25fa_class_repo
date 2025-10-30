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
    - similar to while, but condition is checked at the end of the loop
    - because condition isn't checked until the end, it always performs one or more iterations
    - normal while loops perform zero or more iterations
    - odd syntax: includes a semicolon after the while condition

```java
// regular while loop
while (<condition>) {
    <statements>
}

// do-while loop
do {
    <statements>
} while (<condition>);
```

- switch syntax: newer syntax (Java 12-14), JEP 361 (https://openjdk.org/jeps/361)
    - arrow syntax and switch expressions
    - multiple values in a case separated by commas
    - arrow -> instead of colon
    - no fallthrough, no break
    - can use switch as an expression, but you'll probably need a semicolon at the end







