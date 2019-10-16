package day7;
import java.util.Arrays;

public class ArrayMethodsEx {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		
		// Fill entire array.
		Arrays.fill(numbers, 100);
		
		// Fill part of the array - give start and end indexes
		Arrays.fill(numbers, 0, 3, 10);
		Arrays.fill(numbers, 3, numbers.length, 20);
		numbers[2] = 30;
		
		System.out.println(Arrays.toString(numbers));
		
		char[] array1 = { 'a', 'b', 'c' };
		char[] array2 = { 'a', 'b', 'c' };
		
		if (Arrays.equals(array1, array2)) {
			System.out.println("EQUAL");
		} else {
			System.out.println("NOT EQUAL");
		}
		
		
	}

}
