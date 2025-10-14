// ShortCircuit.java
void main() {
    IO.println("f && t is " + (f() && t()));
    IO.println("t || f is " + (t() || f()));
}

boolean f() {
    IO.println("Called f()");
    return false;
}

boolean t() {
    IO.println("Called t()");
    return true;
}

// Questions
// 1. What would you expect this program to print?
// 2. What does the program actually print? How did this differ from your
//    expectations?
// 3. Try writing another print statement that exhibits this behavior and
//    explain why it happens in that statement.
