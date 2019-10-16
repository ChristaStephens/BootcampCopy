public class PassByValueEx {
	
	public static void main(String[] args) {
		String greeting = "Hello";
		int x = 5;
		globalize(greeting);
		increment(x);
		
		System.out.println("In main " + greeting);
		System.out.println("In main " + x);
	}
	
	private static void increment(int x) {
		System.out.println("In increment (before) " + x);
		x++;
		System.out.println("In increment (after) " + x);
	}
	
	private static void globalize(String greeting) {
		System.out.println("In globalize (before) " + greeting);
		greeting += " World!";
		System.out.println("In globalize (after) " + greeting);
	}
	
}
