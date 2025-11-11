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
    // not the right way to use a static variable, but it helps our example
    csc110.duration = 7;
    // better would be to do this:
    // Course.duration = 7;
    // show the values after we set them
    IO.println(String.format("%s: %s; %d credits.", csc110.code, csc110.title, csc110.credits));

    // initialized with the parameterized constructor
    Course csc111 = new Course("CSC111", "Data Structures and Abstraction", 3);
    csc111.duration = 3;
    IO.println(csc111);

    // another course!
    Course ser120 = new Course("SER120", "Object-Oriented Programming", 3);
    ser120.duration = 14;
    IO.println(ser120);

    IO.println("Durations:");
    IO.println("\t" + csc110.duration);
    IO.println("\t" + csc111.duration);
    IO.println("\t" + ser120.duration);
}

// version 3: override toString and equals
class Course {
    // example: CSC110
    String code;
    // example: Programming and Problem Solving
    String title;
    // example: 3
    int credits;
    // this is a bad idea, but we're doing it to show how a static variable works
    static int duration;
    // try removing static and see what happens

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

    // no need for print if we override toString

    // override toString to allow for convenient printing/string conversion
    // the @Override annotation raises a compiler error if we don't override
    // correctly, helping us catch mistakes
    @Override
    // need to make toString public because the one we inherited was public
    public String toString() {
        return String.format("%s: %s; %d credits.", this.code, this.title, this.credits);
    }

    // overriding equals allows for proper comparisons between courses
    @Override
    public boolean equals(Object obj) {
        // instanceof keyword checks whether an object is an instance of a certain class
        if (obj instanceof Course) {
            Course other = (Course)obj;
            return other.code.equals(this.code) && other.title.equals(this.title) && other.credits == this.credits;
        } else {
            return false;
        }
    }
}









