// main will demonstrate how to use our Course class
void main() {
    // doing this without the course class, just separate variables
    String courseCode = "CSC110";
    String courseTitle = "Programming and Problem Solving";
    int credits = 3;
    IO.println(String.format("%s: %s; %d credits.", courseCode, courseTitle, credits));

    // creates a course and initializes it with the default constructor
    // this will initialize the code, title, and credits to null, null, 0
    Course csc110 = new Course();
    // show the default values if we don't set them ourselves
    IO.println(String.format("%s: %s; %d credits.", csc110.code, csc110.title, csc110.credits));
    csc110.code = "CSC110";
    csc110.title = "Programming and Problem Solving";
    csc110.credits = 3;
    // show the values after we set them
    IO.println(String.format("%s: %s; %d credits.", csc110.code, csc110.title, csc110.credits));

    // initialized with the parameterized constructor
    Course csc111 = new Course("CSC111", "Data Structures and Abstraction", 3);
    csc111.print();

    // another course!
    Course ser120 = new Course("SER120", "Object-Oriented Programming", 3);
    ser120.print();
}

// version 2: add a constructor anda print method
class Course {
    // example: CSC110
    String code;
    // example: Programming and Problem Solving
    String title;
    // example: 3
    int credits;

    // if we want a default constructor, then we need to make it ourselves now
    // the compiler won't generate one once we add a parameterized constructor
    Course() {
        // not really necessary to initialize these, but I wanted to show what values
        // they'll be initialized with
        // the "this." is also not necessary, but I want the example to show the object
        // that we're modifying
        // "this" refers to the object being initialized in the constructor
        this.code = null;
        this.title = null;
        this.credits = 0;
    }

    // parameterized constructor to make initialization more convenient
    Course(String initCode, String initTitle, int initCredits) {
        this.code = initCode;
        this.title = initTitle;
        this.credits = initCredits;
    }

    void print() {
        IO.println(String.format("%s: %s; %d credits.", this.code, this.title, this.credits));
    }
}









