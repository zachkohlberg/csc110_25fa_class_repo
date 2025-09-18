// RepeatLoop.java
void main() {
    IO.println("Enter messages to repeat or \"done\" when finished.");

    // create variable outside loop so it can be used in condition
    String msg = "";

    // loop repeats until msg equals "done"
    while (!msg.equals("done")) {
        // changing msg affects the condition, which allows loop to eventually end
        msg = IO.readln("Your message: ");
        IO.println("You typed: \"" + msg + "\"");
    }
}
