# Week 2 Notes

## Java

- object-oriented
- portable
  - interpreted: code is run by an interpreter
    - slower
    - more portable
  - compiled: program is converted to machine code by compiler
    - faster, can be highly-optimized
    - need to compile multiple versions
    - example: c, c++
  - compiled to "bytecode"
    - can optimize code during compilation
    - Java bytecode run by the Java Virtual Machine (JVM)
    - example: javascript (web browsers have js interpreter), python
- running Java code
  - compile, then run:
    - javac compiles .java code to .class files containing bytecode
    - java runs a .class file on the JVM
  - (we'll de this one) java can also run .java files
    - compiles code in-memory (into RAM instead of to a file)
    - runs the compiled code
  - jshell is a REPL/java interpreter
    - useful for seeing the result of small pieces of Java code
    - REPL: Read, Execute, Print, Loop
    - not ideal for reading user input

## Text Files

- text vs binary
  - text = just text
  - binary = maybe text, but some amount of non-text data
- text files include:
  - .txt files
  - .md (markdown)
  - .java files, any other source code
- binary files include
  - .doc files and other documents
  - .pdf files
  - images
  - audio
  - video
  - .class files (or other compiled code)
  - executables
- files extensions don't change the file's format

## Java Programs (Compact Source)

- Must run with `java --enable-preview ProgramName.java` on Java 24
- In Java 25, just `java ProgramName.java`
- HelloWorld breakdown:

Function: a chunk of code that we can run by calling the function by name

void main() {...}

main is a special function: main is the entry point for our program and will be called by the java command

Pieces of main:

- void: this function doesn't return any information we can use
- main: the function's name or identifier
- (): the parameter list; what kind of input main requires when called
- {...}: curly braces wrap the body of the function; the code that it runs

Print statement:

IO.println("Hello World");

Pieces of our print statement:

- IO: namespace
  - namespaces divide program into different parts
  - the same name can be reused in different namespaces without conflict
  - good analogy: namespaces are like folders
  - different languages have different mechanisms for creating namespaces
  - technically, IO is a "class"
- .: a dot joins namespaces with functions and other objects inside of them
  - kind of like the path separator in your filesystem (/ on Mac/Linux, \ on Windows)
- println: another function name, this time we're calling the function
- (...): contain the arguments, or information we provide to the function call
- "Hello World": a String, or the text we're printing
- ;: most lines of code have to end with a semicolon

## Variables

- Can assign a piece of data, like "Hello World", to a variable name
- Using the variable name in your code will retrieve that data

var identifier = initial value;

Creating a variable

- var
  - indicates we're making a new variable
- identifier
  - the variable's name
- =
  - tells Java to assign a value to that variable
- initial value
  - whatever data we want to assign to the variable
- ;
  - variable creation also ends with a semicolon

var username = "zach";

- creates a variable called username that stores the text "zach"

Reassigning a variable:

identifier = new value;

- changes the value of a variable we already created

## I/O Functions

Output:

- IO.println(message)
- IO.println()
- IO.print(message)

Input:

- IO.readln(prompt)
- IO.readln()

Input must be stored in a variable:

var input = IO.readln(...

or

input = IO.readln(...

## Summary: Puzzle Pieces

Try to complete the coding practice with the following tools.
Think of them as puzzels, and there are your pieces.

Run a Java program:

java --enable-preview Program.java

Java program structure:

void main() {
	// your code goes here
}

Print output:

IO.print(...);
IO.println(...);

Prompt for input:

var variableName = IO.readln(...);

