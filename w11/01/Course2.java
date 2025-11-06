// main will show how to use our class
void main() {
    // not using the class, just separate variables
    String courseCode = "CSC110";
    String courseTitle = "Programming and Problem Solving";
    int credits = 3;
    IO.println(String.format("%s: %s; %s credits.", courseCode, courseTitle, credits));

    // using our class to combine the data into one object
    // this calls the default constructor, which initializes our instance variables to
    // null, null, and 0
    // we'll leave this using the default constructor and more tedious versions so we
    // can compare to using a parameterized constructor and print method
    QuCourse csc110 = new QuCourse();
    // this initializes each variable separately, which is tedious
    csc110.code = "CSC110";
    csc110.title = "Programming and Problem Solving";
    csc110.credits = 3;
    // having to write out each print like this is also tedious
    IO.println(String.format("%s: %s; %s credits.", csc110.code, csc110.title, csc110.credits));

    // adding a second course using objects
    // initialized with parameterized constructor
    QuCourse csc111 = new QuCourse("CSC111", "Data Structures and Abstractions", 3);
    // print using a method
    csc111.print();

    // adding a third course to show convenience of our QuCourse class
    QuCourse ser120 = new QuCourse("SER120", "Object-Oriented Programming", 3);
    ser120.print();
}

// our class represents a course at QU
// version 2: adding a parameterized constructor and print method so it's more
// convenient to work with
public class QuCourse {
    // example: CSC110
    String code;
    // example: Programming and Problem Solving
    String title;
    // example: 3
    int credits;

    // a default constructor, same as the one we'd get for free in the first example
    // default constructor has no parameters
    QuCourse() {
        // "this" refers to the object being initialized and can usually be left out
        this.code = null;
        this.title = null;
        this.credits = 0;
    }

    // a parameterized constructor has one or more parameters
    QuCourse(String initCode, String initTitle, int initCredits) {
        this.code = initCode;
        this.title = initTitle;
        this.credits = initCredits;
    }

    // a print method for convenience
    void print() {
        IO.println(String.format("%s: %s; %s credits.", this.code, this.title, this.credits));
    }
}









