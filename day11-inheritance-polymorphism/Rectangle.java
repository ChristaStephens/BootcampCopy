
public class Rectangle {

	private double length;
	private double width;
	
	public Rectangle() {}

	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	public double calcArea() {
		return length * width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}

}
