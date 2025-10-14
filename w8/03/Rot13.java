void main() {
    String message = IO.readln("Enter a message, only letters.").toUpperCase();

    String encoded = "";

    int i = 0;
    while (i < message.length()) {
        char letter = message.charAt(i);
        int alphabetIndex = letter - 'A';
        int encodedIndex = (alphabetIndex + 13) % 26;
        int encodedAscii = encodedIndex + 'A';
        char encodedLetter = (char)encodedAscii;

        encoded = encoded + encodedLetter;

        i = i + 1;
    }

    IO.println(encoded);
}
