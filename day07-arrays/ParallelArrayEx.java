package day7;

public class ParallelArrayEx {

	public static void main(String[] args) {
		// Create multiple arrays of same length.
		// Elements line up by index.
		String[] players = { "Mike", "Chauncey", "Rasheed", "Sam" };
		int[] jerseyNumbers = { 23, 3, 36, 7 };

		// choose player and jersey with same index.
		System.out.println(players[1] + " - #" + jerseyNumbers[1]);
		
		for (int i = 0; i < players.length; i++) {
			System.out.println(players[i] + " - #" + jerseyNumbers[i]);
		}
	}

}
