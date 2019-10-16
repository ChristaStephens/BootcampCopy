package gcdemos;

public class BreakContinueEx {

	public static void main(String[] args) {
		
		int tootsieDiameter = 1000;
		int lickPower = 3;
		int count = 0;
		
		while (tootsieDiameter > 0) {
			// lick
			tootsieDiameter -= lickPower;
			// count
			count++;
			
			// CRUNCH!
			if (count == 3) {
				break;
			}
		}
		
		System.out.println("It takes " + count);
		
		
		// CONTINUE EXAMPLE
		for (int i = 0; i < 5; i++) {
			System.out.println("BEFORE " + i);
			
			if (i > 2) {
				continue;
			}
			
			System.out.println("AFTER " + i);
		}
		
		

	}

}
