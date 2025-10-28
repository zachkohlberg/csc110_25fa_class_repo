// version 1: function uses program-level I/O
void square1() {
    double x = Double.parseDouble(IO.readln("Enter a number to square: "));
    double xSquared = x * x;
    IO.println("The square of " + x + " is " + xSquared + ".");
}

// version 2: function uses function-level I/O
double square2(double x) {
    return x * x;
}

// in-between versions, just because:
// returns output to caller, but requires user to input value
double square1a() {
    double x = Double.parseDouble(IO.readln("Enter a number to square: "));
    return x * x;
}
// takes input from caller, but prints output to user instead of returning
void square1b(double x) {
    double xSquared = x * x;
    IO.println("The square of " + x + " is " + xSquared + ".");
}

void main() {
    // we can only call square1 and let it communicate with the user
    // we can't use it for anything else
    square1();

    // we have more options for how we use square2
    String coords = IO.readln("Enter the x and y coordinates of a point: ");
    String[] parts = coords.split(",");
    double x = Double.parseDouble(parts[0]);
    double y = Double.parseDouble(parts[1]);
    double distance = Math.sqrt(square2(x) + square2(y));

    IO.println("X squared is " + square2(x));
    IO.println("Y squared is " + square2(y));
    IO.println("The distance from the origin is " + distance);
}
