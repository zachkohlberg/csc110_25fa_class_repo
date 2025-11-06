# Week 11 Notes

- namespace: organizes code to avoid name conflicts, can reuse the same
  name in different namespaces
- Java uses modules, packages, and classes as namespaces
    - example package: `java.lang` contains classes like `Math` and `String`,
      stuff that's commonly used in Java programs; these are all imported
      automatically by the compiler if your code uses them
    - example classes that act as namespaces: `Math`, `String`, `Integer`, `IO`
    - example static functions from these classes: `abs`, `min`, `format`,
      `parseInt`, `println`

## Inheritance

- if class Dog inherits from class Animal
    - Animal is the "superclass" or "parent class" of Dog
    - Dog is the "subclass" or "child class" of Animal
    - Dog gets all the code from Animal for free
- purpose:
    - create categories for polymorphism
    - reuse inherited code, less duplication
- the `extends` keyword is used to inherit from another class
- the `Object` class
    - in Java, every class directly extends exactly one other class
    - if you don't specify your superclass with `extends`, then the
      superclass is `Object`
    - every Java class is a direct or indirect subclass of `Object`
- we can override inherited methods
    - if we write a method with the same name, return type, and
      parameters as an inherited method, we have overridden that
      method
    - can be useful for specializing how an inherited method works
      for our class
