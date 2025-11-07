# Week 11 Notes

Classes as containers/namespaces

- namespace: organizes code to avoid name conflicts, code in two different namespaces
  can use the same name for a class or function
- Java uses modules, packages, and classes to create namespaces
- package example: `java.lang` frequently used or essential classes that most Java
  programs might want access to, imported on demand automatically in all java programs
- classes that act as namespaces for static functions: `Math` and `IO` are just containers
  for functions, while `String` and `Integer` contain static functions and represent a type of
  object
- static functions in the above classes: `abs`, `min`, `println`, `readln`, `format`, `parseInt`

Classes as types

- class: defines a type of object
- instance: an object created based on a class

## Inheritance

- Animal
    - Dog
        - GoldenRetriever
        - Chihuahua
    - Cat
- `extends` is a keyword used to say which class another class inherits from
- if Dog extends Animal
    - Animal is the "superclass" or "parent class" of Dog
    - Dog is the "subclass" or "child class" of Animal
    - Dog inherits all of the variables and methods in Animal
    - Code that operates on Animal objects can operate on Dog objects
- `Object` class
    - every Java class extends extends exactly one other class
    - if you don't specify a superclass, then you extend Object
    - Object is the direct or indirect superclass of every other Java class
    - Object contains a few methods, including `.equals(Object)` and `.toString()`
      that some classes may want to override
- overriding: create a method with the same name, return type, and parameter types
  as an inherited method





