// public: accessible from any code in the project
// class: declares a class
// Repeat: name of the class; top-level public classes must match filename
public class Repeat {
    // static: ???
    // void: method doesn't return anything
    // main: method name; main is also the entry point for our program
    // String[] args: parameter, array of Strings
    public static void main(String[] args) {
        // java.util: package name in standard library
        // Scanner: class name in standard library
        // java.util.Scanner: type of our variable
        // input = : variable's name is input and we're initializing it
        // new: creating an object
        // java.util.Scanner(...): calling a constructor
        // System.in: ???
        // what exactly is the scanner for?
        java.util.Scanner input = new java.util.Scanner(System.in);

        // normal print statement, except System.out instead of IO
        System.out.print("Enter some text: ");
        // String s = : declaring and initializing a String variable called s
        // input.: we're calling some method on input
        // nextLine(): the method we called; returns a String
        String s = input.nextLine();
        // another print
        System.out.println("You typed: " + s);

        // another method called on input
        input.close();
    }
}
