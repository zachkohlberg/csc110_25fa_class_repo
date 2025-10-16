void main() {
    // this won't work for unicode values over 16-bits (like emoji),
    // so I've replaced it with some arrows
    IO.println("Hello World \u25B2 \u25BC \u25C0 \u25B6");
}
