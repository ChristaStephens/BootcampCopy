import java.util.ArrayList;
import java.util.List;

public class PlayerApp {

	public static void main(String[] args) {
		Player p1 = new Player();
		p1.name = "Mike";
		// to access a non-static variable, use object.
		p1.jerseyNumber = 23;
		
		// to access a static variable, use ClassName.
		System.out.println(Player.maxJerseyNumber);
		// Cannot access an instance variable using class name.
//		System.out.println(Player.name);
		System.out.println(Player.isValidJerseyNumber(17));
		System.out.println(Player.isValidJerseyNumber(1024));
		
		
		Player p2 = new Player();
		p2.name = "Messi";
		p2.jerseyNumber = 10;
		
		System.out.println(p1.name + " wears " + p1.jerseyNumber);
		System.out.println(p2.name + " wears " + p2.jerseyNumber);
		
		List<Player> players = new ArrayList<>();
		players.add(p1);
		players.add(p2);
		players.add(new Player());
		players.add(new Player("Curry", 30));
		
		for (Player p : players) {
			System.out.println(p.name + " wears " + p.jerseyNumber);
		}
	}

}
