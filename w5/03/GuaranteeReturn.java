// show how else-if can confuse the compiler
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

// this is what the compiler sees when checking whether the function returns
// String ... {
//     if (...) {
//         return "...";
//     } else if (...) {
//         return "...";
//     } else if (...) {
//         return "...";
//     }
// }
