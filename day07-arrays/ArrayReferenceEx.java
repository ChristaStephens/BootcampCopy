package day7;
import java.util.Arrays;

public class ArrayReferenceEx {

	public static void main(String[] args) {
		String[] myList = { "Eat Dinner", "Do Homework", "Go to Bed" };
		// Share the same array in the heap.
//		String[] yourList = myList;
		// Make a new array copied from the original. Safe to change.
		String[] yourList = Arrays.copyOf(myList, myList.length);
		
		myList[0] += " ✓";
		yourList[1] += " ✓";
		
		System.out.println("My List: " + Arrays.toString(myList));
		System.out.println("Your List: " + Arrays.toString(yourList));
	}

}
