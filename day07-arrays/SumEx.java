package day7;

public class SumEx {

	public static void main(String[] args) {
		// Shortcut for defining and filling an array
		int[] numbers = { 2, 3, 5, 7 };
		
		// Example with enhanced for
		int sum = 0; // start the sum at zero
		for (int num : numbers) {
			sum += num; // each time through the loop add one number to sum
		}
		// At the end of the loop, we have the total sum.
		System.out.println("Total sum is: " + sum);
		
		System.out.println("Total sum is also: " + calcSum(numbers));
	}
	
	private static int calcSum(int[] numbers) {
		// Example with for loop
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}

}
