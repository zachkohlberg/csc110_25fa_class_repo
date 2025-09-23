// FunctionDefsAndCalls.java

// Function definitions/implementations

// Function info (from just the declaration):
// - id: average
// - parameters:
//   - id: a, type: double
//   - id: b, type: double
//   - id: c, type: double
// - return type: double
double average(double a, double b, double c) {
    // this block is the definition
    double sum = a + b + c;
    // return keyword exits the function and returns the result of the following
    // expression to the code that called this function
    return sum / 3;
}

// Function calls (inside our main function's implementation)

void main() {
    // variables to use in one function call
    // note: we can reuse these names because the scope of main's body is separate
    // from the scope of average's body
    double a = 12;
    double b = 7.5;
    double c = 6;

    // calling the average function with arguments a (12.0), b (7.5), and c (6.0)
    // and storing the result (8.5) in avg1
    double avg1 = average(a, b, c);

    // calling the average function with arguments 10.0, 5.0, and 30.0 and storing
    // the result (15.0) in avg2
    double avg2 = average(10, 5, 30);

    // calling the println function with a string expression as the argument
    IO.println("The averages are " + avg1 + " and " + avg2 + ".");
}

