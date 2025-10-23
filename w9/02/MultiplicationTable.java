// MultiplicationTable.java
void main() {
    int[][] table = generateTable(12);
    printLookup(table, 5, 7);
    printLookup(table, 8, 3);
    printLookup(table, 12, 11);
    printTable(table);
}

int[][] generateTable(int size) {
    int[][] table = new int[size][size];
    for (int row = 0; row < size; row++) {
        for (int col = 0; col < size; col++) {
            // Why do we need to add 1 to row and col?
            table[row][col] = (row + 1) * (col + 1);
        }
    }
    return table;
}

// Note: assumes numbers are not greater than 4 digits or the spacing will be off
void printTable(int[][] table) {
    for (int row = 0; row < table.length; row++) {
        for (int col = 0; col < table[row].length; col++) {
            IO.print(String.format("%5d", table[row][col]));
        }
        // Why is this necessary?
        IO.println();
    }
}

void printLookup(int[][] table, int a, int b) {
    IO.println(String.format("%d x %d = %d", a, b, table[a - 1][b - 1]));
}

