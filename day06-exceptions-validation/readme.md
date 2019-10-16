## Exceptions
* `try` - block of code where an exception might happen
* `catch` - if an exception happens in the try block, the catch block for that exception will run. you can write code here to handle the problem
  - each catch block is for a specific exception type (or category)
  - there can be multiple catch blocks
  - one catch block can specify multiple type of exceptions. they're separated with a `|`. (a.k.a. multi-catch block)
* `finally` - optional block at end of try-catch that will always run, no matter whether there is an exception or not. We often use this to clean up--for example closing the scanner or a file.
* You can create your own exception types. Create a class that extends Exception or RuntimeException.
* Use `throw` to trigger an exception.
* There is a hierarchy of exceptions.
* `throws` keyword used in a method declaration to identify what exceptions a method might throw.
* Two main categories of exceptions
  - Checked - try/catch is NOT optional
  - Unchecked - try/catch is optional
* Stack trace - prints to the console when there is an uncaught exception. Shows as red in Eclipse console. Includes several clues
  - the type of the exception
  - a message describing the exception
  - the file and line of code where the exception occurred
  - the list of methods and lines that were called to get to that spot in the code

## Debugging
* Three kinds of errors
  - Syntax Error (Compile Error) - Red in Eclipse. Cannot run the program.
  - Runtime Error (Exception) - throws an Exception
  - Logic Error - The program runs, but doesn't do what you want it to.