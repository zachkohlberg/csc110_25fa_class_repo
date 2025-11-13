// Average.java
// This program gets its input from its args array instead of interactively
// prompting the user while it's running.
void main(String[] args) {
    // parse the arguments as doubles and sum them
    double sum = 0.0;
    for (int i = 0; i < numbers.length; i++) {
        sum += Double.parseDouble(args[i]);
    }
    // divide by number of args to compute the mean average
    double average = sum / args.length;
    // print average rounded to four decimal places
    IO.println(String.format("Average: %.4f", average));
}

