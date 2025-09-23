// week 5 practice exercise

void main() {
    // input

    int dividend = Integer.parseInt(IO.readln("Please enter the dividend: "));
    int divisor = Integer.parseInt(IO.readln("Please enter the divisor: "));

    // work

    // counts number of subtractions, so we'll count up from 0
    int quotient = 0;
    // starts at dividend because we repeatedly subtract until it's too small
    int remainder = dividend;

    // repeatedly subtract to divide until remainder is too small
    while (remainder >= divisor) {
        // subtract once
        remainder = remainder - divisor;
        // count the subtraction
        quotient = quotient + 1;
    }

    // output

    IO.print(dividend + " / " + divisor + " = " + quotient);

    // we can leave out the remainder when it's zero
    if (remainder != 0) {
        IO.println(" and " + remainder + "/" + divisor);
    } else {
        IO.println();
    }
}
