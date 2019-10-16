package numberpicker;

/**
 * This number picker returns a random number from a given range.
 */
public class RandomNumberPicker implements NumberPicker {
	
	int min, range;

	/**
	 * This constructor requires a min and max for the random numbers
	 * @param min
	 * @param max
	 */
	public RandomNumberPicker(int min, int max) {
		this.min = min;
		this.range = max - min + 1;
	}

	@Override
	public int pickNumber() {
		return (int) (Math.random() * range) + min;
	}

}
