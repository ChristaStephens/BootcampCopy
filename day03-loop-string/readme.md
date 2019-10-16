## Loops
* for - counting, repeating a specified number of times
* while - don't know in advance how many time to repeat. check the condition at the beginning of each iteration
* do while - like while, but will always iterate at least once. checks condition at the end of each iteration
* enhanced for loop - iterating arrays and collections
* iteration - one time throught the loop. each cycle of the loop.
* break - terminates a loop
* continute - skips the rest of the current iteration

## Strings
* immutable - an object whose state cannot be modified after it is created. For strings... you can replace the string, but you can't change what's inside
* index - characters in a string are numbered. Starts at 0.
* For Strings, use methods (e.g. .equals(), .equalsIgnoreCase) instead of operators.
* There are lot of cool string methods (aka functions) - you can find those in the Oracle Java Docs.
* concatenate
* StringBuffer - growable and writable character sequence. mutable. Like a string, but it can be modified.
* StringBuilder - Like StringBuffer but it is not synchronized / thread-safe. (Recommened to use this one unless need synchronization.)