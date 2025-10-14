void main() {
    String message = IO.readln("Enter a message, letters only!").toUpperCase();

    String encoded = "";

    int i = 0;
    while (i < message.length()) {
        char letter = message.charAt(i);
        int alphabetPosition = letter - 'A';
        int encodedPosition = (alphabetPosition + 13) % 26;
        char encodedLetter = (char)('A' + encodedPosition);
        encoded = encoded + encodedLetter;

        i = i + 1;
    }

    IO.println(encoded);
}
