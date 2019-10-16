public class RecursionEx {

	public static void main(String[] args) {
		
	}
	
	private static int factorial(int n) {
		if (n == 1) { // stop condition
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}
	
	private static int calcFibonacci(int sequenceNum) {
		if (sequenceNum <= 1) {
			return 1;
		} else {
			return calcFibonacci(sequenceNum - 1) + calcFibonacci(sequenceNum - 2);
		}
	}
	
	private static void greet(int count) {
		System.out.println("I'm fine. How are you?");
		
		if (count > 1) {
			greet(count - 1);
		}
	}
}
