import java.util.ArrayList;
import java.util.List;

public class BiggestRoomApp {

	public static void main(String[] args) {
		List<Rectangle> list = new ArrayList<Rectangle>();
		
//		list.add(new Rectangle(10, 10));
//		list.add(new Rectangle(20, 6));
		
		list.add(new Room("Snug", 30, 20));
		list.add(new Room("Sun", 30, 40));
		list.add(new Room("Green", 15, 20));
		
		Rectangle biggest = findBiggest(list);
		Room biggestRoom = (Room) biggest;
		System.out.println(biggestRoom.getName());
	}
	
	private static Rectangle findBiggest(List<Rectangle> list) {
		Rectangle max = list.get(0);
		for (Rectangle rectangle : list) {
			if (rectangle.calcArea() > max.calcArea()) {
				max = rectangle;
			}
		}
		return max;
	}

}
