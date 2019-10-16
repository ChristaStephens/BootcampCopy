package co.grandcircus.teamplayers;

public class PlayersApp {

	/**
	 * What classes does this program contain?
	 * How are they related?
	 */
	public static void main(String[] args) {
		Player julie = new Player("Julie", 99);
		Player stanley = new Player("Stanley O'Toole", -10);
		
		Team pistons = new Team("Pistons", "Dwane Casey");
		
		TeamPlayer blake = new TeamPlayer("Blake Griffin", 23, pistons);
		TeamPlayer andre = new TeamPlayer("Andre Drummond", 0, pistons);
		
		System.out.println(julie);
		System.out.println(stanley);
		System.out.println(blake);
		System.out.println(andre);
	}
}
