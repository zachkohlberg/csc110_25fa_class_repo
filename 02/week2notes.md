# Week 2 Notes

## Java

- Java is not Javascript
- object-oriented: model program in terms of objects (data + functions)
- compiled vs interpreted
	- source code: text written in a programming language
	- machine code: binary instructions the cpu can understand
	- compiled: a compiler converts your source code into machine code that runs on cpu
	- interpreted: an interpreter runs your code and executes those instructions
	- tradeoffs
		- compilation:
			- compiler can optimize everything
			- run directly on cpu with no middleman (the interpreter), faster
			- need to compile multiple versions to support different cpus and os
		- interpreter:
			- another program has to run your code, slower
			- any computer with the interpreter can run your code
			- web browsers include a javascript interpreter that runs javascript
	- java has a compromise:
		- java code is compiled to bytecode (.class files)
		- the Java Virtual Machine (JVM) runs java bytecode
- running Java programs:
	- compile to file: javac compiles to a file, then run class file with java
	- (our method) java can compile in-memory (into RAM, not a file)
	- can also bundle into a .jar file for distribution
	- jshell: REPL/java interpreter
		- REPL: Read, Execute, Print, Loop
		- great for testing small snippets of code

## Text Files

- text vs binary
	- text: file just contains plain text
	- binary: file contains stuff other than text
- text examples: .txt, .md (markdown), .java (or other source code)
- binary examples: images, audio, video, compiled code (.class files for Java), .doc
- Windows issue: HelloWorld.java.txt

## Java Programs

Part 1: void main() {...}

- creates a function with the name "main"
- function: named block of code, we can run it by invoking its name
- main is program's entry point, java command runs it to start the program
- void
	- this function doesn't return anything we can use
- main
	- the name (identifier) of the function
- ()
	- the function has no parameters; it doesn't need any additional information to run
- {...}
	- curly braces wrap the function's body; this is the code that runs when we call the function

Part 2: IO.println("Hello World");

- a print statement that displays "Hello World" to the user
- IO
	- IO is a class, but that's not important
	- IO's **purpose** is to be a namespace
	- namespaces allow organization and reusing common names without conflict
	- very similar to folders on your computer
	- Java uses classes, packages, and modules for namespacing
	- Other languages have their own methods for namespacing
	- IO stands for "input and output"
- .
	- dots connect parts of a namespace, like / (or \ on Windows) in file paths
- println
	- name of a function that prints to standard output
	- we are calling the println function (running that function's code)
- (...)
	- contain any arguments for the function call
	- arguments are info required for the function to run
- "Hello World"
	- a String, or text, passed to println
- ;
	- most lines of code end in a semicolon

## Variables

- A variable is a name associated with a piece of information (value)

var identifier = initial value;

- var
	- makes a new variable
	- that's a lie, but close enough to the truth for now
- identifier
	- the variable's name
- =
	- assignment operator
	- stores a value in a variable
- initial value
	- the first value stored in that variable
- ;
	- again, most lines end with this

Example from Home.java:

var username = "zach";

Reassignment: change the value in an existing variable

identifier = new value;

## I/O

Output functions

- IO.print(message)
- IO.println(message)
- IO.println()

Input functions

- IO.readln(prompt)
- IO.readln()

When reading input, you should always assgn it to a variable:

// new variable
var input = IO.readln...

// or existing variable
input = IO.readln...

## Summary: Your Tools

Run a Java program:

java --enable-preview ProgramName.java

Java program structure:

void main() {
	// your code goes here...
}

Print output:

IO.print(...);
IO.println(...);

Read input:

var variableName = IO.readln(...);
