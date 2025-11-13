# Week 12 Notes

## Static

- instance ___: something local to an instance of a class
- static ___: only one copy of this for the entire class,
  each instance does NOT get its own copy

- instance variable: each instance of a class gets its own
- static variable: the class gets its own, all instances DO NOT

- instance method: called on a specific instance
- static method: just called from the class, might have
  nothing to do with instances of the class

## System, Scanner

- System has two `PrintStream` variables and one `InputStream` variable: out, err, and in
  - `PrintStream` has convenient functions for printing output
  - `InputStream` lacks convenient functions for reading input as Strings
- See Input.java for example of processing `InputStream` input and why you probably don't want
  to do this yourself
- Scanner has more convenient methods for reading input than an input stream, see Input2.java
