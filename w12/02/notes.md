# Week 12 Notes

## Static

see section 01 notes

## System, Scanner

- System has static variables for two `PrintStream`s and an `InputStream`: out, err, and in
    - `PrintStream` has convenient `print`, `println`, and `printf` methods for outputting text
    - `InputStream` does not have very convenient methods; it's a lower level class and usually
      not something you'll work with directly
- See Input.java for an example of how complicated it can get to work with System.in directly
- scanner can be constructed to read from an `InputStream` like System.in,
  and it contains more convenient methods for reading input as text
