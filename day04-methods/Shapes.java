public class Shapes {

	// A public method is available to other classes
	public static double calcRectangleArea(double width, double length) {
		return width * length;
	}
	
	public static double calcRectanglePerimeter(double width, double length) {
		return 2 * width + 2 * length;
	}
	
	public static double calcCircleArea(double radius) {
		return Math.PI * square(radius);
	}
	
	public static double calcCircumference(double radius) {
		return 2 * Math.PI * radius;
	}
	
	// A private method is only available to this class
	private static double square(double num) {
		return num * num;
	}
	
}
