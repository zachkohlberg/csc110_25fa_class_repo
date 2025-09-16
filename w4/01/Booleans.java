// Booleans.java
void main() {
    // boolean is a type with two values: true and false
    boolean x = true;
    boolean y = false;

    IO.println("x=" + x);
    IO.println("y=" + y);

    // comparisons result in booleans
    IO.println("3 > 0 is " + (3 > 0));
    IO.println("3 <= 0 is " + (3 <= 0));
    IO.println("4 == 2 is " + (4 == 2));
    IO.println("2 == 2 is " + (2 == 2));

    // Strings don't use normal comparison operators
    IO.println("\"hello\".equals(\"world\") is " + "hello".equals("world"));
    IO.println("\"hello\".equals(\"hello\") is " + "hello".equals("hello"));

    // boolean logic operators result in booleans
    IO.println("AND");
    IO.println("  true && true is " + (true && true));
    IO.println("  true && false is " + (true && false));
    IO.println("  false && true is " + (false && true));
    IO.println("  false && false is " + (false && false));

    IO.println("OR");
    IO.println("  true || true is " + (true || true));
    IO.println("  true || false is " + (true || false));
    IO.println("  false || true is " + (false || true));
    IO.println("  false || false is " + (false || false));

    IO.println("NOT");
    IO.println("  !true is " + (!true));
    IO.println("  !false is " + (!false));
}
