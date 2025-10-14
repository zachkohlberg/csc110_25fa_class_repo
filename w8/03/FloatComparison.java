void main() {
    double a = Double.parseDouble(IO.readln("Enter two numbers that sum to 0.3:\n"));
    double b = Double.parseDouble(IO.readln());

    double sum = a + b;
    double target = .3;
    double difference = sum - target;

    // our margin of error, epsilon
    // how small does the difference have to be for us to treat two
    // numbers as equal?
    double eps = 0.000000000001;

    // doesn't work reliably due to roundoff error
    // if (sum == target) {
    if (Math.abs(difference) < eps) {
        IO.println("Your numbers sum to approximately 0.3.");
    } else {
        IO.println("Oops! Your numbers don't sum to approximately 0.3.");
    }
}
