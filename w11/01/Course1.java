// main will show how to use our class
void main() {
    // not using the class, just separate variables
    String courseCode = "CSC110";
    String courseTitle = "Programming and Problem Solving";
    int credits = 3;
    IO.println(String.format("%s: %s; %s credits.", courseCode, courseTitle, credits));

    // using our class to combine the data into one object
    QuCourse csc110 = new QuCourse();
    csc110.code = "CSC110";
    csc110.title = "Programming and Problem Solving";
    csc110.credits = 3;
    IO.println(String.format("%s: %s; %s credits.", csc110.code, csc110.title, csc110.credits));

    // adding a second course using objects
    QuCourse csc111 = new QuCourse();
    csc111.code = "CSC111";
    csc111.title = "Data Structures and Abstractions";
    csc111.credits = 3;
    IO.println(String.format("%s: %s; %s credits.", csc111.code, csc111.title, csc111.credits));
}

// our class represents a course at QU
// version 1: just a collection of variables
public class QuCourse {
    // example: CSC110
    String code;
    // example: Programming and Problem Solving
    String title;
    // example: 3
    int credits;
}
