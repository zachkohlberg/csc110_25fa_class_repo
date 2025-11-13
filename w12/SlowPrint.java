// someone requested an example of printing slowly to the terminal
// key is to print one char or one part of the message at a time and
// sleep between prints for some amount of time

// we'll get to what "throws" and "InterruptedException" mean later
void main() throws InterruptedException {
    String message = "Here's my really long message that's going to slowly print\non the terminal...";
    for (int i = 0; i < message.length(); i++) {
        // pause for 1/20th of a second
        Thread.sleep(50);
        // print one character
        IO.print(message.charAt(i));
    }
    IO.println();
}
