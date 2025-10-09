// Activity1.java
void main() {
    float a = 0f;

    int i = 0;
    while (i < 10_000_000) {
        a = a + 0.01f;
        i = i + 1;
    }

    IO.println(a);
}
// Guesses?
// - 100,000
// - 99,999.99
// - -100,000
