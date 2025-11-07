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

    Course csc111 = new Course();
    csc111.code = "CSC111";
    csc111.title = "Data Structures and Abstraction";
    csc111.credits = 3;
    IO.println(String.format("%s: %s; %d credits.", csc111.code, csc111.title, csc111.credits));
}

// version 1: just a collection of variables
class Course {
    // example: CSC110
    String code;
    // example: Programming and Problem Solving
    String title;
    // example: 3
    int credits;

    // we didn't write any constructors, so the compiler makes a default Course()
    // constructor for us
}
