// Mutability.java
void main() {
    String[] a = new String[] { "A", "B", "C" };
    String[] b = new String[] { "D", "E", "F" };
    String[] c = b;

    IO.println("Initial values:\n");
    printArray("a", a);
    printArray("b", b);
    printArray("c", c);
    IO.println("a == b is " + (a == b));
    IO.println("a == c is " + (a == c));
    IO.println("b == c is " + (b == c));

    a[0] = "H";
    a[1] = "I";
    a[2] = "J";
    c[0] = "H";
    c[1] = "I";
    c[2] = "J";

    IO.println("\nAfter mutating a and c:\n");
    printArray("a", a);
    printArray("b", b);
    printArray("c", c);
    IO.println("a == b is " + (a == b));
    IO.println("a == c is " + (a == c));
    IO.println("b == c is " + (b == c));
}

void printArray(String label, String[] array) {
    int i = 0;
    IO.print(label + ":");
    while (i < array.length) {
        IO.print(" " + array[i]);

        i = i + 1;
    }
    IO.println();
}

// Questions
// 1. Execute this code by hand, tracking the values of a, b, and c as they
//    change. What does it look like the output should be?
// 2. Run the program. How does your expected output differ from the actual
//    output?
// 3. Explain the differences. Specifically consider the following:
//    - What happens when we initialize an array with new String[]?
//    - What happens when we initialize an array by assigning an existing
//      array?
//    - What happens when we compare arrays with ==?
//    - What happens when we reassign elements of a?
//    - What happens when we reassign elements of c?

