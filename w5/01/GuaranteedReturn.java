// Show error when function isn't guaranteed to return

void main() {
    int x = Integer.parseInt(IO.readln("Enter a number: "));
    String s = positiveNegativeOrZero(x);
    IO.println(s);
}

String positiveNegativeOrZero(int x) {
    if (x > 0) {
        return "positive";
    } else if (x < 0) {
        return "negative";
    } else {
        return "zero";
    }
}

// the compiler sees this when trying to decide whether
// the function always returns a string: 
String ...(...) {
    if (...) {
        return "...";
    } else if (...) {
        return "...";
    } else if (...) {
        return "...";
    }

    // if all if conditions are false, we don't return a string
    // this is why we get a compiler error when ending on "else if"
}
