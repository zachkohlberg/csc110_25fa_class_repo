// public: this class is accessible from anywhere in the project
// class: declares a class
// Repeat: name of the class; top-level public class's name must match filename
public class Repeat {
    // public: same
    // static: ???
    // void: no return value for this method
    // main(...): method name; main is the program's entry point
    // String[] args: a String array parameter
    public static void main(String[] args) {
        // what's a scanner? don't know yet
        // java.util: a package in the java standard library
        // Scanner: a class in the standard library
        // java.util.Scanner: this is the type of the input variable
        // input =: declaring a variable named "input" and initializing it
        // new: creating an object
        // java.util.Scanner(...): a constructor call
        // System.in: ???
        java.util.Scanner input = new java.util.Scanner(System.in);

        // normal print statement except for "System.out"
        System.out.print("Enter some text: ");
        // String s =: declare and initialize a String variable
        // input.: calling some method on input, which is an object and a Scanner
        // nextLine(): the method we're calling, which must return a String
        String s = input.nextLine();
        // another print statement
        System.out.println("You typed: " + s);

        // another method call on input
        input.close();
    }
}
