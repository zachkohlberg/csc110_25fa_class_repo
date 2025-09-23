// ElseIf.java

void main() {
    int x = Integer.parseInt(IO.readln("Enter an integer: "));

    if (x > 0) {
        IO.println("Your number is positive.");
    } else if (x < 0) {
        IO.println("Your number is negative.");
    } else { // no if (condition) because we've ruled out every other option
        IO.println("Your number is zero.");
    }
}

