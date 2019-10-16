package gcdemos;

public class ForEx {

	public static void main(String[] args) {
		
		// Count from 1 to 10
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		// this is equivalent to this while loop
		int j = 1;
		while (j <= 10) {
			System.out.println(j);
			j++;
		}
		
		// Count from 10 to 1
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		
		// Count from 2 to 20, counting by 2s
		for (int i = 2; i <= 20; i += 2) {
			System.out.println(i);
		}
		
		// Standard way to do something 5 times
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello");
		}

	}

}
