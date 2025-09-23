// Arrays.java

void main() {
    // [] means a type is an array rather than a single value
    int[] a;

    // new type[len] creates a new array of "type" with length "len"
    // all elements in array are initialized to a default value
    a = new int[3];

    // access individual elements by index; otherwise just like accessing any variable
    IO.println("first element is " + a[0]);
    IO.println("second element is " + a[1]);
    IO.println("third element is " + a[2]);

    // arrays have a length, which is NOT a method (a String's length() is a method)
    IO.println("array's length is " + a.length);

    // modify individual elements by index; otherwise just like modifying any variable
    a[0] = 5;
    a[1] = 9;

    // print all elements
    IO.println("first element is " + a[0]);
    IO.println("second element is " + a[1]);
    IO.println("third element is " + a[2]);

    // can also reassign to a brand new array
    // can initialize with specific elements instead of default values
    // one of the rare cases where a semicolon goes after a curly brace
    a = new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

    // counting loops are perfect for processing entire arrays
    IO.print("a: ");
    int i = 0;
    while (i < a.length) {
        IO.print(" " + a[i]);

        i = i + 1;
    }
    // end the line
    IO.println();
}

