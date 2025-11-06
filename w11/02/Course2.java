// demonstrate using the course class
void main() {
    // example doing this without the Course class for comparison
    String courseCode = "CSC110";
    String courseTitle = "Programming and Problem Solving";
    int credits = 3;
    IO.println(String.format("%s: %s; %d credits.", courseCode, courseTitle, credits));

    // same as above, but using the Course class
    // create object and initialize with its default constructor
    Course csc110 = new Course();
    // show default values of our instance variables: null, null, 0
    IO.println(String.format("%s: %s; %d credits.", csc110.code, csc110.title, csc110.credits));
    // initialize properties to match the first example
    csc110.code = "CSC110";
    csc110.title = "Programming and Problem Solving";
    csc110.credits = 3;
    // print again with the correct values
    IO.println(String.format("%s: %s; %d credits.", csc110.code, csc110.title, csc110.credits));

    // second course to demonstrate benefits of the parameterized constructor and
    // the print method
    Course csc111 = new Course("CSC111", "Data Structures and Abstraction", 3);
    csc111.print();

    // third course just because
    Course ser120 = new Course("SER120", "Object-Oriented Programming", 3);
    ser120.print();
}

// version 2: add a constructor and a method
class Course {
    // example: CSC110
    String code;
    // example: Programming and Problem Solving
    String title;
    // example: 3
    int credits;

    // default constructor, same as what the compiler would have generated for us
    // in the previous version
    Course() {
        // technically we can leave these all out, but I want to show what values they
        // are assigned when we use the default constructor from last version
        // this refers to the object being initialized
        this.code = null;
        this.title = null;
        this.credits = 0;
    }

    // parameterized constructor allows more convenient initialization
    Course(String initCode, String initTitle, int initCredits) {
        this.code = initCode;
        this.title = initTitle;
        this.credits = initCredits;
    }

    // a print method lets us print our course without copying the format string over
    // and over
    void print() {
        IO.println(String.format("%s: %s; %d credits.", this.code, this.title, this.credits));
    }
}













