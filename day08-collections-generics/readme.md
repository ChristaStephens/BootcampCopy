## Collections & Generics
* List - ordered collection with indexes that can grow and shrink
  - ArrayList - implementation using an array under the hood
  - LinkedList - implementation using a chain of nodes under the hood
* Set - (usually) unordered collection that cannot have duplicates
  - HashSet - typically faster
  - TreeSet - sorted
* Map - collection with values referenced by keys (key-value pairs)
  - HashMap - typically faster
  - TreeMap - sorted
* Queue - FIFO first in-first out (implemented with LinkedList). offer, poll, peek
* Stack - LIFO last in-first out. push, pop, peek


* Collections cannot store primitive types, instead we use *primitive wrappers* (e.g. Integer, Float, Character, Boolean)
* Autoboxing - Java automatically converts back and forth between the primitive and it's wrapper.
* Hash function - a function that takes data from a wide range and narrows it to a limited range. Specifically in Java, any data and reduce it to an int. Every object has a `.hashCode()` method that provides the calculated hash.
* Generics - how we specify the type contained by a collection using angle brackets.