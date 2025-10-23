// Average.java
void main() {
    String text = IO.readln("Enter a series of numbers separated by spaces:\n");

    String[] textSplit = text.split(" ");

    double[] numbers = new double[textSplit.length];

    // Why can't we use an enhanced for loop here?
    for (int i = 0; i < textSplit.length; i++) {
        numbers[i] = Double.parseDouble(textSplit[i]);
    }

    double avg = average(numbers);
    IO.println(String.format("The average is %.2f.", avg));
}

double average(double[] array) {
    double sum = 0;
    // Why can we use an enhanced for loop here?
    for (double n : array) {
        sum += n;
    }
    return sum / array.length;
}

