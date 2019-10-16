public class OverloadingEx {

	public static void main(String[] args) {
		// Overloading: methods with the same name but
		// different parameter types
		greet(3);
	}
	
	public static void greet() {
		System.out.println("Hello world!");
	}
	
	public static void greet(String name) {
		System.out.println("Hello " + name + "!");
	}
	
	// This does not work because it has the same parameter type as
	// greet(String name)
//	public static void greet(String language) {
//		if (language.equalsIgnoreCase("english")) {
//			System.out.println("Hello.");
//		} else if (language.equalsIgnoreCase("Spanish")) {
//			System.out.println("Hola.");
//		}
//	}
	
	public static void greet(int count) {
		for (int i = 0; i < count; i++) {
			System.out.println("Hello again!");
		}
	}

}
