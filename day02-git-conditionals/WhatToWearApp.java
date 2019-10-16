package gcdemos;

import java.util.Scanner;

public class WhatToWearApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("What kind of event?");
		String eventType = scnr.next();
		System.out.println("What's the temperature?");
		int temperature = scnr.nextInt();
		
		String eventClothing, tempClothing;
		
		// Option 1
		if (eventType.equals("casual")) {
			eventClothing = "something comfy";
		} else if (eventType.equals("semi-formal")) {
			eventClothing = "a polo";
		} else {
			eventClothing = "a suit";
		}
		
		// Option 2
		switch (eventType) {
		case "casual":
			eventClothing = "something comfy";
			break;
		case "semi-formal":
			eventClothing = "a polo";
			break;
		case "formal":
			eventClothing = "a suit";
			break;
		}
		
		// Option 1
		if (temperature < 54) {
			tempClothing = "a coat";
		} else if (temperature > 74) {
			tempClothing = "no jacket";
		} else {
			tempClothing = "a jacket";
		}
		
		// Option 2
		if (temperature < 54) {
			tempClothing = "a coat";
		} else if (temperature >= 54 && temperature <= 74) {
			tempClothing = "a jacket";
		} else {
			tempClothing = "no jacket";
		}
		
		
		System.out.println("Because it's " + temperature +
				" degrees and you're going to a " + eventType +
				" event, you should wear " + eventClothing + " and " +
				tempClothing + ".");
		scnr.close();
	}

}
