# Week 2 Notes

## Java

- Java is not Javascript
- object-oriented: program is modeled in terms of objects, objects are data + functions
- interpreted vs compiled languages
	- interpreted: interpreter reads source code and executes instructions
	- compiled: compiler converts source code into machine code that runs on the cpu
	- tradeoffs
		- interpreted
			- any computer with the interpreter can run the program from the source code
			- interpreter adds extra work, can be slower
		- compiled
			- need to compile multiple versions for multiple os/cpu combinations
			- compilation allows for more optimization
			- directly running machine code without interpreter in the middle is faster
	- java is both interpreted and compiled
		- javac converts .java files (java source code) into .class files (java bytecode)
		- java launches the Java Virtual Machine (JVM), which runs Java bytecode
- Running Java code
	- compile to a file with javac, run with java
	- (our method) compile to memory (RAM) and run with java
	- can also bundle class files into a jar for distribution
	- jshell
		- jshell is a REPL (Read, Execute, Print, Loop)
		- jshell interprets snippets of code and is good for experimenting or quickly testing something
		- not ideal for reading user input

## Text Files

- text vs binary
	- text files only contain text
	- binary files contain something other than text, maybe also text
- text examples: .txt, .md (markdown), .java (or other source code)
- binary examples: images, audio, video, compiled code (.class for java), Word docs, pdfs
- file extensions are just hints, don't affect the file's contents
- Windows issue: programs may add a .txt to filenames, can end up with HelloWorld.java.txt

## Java Programs

Part 1: void main() {...}

- creates a function named "main"
- a function is a block of code that can be run by calling its name
- the name "main" is used for the entry point; the java command calls our main function to start the program
- void
	- some functions return information we can use in our code
	- void means the function does not return anything
- main
	- functions need a name, or identifier, to distinguish them from other functions
- ()
	- this is the parameter list
	- parameters are additional information required to call the function
	- main has no parameters
- {...}
	- this is a code block
	- function body; all the code that runs when you call the function

Part 2: IO.println("Hello World");

- displays the message "Hello World" to the user
- prints its message to standard output (shows up on terminal)
- IO
	- IO is a class; we don't need to know what a class is right now
	- creates a "namespace"
	- namespaces are similar to folders: help organize functions and other code, avoid name conflicts
- .
	- acts like a path separator (/ on linux/mac, \ on windows) for parts of a namespace
- println
	- the name of a function
	- this line is calling the println function
- (...)
	- arguments passed to the function go here
	- this is any information the function requires in order to run
- "Hello World"
	- a String; represents text data that the program can print or do something else with
- ;
	- most lines end in a semicolon

## Variables

Creating a variable:

var identifier = initial value;

- var
	- keyword that creates a new variable
	- not quite accurate, but good enough for now
- identifier
	- variables need names (identifiers) like functions
- =
	- assignment operator
	- sets the variable on the left equal to the value on the right
- initial value
	- whatever information we're storing in the variable
- ;
	- ends in a semicolon like the print statement

Example from Home.java:

var username = "zach";

Reassignment: change an existing variable

identifier = new value;

## I/O

Output functions

- IO.print(message)
- IO.println(message)
- IO.println()

Input functions

- IO.readln(prompt)
- IO.readln()

IO.readln returns text (a String) and should always be stored in a variable
