
public class WordCountApp {
	
	public static void main(String[] args) {
		WordCounter tally = new WordCounter();
		tally.add("Apple");
		tally.add("Orange");
		tally.add("Apple");
		tally.add("Cherry");
		tally.add("Cherry");
		tally.add("Apple");
		System.out.println(tally);
	}
	
}
