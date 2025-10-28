// we're going to write a bunch of square functions to show the difference between
// program level I/O and function level I/O

// version 1: all program I/O, talking directly to the user
void square1() {
    double x = Double.parseDouble(IO.readln("Enter a number to square: "));
    double xSquared = x * x;
    IO.println("The square of " + x + " is " + xSquared + ".");
}

// version 2: all function I/O, talking only to the caller
double square2(double x) {
    return x * x;
}

// some compromises
double square1a() {
    double x = Double.parseDouble(IO.readln("Enter a number to square: "));
    return x * x;
}
void square1b(double x) {
    double xSquared = x * x;
    IO.println("The square of " + x + " is " + xSquared + ".");
}

void main() {
    // only way to use square1
    square1();

    // many ways to use square2
    IO.println("Twelve squared is " + square2(12) + ".");

    String coords = IO.readln("Enter the x,y coordinates for a point: ");
    String[] parts = coords.split(",");
    double x = Double.parseDouble(parts[0]);
    double y = Double.parseDouble(parts[1]);

    IO.println("X squared is " + square2(x));
    IO.println("Y squared is " + square2(y));

    double distance = Math.sqrt(square2(x) + square2(y));
    IO.println("Your point is " + distance + " units from 0,0.");
}
