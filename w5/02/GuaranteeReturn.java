// show what happens if your function doesn't guarantee
// a return value of the correct type

void main() {
    int x = Integer.parseInt(IO.readln("Enter a number: "));

    String s = positiveNegativeOrZero(x);

    IO.println("Your number is " + s);
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

// this is kinda what the compiler sees when it checks
// whether this function always returs a string
// String ... {
//     if (...) {
//         return "...";
//     } else if (...) {
//         return "...";
//     } else if (...) {
//         return "...";
//     }
// }
