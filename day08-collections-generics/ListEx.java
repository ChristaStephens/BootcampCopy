import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		String[] array = new String[3];
		array[0] = "Huron";
		array[1] = "Erie";
		array[2] = "Michigan";
		
		List<String> list = new ArrayList<>();
		list.add("Huron"); // add Huron to the end of the list
		list.add("Erie");
		list.add("Michigan");
		list.add("Superior");
		
		System.out.println(list);
		System.out.println(list.get(1));
		
		list.remove(1); // remove at index 1 (Erie)
		System.out.println(list);
		list.add(1, "Ontario"); // add Ontario at index 1
		System.out.println(list);
		list.remove("Huron"); // remove Huron
		System.out.println(list);
		list.set(2, "Great Lake"); // replace item at index 2 with Great Lake
		System.out.println(list);
		
		System.out.println("size: " + list.size());
		System.out.println("indexOf Michigan: " + list.indexOf("Michigan"));
		System.out.println("contains Michigan: " + list.contains("Michigan"));
		
		// Loop through a list w/ for
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// Loop through a list w/ enhanced for
		for (String item : list) {
			System.out.println(item);
		}
		
		// Cannot use primitive types in a collection.
		// Instead, use the primitive wrapper type.
		List<Integer> nums = new ArrayList<>();
		// autoboxing - Java automatically converts primitives
		// to their wrapper type when needed
		nums.add( 1 );
		nums.add( 7 );
		nums.add( 21 );
		
		// primitive wrapper type can essentially be used identically
		// to pimitive type
		Integer x = 4;
		int y = 4;
		
		System.out.println(x + y);
		x = null; // but wrappers CAN be set to null.
		// y = null; // (syntax error!) primitives themselves CANNOT be null.
	}

}
