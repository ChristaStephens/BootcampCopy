package co.grandcircus.threads;

public class LetterCounter implements Runnable {

	// in milliseconds (1000 milliseconds = 1 second)
	private long pauseTime = 0;

	public LetterCounter(long pauseTime) {
		this.pauseTime = pauseTime;
	}

	@Override
	public void run() {
		try {
			final int A = (int) 'A'; // ASCII code for A
			final int Z = (int) 'Z'; // ASCII code for Z
			for (int i = A; i <= Z; i++) {
				Thread.sleep(pauseTime); // Pause the current thread for x milliseconds
				System.out.println((char) i); // Print character with this ASCII code
			}

		} catch (InterruptedException ex) {
			// In this case, if a thread is interrupted, just let it end.
		}
	}

}
