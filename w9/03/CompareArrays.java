void main() {
    int[] a = new int[] { 1, 2, 3 };
    int[] b = new int[] { 1, 2, 3 };
    int[] c = new int[3];
    int[] d = new int[] { 1, 2, 3, 4 };

    printArray("a", a);
    printArray("b", b);
    printArray("c", c);
    printArray("d", d);

    IO.println("a equals b? " + arraysEqual(a, b));
    IO.println("a equals c? " + arraysEqual(a, c));
    IO.println("a equals d? " + arraysEqual(a, d));

    IO.println("modifying c to equal a...");

    c[0] = 1;
    c[1] = 2;
    c[2] = 3;

    printArray("c", c);
    IO.println("a equals c? " + arraysEqual(a, c));
}

// two arrays a and b are equal if
// - a and b have the same length
// - a and b have the same elements
// - a and b's elements are in the same order
boolean arraysEqual(int[] a, int[] b) {
    // if lengths differ we don't need to know anything else
    if (a.length != b.length) {
        return false;
    }

    // now that we know the lengths are equal, we can safely
    // iterate over both arrays with the same loop
    int i = 0;
    while (i < a.length) {
        if (a[i] != b[i]) {
            return false;
        }

        i = i + 1;
    }

    // now that we know the lengths are the same, the elements
    // are the same, and the elements are in the same order, we
    // know the arrays are the same
    return true;
}

void printArray(String label, int[] array) {
    int i = 0;
    IO.print(label + ":");
    while (i < array.length) {
        IO.print(" " + array[i]);

        i = i + 1;
    }
    IO.println();
}
