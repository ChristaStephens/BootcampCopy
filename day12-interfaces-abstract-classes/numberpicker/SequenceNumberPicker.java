package numberpicker;

/**
 * This number picker returns numbers in sequence starting with
 * a specified number.
 */
public class SequenceNumberPicker implements NumberPicker {

	int next;

	/**
	 * This constructor requires the starting number
	 * @param start first number to pick
	 */
	public SequenceNumberPicker(int start) {
		this.next = start;
	}

	@Override
	public int pickNumber() {
		return next++;
	}
}
