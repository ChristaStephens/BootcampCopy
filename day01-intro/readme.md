# Day 1 - Variables, Types, Intro

* Type conversion -
  * widening (implicit *cast*): eg: int -> long
  * narrowing (explict cast): eg: long -> int  code sample: `long x = 2; int y = (int) x;`
  * automatically happens with mathematical operators
  * converting decimal type to integer type truncates decimals: eg: 3.8 -> 3
  * expression (or value) has a type. context (variable) has its own type.
* primitive types: (stack, like drawers in a kitchen) (cannot be null)
  * 4 integer types: byte, short, *int*, long
  * 2 decimal types: float, *double*
  * boolean
  * char
* reference types: (heap, like elephant in the shed)
  * String, Scanner
  * *null* - special value for a reference variable that references nothing
* Compiling and running
  * C/C++ - compiled separately for each CPU instruction set. runs faster.
  * Java - compiled once to *bytecode*. runs on JVM specific to each CPU architecture.
* Declare: create it. you have to give it a type.
* Assign: setting the value of a variable.
* Initialize: the first time you assign.
* Constant: a variable that cannot be changed. e.g. `final String BEST_CITY = "Detroit";`
* Comments: inline (//) and block (/* ... */)
* Identifier: a name of something (variable, class, method, etc.)
* Operators: arithmetic, assignment, increment, decrement
* Keywords: built-in words in Java language. e.g. for, while, if, class
* Scanner: used for *console* input (*stdin "Standard IN"*)
  * next, nextInt(), nextDouble(), nextLine(), etc.
* System.out.print/println: used for console output (*stdout "Standard OUT"*)