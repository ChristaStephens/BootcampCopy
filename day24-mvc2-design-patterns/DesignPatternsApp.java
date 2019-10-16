
public class DesignPatternsApp {

	public static void main(String[] args) {
		// ** Factory
		Number a = NumberFactory.getNumber("12");
		Number b = NumberFactory.getNumber("89.3");
		Number c = NumberFactory.getNumber("10830");
		
		System.out.println(a + " is a " + a.getClass().getSimpleName());
		System.out.println(b + " is a " + b.getClass().getSimpleName());
		System.out.println(c + " is a " + c.getClass().getSimpleName());
		
		// even this is a factory...
		Integer i = Integer.parseInt("47");
		// this is not...
		i = new Integer("47");
		
		// ** Singleton
		System.out.println();
		
		System.out.println( CounterSingleton.INSTANCE.getNext() );
		System.out.println( CounterSingleton.INSTANCE.getNext() );
		System.out.println( CounterSingleton.INSTANCE.getNext() );
	}
}
