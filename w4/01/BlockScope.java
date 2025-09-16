// BlockScope.java
void main() {
    int x = 1;

    IO.println("Before block:");
    IO.println("  x=" + x);

    {
        x = 3;
        int y = 2;

        IO.println("Inside block:");
        IO.println("  x=" + x);
        IO.println("  y=" + y);
    }

    IO.println("After block:");
    IO.println("  x=" + x);
    // what happens if we enable this line?
    // IO.println("  y=" + y);
}
