// main will show how to use our class
void main() {
    // not using the class, just separate variables
    String courseCode = "CSC110";
    String courseTitle = "Programming and Problem Solving";
    int credits = 3;
    IO.println(String.format("%s: %s; %s credits.", courseCode, courseTitle, credits));

    // set an initial duration through the class
    // QuCourse.duration = 10;

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
    // modify duration through an instance
    csc110.duration = 7;
    // having to write out each print like this is also tedious
    IO.println(String.format("%s: %s; %s credits.", csc110.code, csc110.title, csc110.credits));

    // adding a second course using objects
    // initialized with parameterized constructor
    QuCourse csc111 = new QuCourse("CSC111", "Data Structures and Abstractions", 3);
    // modify duration through an instance
    csc111.duration = 5;
    // print using println because we overrode toString
    IO.println(csc111);

    // adding a third course to show convenience of our QuCourse class
    QuCourse ser120 = new QuCourse("SER120", "Object-Oriented Programming", 3);
    // modify duration through an instance
    ser120.duration = 14;
    IO.println(ser120);

    IO.println("Durations:");
    IO.println("\t" + csc110.duration);
    IO.println("\t" + csc111.duration);
    IO.println("\t" + ser120.duration);
}

// our class represents a course at QU
// version 3: overrides equals and toString
public class QuCourse {
    // example: CSC110
    String code;
    // example: Programming and Problem Solving
    String title;
    // example: 3
    int credits;
    // this is a mistake we're making to show how a static variable works
    // this variable should not be static, but let's see what happens if it is
    // example: 7, 14 (the duration in weeks)
    static int duration;

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

    // with toString, we don't really need a print method

    // the @Override annotation tells the compiler that this is supposed to override
    // an inherited method, and the compiler will generate an error if we don't override
    // it correctly
    // the public modifier has to do with encapsulation and is required because the method
    // we're overriding is public
    @Override
    // this lets us compare our courses to other courses more easily
    public boolean equals(Object object) {
        // instanceof keyword (I think this is technically an operator) tells us
        // whether object has the type QuCourse
        if (object instanceof QuCourse) {
            QuCourse other = (QuCourse)object;
            // two courses are equal if their code, title, and credits are equal
            return this.code.equals(other.code) && this.title.equals(other.title) && this.credits == other.credits;
        } else {
            return false;
        }
    }

    @Override
    // this lets us convert our courses to a string more easily
    public String toString() {
        return String.format("%s: %s; %s credits.", this.code, this.title, this.credits);
    }
}









