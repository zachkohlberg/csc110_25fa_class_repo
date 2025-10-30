# Week 10 Notes

## Program vs Function I/O

- Input/Output: information entering and leaving a system (a program, function, etc.)
- At a program level:
    - IO.readln reads user input and can also print output
    - IO.print and IO.println print output to the terminal
- At the function level: just looking at information travelling between functions, not
  information entering/leaving the entire program
    - A function's parameters define inputs required to call the function
    - A function's return value sends output to the caller (the code that called the function)
    - A function's return type tells other code what type of output the function produces
    - Writing functions that only use their parameters and return value for input lets them
      more easily communicate with other parts of your program
- See Square.java for example of both types of I/O
- Side-effect
    - anything that affects program state outside the function
    - not inherently bad, but should be avoided unless you specifically want that side-effect
- Functional Programming: programming paradigm
    - avoids mutable state: all variables are constants, never reassigned
    - all functions are "pure", no side-effects
    - languages that focus on FP: Haskell, OCaml, F#, Scala (combines OOP and FP)

## Misc Topics

- null: special constant that means "a reference to nothing"
    - any ref type can equal null
    - can check for null with == and !=
    - trying to call a method on a variable conatining null will trigger a `NullPointerException`
    - usually you want to write your code to avoid producing null, not to aggressively check
      for null before doing anything
- do-while loop: like a while loop, but condition is checked at the end
    - there is actually a semicolon after the while, which is unusual for selection/iteration
      constructs
    - because the condition is checked at the end, the loops executes ONE or more times; in
      other words, it's guaranteed to enter the loop and perform one iteration
    - usually not needed, but useful if you have a task that should be repeated one or more times

```
// regular while
while (<condition>) {
    <statements>
}

// do-while
do {
    <statements>
} while (<condition>);
```

- switch syntax: Java 12-14 update, JEP 361 (https://openjdk.org/jeps/361)
    - can use switch as an expression
    - arrow syntax allows listing multiple values, no break, no fallthrough

## 









