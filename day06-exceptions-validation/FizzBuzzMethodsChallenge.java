public class FizzBuzzMethodsChallenge {
	
	// DO NOT change the main method or anything in it!
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (isDivisibleBy3(i)) {
				if (isDivisibleBy5(i)) {
					System.out.println("FizzBuzz");
				} else {
					System.out.println("Fizz");
				}
			} else if (isDivisibleBy5(i)) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}
	
	// TODO Declare a method named isDivisibleBy3 that takes an int
	// as input and returns a boolean.
	
	// TODO Declare a method named isDivisibleBy5 that takes an int
	// as input and returns a boolean.

}
