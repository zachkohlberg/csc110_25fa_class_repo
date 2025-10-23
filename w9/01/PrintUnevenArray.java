void main() {
    int[][] array = generateRandomArray();
    printUnevenArray(array);
}

int[][] generateRandomArray() {
    int rows = (int)(Math.random() * 4) + 3;
    int[][] array = new int[rows][];
    for (int row = 0; row < array.length; row++) {
        int cols = (int)(Math.random() * 4) + 3;
        array[row] = new int[cols];
        for (int col = 0; col < array[row].length; col++) {
            array[row][col] = (int)(Math.random() * 10);
        }
    }
    return array;
}

void printUnevenArray(int[][] array) {
    for (int row = 0; row < array.length; row++) {
        int[] rowArray = array[row];

        IO.print("Row " + row + ":");
        for (int col = 0; col < rowArray.length; col++) {
            IO.print(" " + rowArray[col]);
        }
        IO.println();
    }
}
