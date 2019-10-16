
public class CircleDemoApp {

	public static void main(String[] args) {
		Circle a = new Circle(4.0);
		System.out.println(a.getRadius());
		System.out.println("Area: " + a.calcArea());
		System.out.println("Circumference: " + a.calcCircumference());
		
		Circle b = new Circle();
		b.setRadius(10.0);
		System.out.println(b.getRadius());
		
		String s = a.toString();
		System.out.println(s);
		System.out.println(b);
	}

}
