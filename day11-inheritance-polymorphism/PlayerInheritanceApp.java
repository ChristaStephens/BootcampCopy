
public class PlayerInheritanceApp {

	public static void main(String[] args) {
		Player david = new Player("David", 99);
		System.out.println(david);
		System.out.println(david.getName());
		
		BasketballPlayer mike = new BasketballPlayer();
		mike.setName("Mike");
		mike.setJerseyNumber(23);
		mike.setFreethrowPercentage(77.0);
		
		FootballPlayer barry = new FootballPlayer("Barry Sanders", 20, 100);
		
		// A basketball player IS A player
		Player p = new BasketballPlayer("bird", 33, 80.0);
		// A player is NOT a football player
//		FootballPlayer fp = new Player("Mr Potato Head", 0);
		
		p.getName();
//		p.getFreethrowPercentage(); // Does not work!
		( (BasketballPlayer) p ).getFreethrowPercentage();
		
		BasketballPlayer x = (BasketballPlayer) p; // I can force Java to accept it.

		// getClass tells us what's actually in the variable
		System.out.println( david.getClass() ); // Class Player
		System.out.println( mike.getClass() ); // Class BasketballPlayer
		System.out.println( barry.getClass() ); // Class FootballPlayer
		System.out.println( p.getClass() ); // Class BasketballPlayer
		
		// is what's actually in the variable the given class or any subclass
		System.out.println( p instanceof Player ); // true, a BasketballPlayer is a Player
		System.out.println( p instanceof BasketballPlayer ); // true, a BasketballPlayer is a BasketballPlayer
		System.out.println( p instanceof FootballPlayer ); // false, a BasketballPlayer is not a FootballPlayer
		
		david.score();
		barry.score();
		mike.score();
		
//		david.scoreBasket(); // cannot
//		barry.scoreBasket(); // cannot
		mike.scoreBasket();
	}

}
