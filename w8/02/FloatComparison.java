void main() {
    double a = Double.parseDouble(IO.readln("Enter two numbers that sum to 0.3.\n"));
    double b = Double.parseDouble(IO.readln());

    double sum = a + b;
    double target = 0.3;
    double difference = sum - target;

    // our margin of error, epsilon/eps
    // how close do we want the numbers to be before we consider them equal?
    double eps = 0.000000001;

    // won't work reliably due to roundoff errors
    // if (sum == target) {
    if (Math.abs(difference) < eps) {
        IO.println("Your numbers sum to 0.3.");
    } else {
        IO.println("Oops! Your numbers don't sum to 0.3.");
    }
}
