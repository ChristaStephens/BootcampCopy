import java.util.Map;
import java.util.TreeMap;

class WordCounter {
	private Map<String, Integer> map = new TreeMap<>();

	public void add(String s) {
		if (map.containsKey(s)) {
			map.put(s, map.get(s) + 1);
		} else {
			map.put(s, 1);
		}
	}

	@Override
	public String toString() {
		return map.toString();
	}
}