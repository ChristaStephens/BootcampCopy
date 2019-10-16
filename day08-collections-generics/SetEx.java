import java.util.HashSet;
import java.util.Set;

public class SetEx {
	public static void main(String[] args) {
		Set<Character> letters = new HashSet<>();
		
		letters.add('a');
		letters.add('b');
		letters.add('c');
		letters.add('c'); // adding a second time does nothing
		letters.add('d');
		letters.add('a');
		letters.remove('b');
//		letters.remove(3); // CANNOT access by index
//		letters.get(2); // CANNOT access by index
		
		System.out.println(letters);
		System.out.println("contains c: " + letters.contains('c')); // true
		System.out.println("contains b: " + letters.contains('b')); // false
	}
}
