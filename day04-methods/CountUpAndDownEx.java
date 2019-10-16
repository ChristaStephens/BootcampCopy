
public class CountUpAndDownEx {

	public static void main(String[] args) {
		countUp(5);
		System.out.println("-----");
		countDown(10);
	}
	
	private static void countUp(int limit) {
		for (int i = 1; i <= limit; i++) {
			System.out.println(i);
		}
	}
	
	private static void countDown(int start) {
		for (int i = start; i >= 1; i--) {
			System.out.println(i);
		}
	}
}
