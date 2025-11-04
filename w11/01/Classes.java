void main() {
    // demonstrates what happens when we have a conflict between one of our names
    // and a name implicitly imported for us from java.lang
    Math.abs(-3); // fine: our Math includes an abs method
    Math.max(1, 2); // error: our Math doesn't include a max method
    java.lang.Math.max(1, 2); // fine: we're specifying the right Math class
}

// Example of a class that defines a new type of object
class Student {
    int id;
    String name;
}

/*
IO.println(...)
Math.max(...)
String.format(...)
Integer.parseInt(...)

IO, Math, String, and Integer are all classes in the java.lang package
println, max, format, and parseInt are all static functions declared in the aforementioned classes
*/

// Example of a class that just acts as a namespace for static functions
// Because we declared our own class, the compiler will use this when we
// type "Math" instead of the java.lang.Math class it would normally use
class Math {
    static int abs(int x) {
        if (x < 0) {
            return -x;
        } else {
            return x;
        }
    }
}

/*
java.lang: package
Math: class
abs: function/method

java.lang.Math.abs
java.lang.String
*/

