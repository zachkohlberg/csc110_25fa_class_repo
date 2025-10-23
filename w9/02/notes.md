# Week 9 Notes

## Switch Statement

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
        IO.println("Default case!");
        break;
}

// equivalent using else-if chain
if (exp == a) {
    IO.println("Case a!");
} else if (exp == b) {
    IO.println("Case b!");
} else if (exp == c || exp == d) {
    IO.println("Case c/d!");
} else {
    IO.println("Default case!");
}
```

- keywords: switch, case, break, default
    - switch marks the start of the statement
    - case marks each individual case
    - break exits the switch statement
    - default is a case that matches any value
- fallthrough
    - cases will continue into other cases if you leave out the break
    - usually a mistake, leads to bugs and the compiler won't stop you
    - useful for combining multiple cases (no code between the case labels)
- break can be used with loops
    - break ends the loop or switch it's executed from
    - similar keyword: continue skips the rest of the current iteration of a loop,
      but it will still check the condition and enter the next iteration if the
      condition is true
    - use sparingly, it can make your code harder to read and often isnt helpful

```
int i = 0;
while (i < 10) {
    IO.println(i);

    i = i + 1;
}

// equivalent using break
// this is not a good use of break, just an example to show the syntax
int i = 0;
while (true) {
    IO.println(i);

    i = i + 1;

    if (i >= 10) {
        break;
    }
}
```

## For Loops

- makes counting loop pattern more concise:

```
<init>;
while (<condition>) {
    <statements>

    <update>
}

for (<init>; <condition>; <update>) {
    <statements>
}
```

- operators:
    - +=, -=, *=, /=, %=: `a += 5` is the same as `a = a + 5`
    - ++, --: `a++` and `++a` are the same as `a = a + 1`
    - `a++`, `++a`, `a--`, and `--a` can be used as expressions, but this is rarely a good idea and
      often the result of misunderstanding the purpose of the operator

```
int i = 0;

// never do this
i = i++;
// you probably meant to do one of these instead
i++;
i += 1;
i = i + 1;

// using i++ as an expression is valid and can serve a purpose, but I recommend against it
int a = i++;
```

- enhanced for loop
    - regular for loops simplify counting loops
    - enhanced for loops simplify using a counting loop to iterate over an array or similar
      collection

```
String[] array = ...;

// iterating over an array with a regular for loop
for (int i = 0; i < array.length; i++) {
    // do something with array[i]
}

// iterating over the same array with an enhanced for loop
for (String s : array) {
    // do something with s
}
```

- enhanced for loop limitations
    - no access to index, so if you need the index for something other than getting the current
      element you won't be able to use enhanced for
    - can't easily modify the array during the enhanced for loop because you don't have the current
      index

## Arrays and Strings

- the string's `.split(...)` method splits a string into an array of strings using a delimiter
    - must be called on a string where each part is separated by a consistent delimiter
    - takes the delimiter as a string argument
    - example: "1 2 3 4".split(" ") splits around spaces, giving us the array { "1", "2", "3", "4" }
- `String.format(...)`: takes a format string and some other arguments, returns a string with the given
  format and the arguments inserted into the string
    - format specifiers: %s (any), %d (decimal integer), and %f (floating point) mark places in the
      format string where we insert each value
    - %d can specify padding with a number: %5d means padd with spaces to make the number at least 5
      characters long, and putting a 0 before the number pads with 0 instead of space
    - %f can round the number: %.3f means round to 3 decimal places
- copy and modify vs mutate in place
    - copying preserves the original array and requires extra memory
    - mutating in place destroys the original information but requires less time/memory

## 2D Arrays

- you can make an array type by adding [] after an existing type
- if you want a 2d array, why not just take an array of arrays? int[][] instead of int[]
- to process 2d arrays, we need to use nested loops
    - outer loop operates on each subarray
    - inner loop operates on each element of that subarray
- nothing says all the subarays have to be the same length
    - usually you prefer the subarrays to have the same size (rectangular array)
    - sometimes you may want different lengths (uneven/ragged array)






