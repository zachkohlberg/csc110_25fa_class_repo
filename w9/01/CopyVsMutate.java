void main() {
    int[] a = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
    int[] b = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
    printArray("a", a);
    printArray("b", b);

    IO.println("Getting parity of array elements...");

    int[] aCopy = copyParity(a);
    mutateParity(b);
    printArray("a", a);
    printArray("aCopy", aCopy);
    printArray("b", b);
}

// convert ints to their parity (0 = even, 1 = odd) and add to a new array
int[] copyParity(int[] array) {
    // make a new array
    int[] copy = new int[array.length];
    // convert to parity and add to new array
    for (int i = 0; i < array.length; i++) {
        // this goes in copy[i], not array[i]
        // that's what makes this a copy and not a mutation
        copy[i] = Math.abs(array[i] % 2);
    }
    // give copy to calling code
    return copy;
}

// convert ints to their parity and replace the values in the array
void mutateParity(int[] array) {
    for (int i = 0; i < array.length; i++) {
        // this replaces the original value in the array we were given
        // that's what makes this a mutation and not a copy
        array[i] = Math.abs(array[i] % 2);
    }
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
