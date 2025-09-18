// CountingLoop.java
void main() {
    // init
    int i = 0;
    // condition
    while (i < 10) {
        // task usually uses counter variable
        IO.println("Loop body: i = " + i);

        // update
        i = i + 1;
    }

    // note values printed during loop and value printed after loop
    IO.println("After loop: i = " + i);
}
