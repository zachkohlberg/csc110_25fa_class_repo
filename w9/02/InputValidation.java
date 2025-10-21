// how do we handle input that doesn't follow some rule we gave the user?
void main() {
    // initial prompt for an even number
    int number = Integer.parseInt(IO.readln("Enter an even integer. "));

    // validation to handle odd numbers
    // - must do nothing if the number was even
    // - must ensure we have an even number before we continue

    // loop repeats as long as number isn't even
    while (number % 2 != 0) {
        // print an error because that's what you'll see on the assignments
        IO.println("ERROR: you entered an odd number.");
        // prompt for the number again
        number = Integer.parseInt(IO.readln("Enter an even integer. "));
    }

    // print result
    IO.println("Your even number is " + number + ".");
}
