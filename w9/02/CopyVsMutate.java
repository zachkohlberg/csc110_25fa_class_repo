void main() {
    int[] a = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
    int[] b = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
    printArray("a", a);
    printArray("b", b);

    IO.println("Getting parities...");

    int[] aCopy = copyParity(a);
    mutateParity(b);

    printArray("a", a);
    printArray("aCopy", aCopy);
    printArray("b", b);
}

// returns a new array with parities: 0 for even, 1 for odd
int[] copyParity(int[] array) {
    // make a new array of the same length
    int[] copy = new int[array.length];

    // store parities in the new array
    for (int i = 0; i < array.length; i++) {
        // storing in the copy preserves the original
        // that's what differentiates this from the mutate version
        copy[i] = Math.abs(array[i] % 2);
    }

    // return the COPY to caller
    return copy;
}

// replaces elements of array with parities: 0 for even, 1 for odd
void mutateParity(int[] array) {
    // store parities in the original array
    for (int i = 0; i < array.length; i++) {
        // storing in the original array destroys the old information
        array[i] = Math.abs(array[i] % 2);
    }
}

void printArray(String label, int[] array) {
    IO.print(label + ":");
    for (int i = 0; i < array.length; i++) {
        IO.print(" " + array[i]);
    }
    IO.println();
}
