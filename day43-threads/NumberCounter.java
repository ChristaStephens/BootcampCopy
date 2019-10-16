package co.grandcircus.threads;

public class NumberCounter implements Runnable {

	// in milliseconds (1000 milliseconds = 1 second)
	private long pauseTime = 0;

	public NumberCounter(long pauseTime) {
		this.pauseTime = pauseTime;
	}

	@Override
	public void run() {
		try {

			for (int i = 1; i <= 50; i++) {
				Thread.sleep(pauseTime); // Pause the current thread for x milliseconds
				System.out.println(i);
			}

		} catch (InterruptedException ex) {
			// In this case, if a thread is interrupted, just let it end.
		}
	}

}
