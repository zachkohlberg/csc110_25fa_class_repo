// public: this can be accessed from any code, no restrictions
// class: declares a class; all java code must be in a class
// Repeat: the class name; top-level (public?) class name must match filename
public class Repeat {
    // public: same
    // static: ???
    // void: doesn't return anything
    // main: method/function name; main is the entry point
    // String[] args: a String array parameter
    public static void main(String[] args) {
        // java.util: the name of a package in the standard library
        // Scanner: the name of a class in the standard library
        // java.util.Scanner is the type of this variable
        // input: variable name
        // =: assignment
        // new: creates an object
        // java.util.Scanner(...): calls a constructor
        // System.in: ???; argument passed to the constructor
        // what exactly is a Scanner?
        java.util.Scanner input = new java.util.Scanner(System.in);

        // System.out: ???
        // print(...): an output function, just like IO.print(...)
        System.out.print("Enter some text: ");
        // String s =: declare a String variable named s and initialize it
        // input: the Scanner variable, which is an object with methods
        // nextLine(): calling a method named "nextLine", which does ???
        String s = input.nextLine();
        // same is the previous print statement
        System.out.println("You typed: " + s);

        // another method called on input
        input.close();
    }
}
