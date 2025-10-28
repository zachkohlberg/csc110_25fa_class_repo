# Week 10 Notes

## Function vs Program I/O

- Input/Output, generally: information entering (input) or leaving (output) a system, like
  a program or a function
- Program-level I/O: information exchanged between program and user
    - We get input from user with IO.readln, which can also print output
    - We print output for the user with IO.print and IO.println
    - We're just using standard in/out to read/print on terminal, but there are
      other ways to do program level I/O
- Function-level I/O: information exchanged between functions without crossing
  program/user boundary
    - Functions declare parameters to state what inputs they need from the caller
    - Caller passes arguments to fill the parameters, providing this input
    - Functions declare a return type to state what type of value they return to the caller
    - Functions return a value of their return type, which the caller can use
- side-effects: anything that affects program state outside the function's scope
- Functional Programming: a programming paradigm (like OOP)
    - no mutable state: variables are constant, never reassigned
    - no side-effects: functions are "pure"
    - makes code work more like math, many of these constraints make it easier to
      reason about and debug code
    - functional languages: Haskell, Ocaml, F#, Scala (combines FP and OOP)

## Misc Topics

- null: special reference value that means "reference to nothing"
    - any ref type can be equal to null
    - default value for ref types like String and arrays
    - check with == and !=
    - if you try calling a method on a null value or accessing one of its properties, you
      will trigger a `NullPointerException`
- do-while loops: while loops that check their condition at the end instead of the beginning
    - because the check happens at the end, the loop always performs at least one iteration
    - weird syntax: semicolon after the while condition

```
// regular while loop
while (<condition>) {
    <statements>
}

// do-while loop
do {
    <statements>
} while (<condition>);
```









