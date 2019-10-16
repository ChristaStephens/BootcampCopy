import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MapEx {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		Map<String, Integer> players = new HashMap<>();
		players.put("Mike", 23); // Key Mike, Value 23
		players.put("Messi", 10);
		players.put("Curry", 8);
		 // cannot have same key twice. this will replace the 8
		players.put("Curry", 30);
		System.out.println(players);
		
		System.out.println("get Mike: " + players.get("Mike"));
		players.remove("Messi"); // remove via key
		System.out.println("contains Mike: " + players.containsKey("Mike"));
		System.out.println("size: " + players.size());
		
		System.out.println(players);
		
		// maps can contain complex values
		Map<String, List<String>> classes = new HashMap<>();
		classes.put("java", new ArrayList<>());
		classes.put("techhire", new ArrayList<>());
		
		classes.get("java").add("Adan");
		classes.get("java").add("Aaliyah");
		classes.get("java").add("Tae");
		classes.get("techhire").add("Chris");
		classes.get("techhire").add("Lindsay");
		
		System.out.println(classes);
		
		scnr.close();
	}

}
