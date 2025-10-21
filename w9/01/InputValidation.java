// demonstrate how to require valid user input
void main() {
    // ask user for a number until they enter an even number

    // initial prompt
    int number = Integer.parseInt(IO.readln("Please enter an even integer. "));

    // handle invalid input, require an even number
    // loop repeats for as long as input is invalid
    while (number % 2 != 0) {
        // give the user some kind of error/feedback about the invalid input
        IO.println("ERROR: you entered an odd number.");
        // repeat the prompt
        number = Integer.parseInt(IO.readln("Please enter an even integer. "));
    }

    IO.println("Your even number is " + number + ".");
}
