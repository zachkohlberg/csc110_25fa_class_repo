// Functions.java

// declaring and implementing our main function
void main() {
    int x = 10;
    // calling our square function and storing the result in a variable
    int xSquared = square(x);
    // calling println
    IO.println(x + " squared is " + xSquared);

    String s = "Hello";
    // calling our repeat function and storing the result in a variable
    String sRepeated = repeat(s, 4);
    // calling println
    IO.println(s + " repeated 4 times is " + sRepeated);
}

// example: what functions we've used before look like
// int parseInt(String s) {...}
// String readln(String prompt) {...}
// double pow(double a, double b) {...}

// declaring and implementing our square function
int square(int n) {
    // work
    int nSquared = n * n;
    // return the result
    return nSquared;
}

// declaring and implementing our repeat function
String repeat(String s, int times) {
    // more complicated work than square
    String result = "";
    int i = 0;
    while (i < times) {
        result = result + s;

        i = i + 1;
    }
    // return the result
    return result;
}

// Questions
// - In main we use the names x and xSquared for variables, and in square we use
//   n and nSquared. Why don't the names have to match?
// - In main we use the names s and sRepeated for variables (plus the literal 4),
//   and in repeat we use the names s, times, and result. One name matches, one
//   value has no name in main (the 4, which in repeat is called times), and one
//   name doesn't match. Why is this okay?

