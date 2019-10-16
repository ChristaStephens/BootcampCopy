package co.grandcircus.threads;

import java.util.Scanner;

public class ThreadsApp {

	public static void main(String[] args) throws InterruptedException {
		Scanner scnr = new Scanner(System.in);
		
		LetterCounter letterCounter = new LetterCounter(250);
		NumberCounter numberCounter = new NumberCounter(130);
		
		letterCounter.run();
		numberCounter.run();
		
//		Thread letterCounterThread = new Thread(letterCounter);
//		Thread numberCounterThread = new Thread(numberCounter);
//		
//		letterCounterThread.start();
//		numberCounterThread.start();
//		System.out.println("Our main program keeps going.");
		
//		System.out.println("Enter you name.");
//		String name = scnr.nextLine();
//		System.out.println("Hello " + name);
		
//		letterCountThread.join();
//		numberCounterThread.join();
//		System.out.println("Or we can stop and wait for other threads to finish.");
		
		scnr.close();
	}
}
