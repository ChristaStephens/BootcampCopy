## Abstract Clases and Interfaces
* Interfaces and abstract classes provide a way to categorize classes so that they can be used interchangeably.
* Abstract classes (like any parent class) also provide a way to share variables and code between subclasses.


* Abstract class
  - "unfinished class"
  - cannot instantiate it. (Cannot use `new`)
  - should extend it. (Make child clases)
  - PRO: can have everything concrete classes can have plus abstract methods
  - CON: a class can only extend one other class or abstract class
* Interface
  - "a contract that any class that implements it must have these methods"
  - PRO: a class can implement multiple interfaces
  - CON: cannot have data (neither instance nor static variables)
  - usually only has abstract methods
  - may have static constants and default methods
* Abstract method
  - "placeholder method"
  - has no body
  - a guarantee that subclasses will have this method
  - Subclasses must implement (override) this method.

## Enums
Short for enumeration. Provides a set list of options, e.g. GREEN, RED, and YELLOW for a traffic signal.

Enums may also have data and methods associated with them.
