
public class Circle {
	
	// private instance variables are part of Java bean standard
	private double radius;
	
	// public constructors
	public Circle() {}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	// public accessor methods: getters and setters
	// getter
	public double getRadius() {
		return radius;
	}
	
	// setter
	public void setRadius(double radius) {
		// some setters may enforce validation
		if (radius <= 0) {
			throw new IllegalArgumentException("Radius cannot be negative");
		}
		this.radius = radius;
	}
	
	public double calcCircumference() {
		return 2 * Math.PI * radius;
	}
	
	public double calcArea() {
		return Math.PI * radius * radius;
	}
	
	@Override
	public String toString() {
		return "Circle radius=" + radius;
	}

}
