public class Input {
    public static void main(String[] args) throws java.io.IOException, InterruptedException {
        System.out.println("What is your name?");

        // not the right way to read input in an interactive program
        // this tries to read everything at once and will block until end
        // of user input (can simulate this by typing ctrl-d in terminal)
        // byte[] buffer = System.in.readAllBytes();

        // pause for 5 seconds so we can show what happens with multiple
        // lines of input
        Thread.sleep(5000);

        byte[] buffer = new byte[20];
        int len = System.in.read(buffer);

        System.out.print("First " + len + " bytes: ");
        for (int i = 0; i < len; i++) {
            System.out.print(buffer[i] + " ");
        }
        System.out.println();

        System.out.print("All bytes: ");
        for (int i = 0; i < buffer.length; i++) {
            System.out.print(buffer[i] + " ");
        }
        System.out.println();

        String name = "";
        for (int i = 0; i < len; i++) {
            if (buffer[i] != '\n') {
                name += (char)buffer[i];
            }
        }
        System.out.println("Name: \"" + name + "\"");
    }
}

/*
let's say the user enters "Zach" and hits enter

this sends the following characters to standard in:

'Z', 'a', 'c', 'h', '\n'

these are encoded as the following numbers (ascii):

90, 97, 99, 104, 10

we want to convert these bytes to the string "Zach"

*/
