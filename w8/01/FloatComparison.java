void main() {
    double a = Double.parseDouble(IO.readln("Enter two numbers that add up to 0.3.\n"));
    double b = Double.parseDouble(IO.readln());

    // our margin of error, common name is epsilon or eps
    double eps = 0.000000001;
    // how close is a-b to 0.3
    double difference = (a + b) - 0.3;

    // this won't work because floating-point numbers aren't precise
    // if (a + b == 0.3) {
    if (Math.abs(difference) < eps) {
        IO.println("Good job!");
    } else {
        IO.println("Oops! Those don't add to 0.3.");
    }
}

