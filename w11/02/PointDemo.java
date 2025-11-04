// PointDemo.java
void main() {
    // creating a point and setting its variables
    Point p1 = new Point();
    p1.x = 10;
    p1.y = -3;

    // creating a second point to show that each point has
    // its own x and y
    Point p2 = new Point();
    p2.x = 1;
    p2.y = 2;

    // sharing a reference to remind us how mutable objects
    // work
    Point p3 = p1;
    p3.x = 100;

    // printing the variables of our point objects
    IO.println("P1: " + p1.x + ", " + p1.y);
    IO.println("P2: " + p2.x + ", " + p2.y);
    IO.println("P3: " + p3.x + ", " + p3.y);

    Point a = new Point(5, 10);
    Point b = new Point(0, 0);

    IO.println("A: " + a.x + ", " + a.y);
    IO.println("B: " + b.x + ", " + b.y);

    double distance = a.distanceTo(b);
    a.printMe("a");
    b.printMe("b");
    IO.println("Distance from a to b: " + distance + ".");
}

// declare class
class Point {
    // declare instance variables
    double x;
    double y;

    // default constructor
    Point() {
        this.x = 0;
        this.y = 0;
    }

    // constructor
    Point(double initX, double initY) {
        // initialize instance variables
        this.x = initX;
        this.y = initY;
    }

    // method to calculate distance to a second point
    double distanceTo(Point other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    void printMe(String label) {
        IO.println(String.format("%s(%.3f, %.3f)", label, this.x, this.y));
    }
}

