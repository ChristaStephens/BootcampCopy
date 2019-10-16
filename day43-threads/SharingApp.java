package co.grandcircus.threads;

public class SharingApp {
	
	public static void main(String[] args) {
		Thread tomThread = new Thread(new GreedyKid("Tom"));
		Thread sueThread = new Thread(new GreedyKid("Sue"));
		Thread jimThread = new Thread(new GreedyKid("Jim"));
		
		tomThread.start();
		sueThread.start();
		jimThread.start();
	}

}
