import java.text.SimpleDateFormat;
import java.util.Locale;

public class MiscMethodsEx {

	public static void main(String[] args) {
	}
	
	private static void sayHello() {
		System.out.println("Hello world!");
	}
	
	private static void tellJoke() {
		System.out.println("Have you heard of the band called 1023MB?");
	}
	
	private static void tellPunchline() {
		StringBuilder sb = new StringBuilder("Tvsfefp}$rsx2$Xli}$lezir+x$ksx$e$kmk$}ix%");
		for (int i = 0; i < sb.length(); i++) {
			sb.setCharAt(i, (char) (sb.charAt(i) - 4));
		}
		System.out.println(sb);
		System.out.println(" - niceonedad.com");
	}
	
	private static void printName(String firstName, String lastName) {
		System.out.println(firstName + " " + lastName);
	}
	
	private static int square(int num) {
		return num * num;
	}
	
	private static int cube(int num) {
		return num * num * num;
	}
	
	private static int squareRoot(int num) {
		return (int) Math.round(Math.sqrt(num));
	}
	
	private static void repeat(String message, int count) {
		for (int i = 0; i < count; i++) {
			System.out.println(message);
		}
	}
	
	private static String getDayOfWeek() {
		return new SimpleDateFormat("EEEE", Locale.ENGLISH).format(System.currentTimeMillis());
	}
	
	private static String capitalize(String s) {
		String firstLetter = s.substring(0, 1);
		String otherLetters = s.substring(1);
		return firstLetter.toUpperCase() + otherLetters.toLowerCase();
	}
}
