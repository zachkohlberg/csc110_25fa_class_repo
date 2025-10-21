# Week 9 Notes

## Switch Statement

```
switch (<expression>) {
    case <value>:
        <statements>
        break;
    case <value>:
        <statements>
        break;
    ...
    default:
        <statements>
        break;
}
```

- switch, case, break, default are all keywords
    - switch marks the start of a switch statement
    - case followed by a value marks an individual case
    - break ends the switch statement
    - default is a case that matches any value
- equivalent to the following else-if chain:

```
switch (exp) {
    case a:
        IO.println("Case a!");
        break;
    case b:
        IO.println("Case b!");
        break;
    case c:
    case d:
        IO.println("Case c/d!");
        break;
    default:
        IO.println("default case");
        break;
}

if (exp == a) {
    IO.println("Case a!");
} else if (exp == b) {
    IO.println("Case b!");
} else if (exp == c || exp == d) {
    IO.println("Case c/d!");
} else {
    IO.println("default case");
}
```

- fallthrough: cases will continue into each other if you don't end them with a break,
  and this will not trigger a compiler error
  - sometimes useful for combining several cases or for making certain optimizations,
    but can easily lead to errors if you're not careful
  - not necessary if a case returns or otherwise stops execution of the switch
- break can be used with loops, also continue
  - break ends the loop
  - continue skips the rest of the current iteration, but the loop will continue if
    the condition is true

```
int i = 0;
while (i < 10) {
    IO.println(i);

    i = i + 1;
}

// equivalent loop that exits with a break
// not really a situation where you'd want to do this, just an example of the syntax
int i = 0;
while (true) {
    IO.println(i);

    i = i + 1;

    if (i >= 10) {
        break;
    }
}
```

- can add labels to looks and target a specific label with break/continue, but this is
  a very niche use case

## For Loop

- more concise loop syntax for the counting pattern: anything where you can figure out the
  number of iterations ahead of time, anything using an array

```
// while
<init>;
while (<condition>) {
    <statements>

    <update>
}

// for
for (<init>; <condition>; <update>) {
    <statements>
}
```

- commonly used operators:
  - +=, -=, *=, /=, %=: `a += 5` is equivalent to `a = a + 5`
  - ++, --: `a++` is equal to `a = a + 1`
    - it's possible to use `a++`, `++a`, `a--`, or `--a` as an expression, but this is almost
      always a mistake
- enhanced for loop: specifically for iterating over arrays or other collections

```
String[] array = ...;

// normal for loop iterating over an array
for (int i = 0; i < array.length; i++) {
    // do something with array[i]
}

// enhanced for loop iterating over an array
for (String s : array) {
    // do something with s
}
```

- enhanced for loop is more limited:
  - no index variable, so don't use it if you need to know the index
  - can't modify the collection you're iterating over

## Arrays and Strings

- `.split`: string method that splits a string into an array of strings
  - the string needs to have each part separated by the same substring (delimiter)
  - the split method takes a string as an argument and uses that as the delimiter
  - "1 2 3 4".split(" ") gives { "1", "2", "3", "4" }
- `String.format` function takes a format string and some other arguments, then returns
  a string containing those arguments in the format given by the format string
  - alternative to concatenation, more powerful
  - formatting specifiers: %s (any), %d (decimal integer), %f (floating-point), and many others
  - can add extra info in the specifier
    - %4d pads an integer with spaces so it takes up at least 4 characters
    - %06d pads an integer with zeroes instead of spaces, at least 6 chars
    - %.3f rounds a floating-point number to 3 decimal places

NOTE: cover formatting specifiers at start of next class!




