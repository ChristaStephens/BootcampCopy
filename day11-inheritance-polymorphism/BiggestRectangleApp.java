import java.util.ArrayList;
import java.util.List;

public class BiggestRectangleApp {

	public static void main(String[] args) {
		List<Rectangle> list = new ArrayList<>();
		
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
		
		Rectangle max = list.get(0);
		for (Rectangle rectangle : list) {
			if (rectangle.calcArea() > max.calcArea()) {
				max = rectangle;
			}
		}
		System.out.println(max);	
		
	}
}
