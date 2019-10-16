import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MathApp {
	
	private static List<MathOperation> operations = new ArrayList<>();

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		operations.add(new DavidOperation());
		// TODO Add your own operation to the list here.
		
		System.out.print("Enter a number: ");
		int number = scnr.nextInt();
		
		System.out.println("Starting number: " + number);
		for (MathOperation op : operations) {
			System.out.println("Executing " + op.getName());
			number = op.exec(number);
			System.out.println("result: " + number);
		}
		System.out.println("Final result: " + number);

		scnr.close();
	}
}
