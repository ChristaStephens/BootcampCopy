package co.grandcircus.threads;

/**
 * StringBuffer is thread safe. Multiple threads can call reverse at the same time, and they will not
 * interfere with each other.
 */
public class ThreadSafeStringBufferApp {

	private static StringBuffer sb = new StringBuffer("What a fine day for science!!");

	public static void main(String[] args) throws InterruptedException {
		Thread[] threads = { new Reverser(), new Reverser(), new Reverser(), new Reverser() };

		// start all threads roughly simultaneously
		for (Thread thread : threads) {
			thread.start();
		}
		// wait for all threads to finish
		for (Thread thread : threads) {
			thread.join();
		}

		System.out.println(sb);
	}

	private static class Reverser extends Thread {

		@Override
		public void run() {
			System.out.println(this.getName() + " START");
			// Each thread reverses the string 100 times.
			for (int i = 0; i < 100; i++) {
				sb.reverse();
			}
			System.out.println(this.getName() + " END");
		}
	}
}
