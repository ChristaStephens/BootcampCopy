import java.util.Scanner;

public class PigLatinApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter a word to translate.");
		String word = scnr.next();
		
		String translatedWord = translateWord(word);
		System.out.print(translatedWord);

		scnr.close();
	}
	
	private static String translateWord(String englishWord) {
		englishWord = englishWord.toLowerCase();
		int leadingConsonants = countLeadingConsonants(englishWord);
		boolean startsWithVowel = leadingConsonants == 0;
		
		if (startsWithVowel) {
			return englishWord + "way";
		} else {
			String prefix = englishWord.substring(0, leadingConsonants);
			String remainingLetters = englishWord.substring(leadingConsonants);
			return remainingLetters + prefix + "ay";
		}
	}
	
	private static int countLeadingConsonants(String word) {
		// loop through the letters in the word. When we hit the first
		// vowel, return how many consonants we counted before it.
		for (int i = 0; i < word.length(); i++) {
			if ( isVowel(word.charAt(i)) ) {
				return i;
			}
		}
		// If no vowels were found, the word is all consonants
		return word.length();
	}
	
	private static boolean isVowel(char letter) {
		return "aeiou".indexOf(letter) != -1;
	}

}
