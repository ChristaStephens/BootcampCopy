import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Here are a number of common algorithms that serve as building blocks for
 * solutions that you will often need to write. I've made the method and variable
 * names anonymous here so that you can work through them yourself and discover
 * what they do.
 */
public class IdiomsDiscovery {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(2, 4, 6, 0, 1);
		List<String> words = Arrays.asList("the", "best", "things", "in", "life");
		System.out.println("alpha: " + alpha(nums) );
		System.out.println("beta: " + beta(nums) );
		System.out.println("gamma: " + gamma(nums) );
		System.out.println("delta: " + delta(words, "life") );
		System.out.println("epsilon: " + epsilon(words, "t") );
		System.out.println("zeta: " + zeta(words) );
		
		List<String> wordsCopy = new ArrayList<>(words);
		eta(wordsCopy);
		System.out.println("original: " + words );
		System.out.println("eta: " + wordsCopy );
		
	}
	
	private static Integer alpha(List<Integer> input) {
		Integer num = input.get(0);
		for (Integer item : input) {
			if (item < num) {
				num = item;
			}
		}
		return num;
	}
	
	private static Integer beta(List<Integer> input) {
		Integer num = input.get(0);
		for (Integer item : input) {
			if (item > num) {
				num = item;
			}
		}
		return num;
	}
	
	private static int gamma(List<Integer> input) {
		int num = 0;
		for (Integer item : input) {
			num += item;
		}
		return num;
	}
	
	private static int delta(List<String> input, String s) {
		for (int i = 0; i < input.size(); i++) {
			if (s.equals(input.get(i))) {
				return i;
			}
		}
		return -1;
	}
	
	private static List<String> epsilon(List<String> input, String prefix) {
		List<String> output = new ArrayList<>();
		for (String item : input) {
			if (item.startsWith(prefix)) {
				output.add(item);
			}
		}
		return output;
	}
	
	private static List<String> zeta(List<String> input) {
		List<String> output = new ArrayList<>();
		for (int i = input.size() - 1; i >= 0; i--) {
			output.add(input.get(i));
		}
		return output;
	}
	
	private static void eta(List<String> input) {
		for (int i = 0; i < input.size() / 2; i++) {
			int j = input.size() - 1 - i;
			String swap = input.get(i);
			input.set(i, input.get(j));
			input.set(j, swap);
		}
	}

}
