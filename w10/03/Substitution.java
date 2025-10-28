// Week 9 practice exercise
void main() {
    String text = IO.readln("Enter some text: ");

    String filtered = "";
    for (int i = 0; i < text.length(); i++) {
        char c = text.charAt(i);

        if (isAlphaNumeric(c)) {
            filtered += c;
        } else {
            filtered += '_';
        }
    }

    IO.println("Filtered text: " + filtered);
}

boolean isAlphaNumeric(char c) {
    // is it an uppercase letter?
    return ('A' <= c && c <= 'Z') || ('a' <= c && c <= 'z') || ('0' <= c && c <= '9');
}

// boolean isAlphaNumeric(char c) {
//     // we could make this an else-if chain
//
//     // is it an uppercase letter?
//     if ('A' <= c && c <= 'Z') {
//         return true;
//     }
//
//     // is it a lowercase letter?
//     if ('a' <= c && c <= 'z') {
//         return true;
//     }
//
//     // is it a digit?
//     if ('0' <= c && c <= '9') {
//         return true;
//     }
//
//     return false;
// }
