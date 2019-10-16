
public class CounterSingleton {
	
	// Create one shared instance here.
	public static final CounterSingleton INSTANCE = new CounterSingleton();
	
	private int next = 1;
	
	// Private so that no other class can create an instance.
	private CounterSingleton() {}
	
	public int getNext() {
		return next++;
	}

}
