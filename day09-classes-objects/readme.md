## Objects and Classes
* class - a template or blueprint for making an object (e.g. Cat)
* object - an instance of a class (e.g. Mr. Fluffernutter)
* instance variable - can have any type, just like a regular variable. declared within the class, and outside of any methods. does NOT have `static`. Belongs to the instance (a.k.a. object). e.g. `someVar.thing`.
* class variable - does have `static`. Belongs to the class. e.g. `SomeClass.thing`.
* instance methods - does NOT have `static`. Belongs to the instance (a.k.a. object). Can use instance variables.
* class methods - does have `static`. Belongs to the class. e.g. `SomeClass.thing`. Cannot use instance variables or use instance methods.
* constructor
  - a method that's used to initialize the state of an object. It's called when a new object is made.
  - has to be the same name & capitalization as the name of the class
  - don't not have a return type
  - are never static
  - you can have multiple constructors with different parameter type combinations
* default constructor - if you don't write any constructors, Java provides a default constructor that takes no arguments and does nothing. However, if you write any constructors at all, this default is not provided.
* `this` keyword is used to refer to instance variable and instance methods in the object where code is currently running. It is optional, but it is useful when you have two variables with the same name.
* getters and setters - provide controlled access to instance variables
* toString - all objects have a toString for converting to a String. You can override (i.e. customize) it for your class. It is automatically called by System.out.print.
* Java Bean - a Java class that has private instance variables, one or more public constructors, public getters and setters. Might have a toString.
* @Override - optional annotation to inform Java that you intend to override and existing method