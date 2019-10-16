import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		try {
			System.out.println("Enter a number");
			int num = scnr.nextInt(); // this can throw InputMismatchException
			
			if (num < 0) {
				// You can trigger an exception manually. use throw.
				throw new LessThanZeroException(num + " is less than zero");
			}
			
			System.out.println(100 / num); // this can throw ArithmeticException
		} catch (InputMismatchException ex) {
			// Each catch defines a specific type of exception to handle
			System.out.println("That was not a valid integer.");
		} catch (ArithmeticException | LessThanZeroException ex) {
			// A single block can handle multiple exception types, using |
			System.out.println("Number must be positive.");
		} catch (RuntimeException ex) {
			// A catch can specify a larger category of exception to handle
			System.out.println("Something went wrong.");
		} finally {
			// This is usually used to clean up. e.g. closing scanners and files
			System.out.println("And finally, this will always print");
		}

		scnr.close();
	}

}
