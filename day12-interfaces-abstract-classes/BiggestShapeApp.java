import java.util.ArrayList;
import java.util.List;

public class BiggestShapeApp {

	public static void main(String[] args) {
		List<Shape> list = new ArrayList<>();
		
		// option 1 for adding a new rectangle to the list
		Rectangle r = new Rectangle();
		r.setLength(10);
		r.setWidth(10);
		list.add(r);
		
		// option 2
		r = new Rectangle(20, 4);
		list.add(r);
		
		// option 3
		list.add(new Rectangle(13, 6));
		list.add(new Rectangle(15, 5));
		// list.add(15, 5); <-- CANNOT do this to add a rectangle
		
		list.add(new Circle(10));
		
		Shape max = list.get(0);
		for (Shape shape : list) {
			if (shape.calcArea() > max.calcArea()) {
				max = shape;
			}
		}
		System.out.println(max);	
		
	}
}
