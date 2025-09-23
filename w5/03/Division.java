// practice exercise from week 4

void main () {
    // input

    int dividend = Integer.parseInt(IO.readln("Enter the dividend: "));
    int divisor = Integer.parseInt(IO.readln("Enter the divisor: "));

    // work

    // quotient is just a count of how many times we subtracted, so we start counting at 0
    int quotient = 0;
    // we're subtracting from the dividend to get the remainder, so we'll start this
    // equal to the remainder
    int remainder = dividend;

    // "until" is more natural for me, so I tend to initially state conditions like this:
    // loop until remainder is too small to subtract divisor
    // for a while loop, we need to change the condition so yes means continue looping:
    // loop while remainder is large enough to subtract divisor
    while (remainder >= divisor) {
        // subtract divisor from remainder
        remainder = remainder - divisor;
        // count the subtraction (increment the quotient)
        quotient = quotient + 1;
    }

    // output

    // we always print this part
    IO.print(dividend + " / " + divisor + " = " + quotient);

    // only print the remainder when it's not zero
    if (remainder != 0) {
        IO.println(" and " + remainder + "/" + divisor);
    } else {
        // should print a newline because the last print didn't include one
        IO.println();
    }
}
