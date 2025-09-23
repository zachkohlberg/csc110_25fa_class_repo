// ElseIf.java

void main() {
    int x = Integer.parseInt(IO.readln("Enter an integer: "));

    if (x > 0) {
        IO.println("Your number is positive.");
    } else if (x < 0) {
        IO.println("Your number is negative.");
    } else {
        IO.println("Your number is zero.");
    }
}

