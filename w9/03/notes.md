# Week 9 Notes

## Switch Statements

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

- keywords: switch, case, default, break
    - switch marks start of statement
    - case marks a single case (a value of exp that we care about)
    - default is a case that matches any value, like an else at the end of an else-if chain
    - break exits the switch block
- fallthrough
    - if you don't break or return, then a case will continue into the next case
    - useful if you want to make several cases do the same thing
    - usually is a mistake and leads to bugs, so remember to break!
- break can also be used in loops
    - break exits the loop or switch it's called from
    - also continue: skips the rest of the current iteration of a loop and
      returns to the condition
    - use sparingly with loops, easy to add bugs or write nightmare spaghetti code

```
int i = 0;
while (i < 10) {
    IO.println(i);

    i = i + 1;
}

// equivalent with break instead of a condition
// this is a terrible use of a break, just here to show what it looks like
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

- for loops simplify counting loops by putting all the counting logic in one place

```
<init>;
while (<condition>) {
    <statements>

    <update>;
}

for (<init>; <condition>; <update>) {
    <statements>
}
```

- +=, -=, *=, /=, %=: `a = a + 5` is the same as `a += 5`
- ++, --: `a++` and `++a` are the same as `a = a + 1`

```
int i = 0;
int a = 0;

// wrong, never do this
i = i++;
// you actually meant one of these:
i++;
i += 1;
i = i + 1;

// sometimes (rarely) there's a reason to do one of these:
a = i++;
a = ++i;

// I recommend never doing that
// - it isn't saving you much typing or shortening your code by much
// - it's easy to misread or make mistakes
// - I've not even explained what it does, so you might not know how they work
```

- enhanced for loop
    - regular for loops make counting loops simpler
    - enhanced for loops make counting loops that iterate over arrays simpler

```
String[] array = ...;

// iterating over array with regular for loop
for (int i = 0; i < array.length; i++) {
    // do something with array[i]
}

// iterating over array with enhanced for loop
for (String s : array) {
    // do something with s
}
```

- limitations of enhanced for loops
    - you don't have the index, so if you need it for something other than indexing
      the array, enhanced for isn't a great idea
    - can't easily modify the array because you don't have the index

## Arrays and Strings

- string's `.split(...)` method takes a string and splits it around some delimiter
    - the string needs to use a consistent delimiter between each part
    - the delimiter is a string and can be more than one character
    - example: `"1 2 3 4".split(" ")` splits around spaces, giving us the array `{ "1", "2", "3", "4" }`
- `String.format(...)`: takes a format string and some arguments, returns a string showing the arguments
  inserted into the format string
    - format specifiers: %s (any), %d (decimal integer), and %f (floating point) act as placeholders
      for the arguments in the format string
    - %d can include padding: %5d pads numbers with spaces if they're less than 5 digits, and %05d pads
      with zeroes
    - %f can specify precision for rounding: %.3f rounds to three decimal places
- modified copy vs mutate in place
    - modified copy: preserves original data but requires more memory/time
    - mutate in place: destroys original data but doesn't require extra memory and usually takes less time

## 2D Arrays

- we can make arrays of arrays: int[][] vs int[]; this adds a second dimension
- uneven/ragged arrays
    - each subarray (row) can be a different size
    - usually you want everything the same size (rectangular)
    - may have to deal with code that gives an uneven array
- to iterate over a 2d array
    - iterate over it like you would a 1d array
    - each element of the 2d array is a row (1d array)
    - now you can iterate over the row with a second loop










