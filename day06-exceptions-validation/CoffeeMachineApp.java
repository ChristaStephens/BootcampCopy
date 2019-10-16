import java.util.Scanner;

public class CoffeeMachineApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		while (true) {
			System.out.println("What drink would you like?");
			String selection = scnr.nextLine().toLowerCase();
			
			switch (selection) {
			case "coffee":
				serveCoffee();
				break;
			case "latte":
				serveLatte();
				break;
			case "mocha":
				serveMocha();
				break;
			case "shut down":
				scnr.close();
				System.out.println("Shutting down... Goodbye.");
				return;
			default:
				System.out.println("Invalid choice.");
				break;
			}
		}
	}

	private static void serveCoffee() {
		System.out.println(getCoffee());
	}

	private static void serveLatte() {
		System.out.println(getEspresso() + " with " + getMilk());
	}

	private static void serveMocha() {
		System.out.println(getEspresso() + " with " + getMilk() + " and " + getChocolate());
	}
	
	private static String getCoffee() {
		return "Coffee";
	}
	
	private static String getEspresso() {
		return "Espresso";
	}
	
	private static String getMilk() {
		return "steamed milk";
	}
	
	private static String getChocolate() {
		return "chocolate sauce";
	}
	
}
