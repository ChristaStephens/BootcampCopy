package co.grandcircus.threads;

public class GreedyKid implements Runnable {

	// Since it's static all instances share the same ball object.
	private static Object ball = new Object();

	private String name;

	public GreedyKid(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		try {
			System.out.println(name + " wants the ball.");
			// With the synchronized block, each thread needs to get a lock on the ball
			// Only one thread can have the lock at a time.
			// The general point of synchronized is to make sure multiple threads aren't messing
			// with the same variables at the same time. Only one is allowed to be in the
			// synchronized block at a time.
			synchronized(ball) {
				System.out.println(name + " has the ball.");
				Thread.sleep(3000);
				System.out.println(name + " released the ball.");
			}
		} catch (InterruptedException ex) {
			// In this case, if a thread is interrupted, just let it end.
		}
	}

}
