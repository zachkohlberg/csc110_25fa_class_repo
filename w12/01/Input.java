public class Input {
    public static void main(String[] args) throws java.io.IOException, InterruptedException {
        System.out.println("Enter your name:");
        // readAllBytes is not ideal, it's meant to read all input at once
        // byte[] input = System.in.readAllBytes();

        // pause to give me time to type two lines of input and show that they merge,
        // which we probably don't want to do
        Thread.sleep(5000);

        // byte array to store input
        byte[] buffer = new byte[20];
        // read returns how many bytes it read, which lets us determine how much
        // of the buffer contains meaningful data
        int len = System.in.read(buffer);

        System.out.print("First " + len + " Bytes: ");
        for (int i = 0; i < len; i++) {
            System.out.print(buffer[i] + ",");
        }
        System.out.println();

        System.out.print("All Bytes: ");
        for (int i = 0; i < buffer.length; i++) {
            System.out.print(buffer[i] + ",");
        }
        System.out.println();

        String input = "";
        for (int i = 0; i < len; i++) {
            if ('\n' != buffer[i]) {
                input += (char)buffer[i];
            }
        }

        System.out.println("Input String: \"" + input + "\"");
    }
}

/*
if we type "Zach" as our input, we're sending the following ascii characters to std in:

'Z', 'a', 'c', 'h', '\n'

these characters are encoded as the following numbers, which we'd expect to see in our
byte array:

90, 97, 99, 104, 10

the \n may or may not be included, don't know until we try it
*/
