# Week 11 Notes

## Inheritance

- classes in Java "extend" exactly one other class, called their "superclass"
  or "parent class"
- you can specify a superclass with the `extends` keyword, but if you don't
  then your class automatically extends a class called `Object`
- the class that extends something is called the "subclass" or "child class"

the Object class

- is the superclass of every other class, either directly or indirectly
- contains a `.equals(Object)` method and a `.toString()` method, which
  every other class inherits
- classes can override inherited methods, which means they redefine how
  it works but keep the return type, name, and parameter types the same
- we can override `.equals()` to make our classes easy to compare
- we can override `.toString()` to make our classes easy to print
