public class Input {
    public static void main(String[] args) throws java.io.IOException, InterruptedException {
        System.out.println("What is your name?");

        // not a great way to do this because it's going to wait for
        // the end of ALL user input
        // byte[] buffer = System.in.readAllBytes();

        // pause for 5 seconds so I can show what happens with two lines of input
        Thread.sleep(5000);

        byte[] buffer = new byte[20];
        int len = System.in.read(buffer);

        System.out.print("First " + len + " bytes: ");
        for (int i = 0; i < len; i++) {
            System.out.print(buffer[i] + ", ");
        }
        System.out.println();

        System.out.print("All bytes: ");
        for (int i = 0; i < buffer.length; i++) {
            System.out.print(buffer[i] + ", ");
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

let's say the user types "Zach" and presses enter

this sends the following ascii characters to standard input:

'Z', 'a', 'c', 'h', '\n'

these are encoded as bytes (8-bit integers):

90, 97, 99, 104, 10

InputStream's read methods deal with these raw bytes

*/
