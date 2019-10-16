import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CheckedExceptionEx {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter an integer");
		String userNumberInput = scnr.next();
		
		System.out.println("Enter a date (mm/dd/yyyy)");
		String userDateInput = scnr.next();
		
		// parseInt throws NumberFormatException, which is unchecked.
		// We are not required to catch it.
		int number = Integer.parseInt(userNumberInput);
		System.out.println(number);
	
		try {
			// SimpleDateFormat.parse throws ParseException, which is checked.
			// We are required to catch it.
			Date date = new SimpleDateFormat("MM/dd/yyyy").parse(userDateInput);
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		scnr.close();
	}
	
}
