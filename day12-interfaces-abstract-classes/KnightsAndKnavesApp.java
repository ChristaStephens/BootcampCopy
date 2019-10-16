package day12;

/**
 * This class is correct. Do not change it. Follow these instructions to resolve the errors.
 * Then run the main.
 * 
 * Create abstract Islander class with a private name field and getters & setters.
 * Add abstract isKnight, isKnave, and isTellsTruth methods.
 * Each method takes no parameters and returns a boolean.
 * 
 * Create concrete Knight class that extends Islander.
 * Give it a constructor that sets the name via a parameter.
 * isKnight returns true, isKnave returns false, isTellsTruth returns true
 * 
 * Create concrete Knave class that extends Islander.
 * Give it a constructor that sets the name via a parameter.
 * isKnight returns false, isKnave returns true, isTellsTruth returns false
 */
public class KnightsAndKnavesApp {
	
	public static void main(String[] args) {
		scenario1(new Knight("Zoey"), new Knave("Mel"));
		scenario2(new Knave("Peggy"), new Knave("Zippy"));
	}
	
	private static void scenario1(Islander zoey, Islander mel) {
		// zoey says mel is a knave
		if (zoey.isTellsTruth() != mel.isAKnave()) {
			System.out.println("Contradiction!");
		// mel says neither of us is a knave
		} else if (mel.isTellsTruth() != ( !zoey.isAKnave() && !mel.isAKnave() )) {
			System.out.println("Contradiction!");
		} else {
			System.out.println("Valid.");
			System.out.println(zoey.getName() + " is a " + zoey.getClass().getSimpleName());
			System.out.println(mel.getName() + " is a " + mel.getClass().getSimpleName());
		}
	}
	
	private static void scenario2(Islander peggy, Islander zippy) {
		// peggy says only one of us is a knight
		if (peggy.isTellsTruth() != ( peggy.isAKnight() ^ zippy.isAKnight())) {
			System.out.println("Contradiction!");
		// zippy says only a knave would say peggy is a knave
		} else if (zippy.isTellsTruth() != ( !peggy.isAKnave() )) {
			System.out.println("Contradiction!");
		} else {
			System.out.println("Valid.");
			System.out.println(peggy.getName() + " is a " + peggy.getClass().getSimpleName());
			System.out.println(zippy.getName() + " is a " + zippy.getClass().getSimpleName());
		}
	}

}
