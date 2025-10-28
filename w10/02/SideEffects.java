// a "global" variable like x is accessible in all of our functions
int x = 10;

void main() {
    int[] array = new int[] { 1, 2, 3 };
    lotsOfSideEffects(array);
    IO.println(x); // function mutated this variable
    IO.println(array[0]);
    IO.println(array[1]); // function mutated this element of the array
    IO.println(array[2]);
}

// function that does every kind of side-effect we can think of
void lotsOfSideEffects(int[] numbers) {
    IO.println(x); // printing to standard out
    x = numbers[0]; // reassigning a variable outside function's scope
    numbers[1] = -1; // mutating a mutable parameter
    IO.readln("Enter some text for me to ignore..."); // reading from standard in
    double n = Math.random(); // generating a random number
    IO.println(n);
}
