public class StudentDemoApp {

	public static void main(String[] args) {
		Student me = new Student();
		me.name = "David";
		me.favoriteNumber = 103;
		Student you = new Student("Tim", 42);
		
		System.out.println(me.name + " likes " + me.favoriteNumber);
		System.out.println(you.name + " likes " + you.favoriteNumber);
	}

}
