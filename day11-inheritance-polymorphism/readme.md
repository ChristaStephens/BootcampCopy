## Inheritance & Polymorphism
* 4 Object-Oriented Principles
  1. Abstraction - hides the details and only shows functionality
  2. Encapsulation - wrapping related functionality (methods) and data (variables) together as one unit (class). In other words, a class can have variables and methods.)
  3. Inheritance - a class acquiring properties (fields) and behaviors (methods) of a parent class
     - a parent / children
  4. Polymorphism - Same task can be done in different ways depending on the object’s type.  You can treat an instance of a child class as if it's an instance of the parent class.
     - only works because of inheritance
* child class/parent class, sub class/super class, derived class/base class
* `extends` keyword used to identify the parent of a class
* override - a child class has its own version of a method from the parent class
* `@Override` - an annotation that indicates that we intend to override a method
* `final`
  - variable - can't change it (constant)
  - method - can't override it
  - class - can't extend it
* access modifiers
  - public - accessible in any class
  - protected - accessible only in this package *and subclasses*
  - package private (default) - accessible only in this package
  - private - accessible only in this class