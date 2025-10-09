// Activity2.java
void main() {
    float a = 0f;

    int i = 0;
    while (i < 100_000_000) {
        a = a + 0.01f;
        i = i + 1;
    }

    IO.println(a);
}
// Guesses
// - 955,000
// - 956,000
// - 900,000
// - 954,000
