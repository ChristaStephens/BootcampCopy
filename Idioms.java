import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Here are a number of common algorithms that serve as building blocks for
 * solutions that you will often need to write. It is worth memorizing these.
 */
public class Idioms {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(2, 4, 6, 0, 1);
		List<String> words = Arrays.asList("the", "best", "things", "in", "life");
		System.out.println("min: " + min(nums) );
		System.out.println("max: " + max(nums) );
		System.out.println("sum: " + sum(nums) );
		System.out.println("indexOf: " + indexOf(words, "life") );
		System.out.println("filter: " + filterStartsWith(words, "t") );
		System.out.println("reverse: " + reverse(words) );
		
		List<String> wordsCopy = new ArrayList<>(words);
		reverseInPlace(wordsCopy);
		System.out.println("original: " + words );
		System.out.println("reverse copy: " + wordsCopy );
		
	}
	
	private static Integer min(List<Integer> input) {
		Integer min = input.get(0);
		for (Integer item : input) {
			if (item < min) {
				min = item;
			}
		}
		return min;
	}
	
	private static Integer max(List<Integer> input) {
		Integer max = input.get(0);
		for (Integer item : input) {
			if (item > max) {
				max = item;
			}
		}
		return max;
	}
	
	private static int sum(List<Integer> input) {
		int sum = 0;
		for (Integer item : input) {
			sum += item;
		}
		return sum;
	}
	
	private static int indexOf(List<String> input, String match) {
		for (int i = 0; i < input.size(); i++) {
			if (match.equals(input.get(i))) {
				return i;
			}
		}
		return -1;
	}
	
	private static List<String> filterStartsWith(List<String> input, String prefix) {
		List<String> output = new ArrayList<>();
		for (String item : input) {
			if (item.startsWith(prefix)) {
				output.add(item);
			}
		}
		return output;
	}
	
	private static List<String> reverse(List<String> input) {
		List<String> output = new ArrayList<>();
		for (int i = input.size() - 1; i >= 0; i--) {
			output.add(input.get(i));
		}
		return output;
	}
	
	private static void reverseInPlace(List<String> input) {
		for (int i = 0; i < input.size() / 2; i++) {
			int j = input.size() - 1 - i;
			String swap = input.get(i);
			input.set(i, input.get(j));
			input.set(j, swap);
		}
	}

}
