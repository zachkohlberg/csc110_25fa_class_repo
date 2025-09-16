// Ifs.java
void main() {
    String color = IO.readln("What's your favorite color?\n").toLowerCase();
    if (color.equals("red")) {
        IO.println("Wow, that's my favorite color!");
    }

    String password = IO.readln("Please enter a password to access even/odd: ");
    if (password.equals("p@ssw0rd1")) {
        IO.println("Welcome to the even/odd program.");
        int n = Integer.parseInt(IO.readln("Enter an integer: "));

        // What's wrong with this if statement?
        if (n % 2 == 1) {
            IO.println("Your number is odd.");
        } else {
            IO.println("Your number is even.");
        }
    } else {
        IO.println("Sorry, that's not the password.");
    }
}
