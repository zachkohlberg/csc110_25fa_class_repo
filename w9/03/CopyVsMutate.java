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

// parity: even = 0, odd = 1
// stores each number's parity in a new array and returns the new array
int[] copyParity(int[] array) {
    // create a new array with the same length
    int[] copy = new int[array.length];

    // copy parities into new array
    for (int i = 0; i < array.length; i++) {
        // we store this in copy, not array, preserving the original number
        copy[i] = Math.abs(array[i] % 2);
    }

    // return the COPY to the caller
    return copy;
}

// stores each number's parity in the original array, overwriting the number
void mutateParity(int[] array) {
    // store parities in the original array
    for (int i = 0; i < array.length; i++) {
        // we store this in array, overwriting the original number
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
