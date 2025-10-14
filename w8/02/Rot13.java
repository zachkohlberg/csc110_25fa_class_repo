void main() {
    String message = IO.readln("Enter a message, letters only.").toUpperCase();

    String encoded = "";

    int i = 0;
    while (i < message.length()) {
        char messageLetter = message.charAt(i);
        int alphabetIndex = messageLetter - 'A';
        int encodedAlphabetIndex = (alphabetIndex + 13) % 26;
        int encodedAscii = 'A' + encodedAlphabetIndex;
        char encodedLetter = (char)encodedAscii;

        encoded = encoded + encodedLetter;

        i = i + 1;
    }

    IO.println(encoded);
}
