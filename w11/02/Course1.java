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

    // second course
    Course csc111 = new Course();
    csc111.code = "CSC111";
    csc111.title = "Data Structures and Abstraction";
    csc111.credits = 3;
    IO.println(String.format("%s: %s; %d credits.", csc111.code, csc111.title, csc111.credits));
}

// version 1: just act as a collection of variables
class Course {
    // example: CSC110
    String code;
    // example: Programming and Problem Solving
    String title;
    // example: 3
    int credits;

    // we didn't write a constructor, so compiler made a default
    // constructor for us: just inits properties to null, null, 0
}
