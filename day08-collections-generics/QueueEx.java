import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		
		queue.offer("Red"); // add to end of queue
		queue.offer("White");
		queue.offer("Blue");
		System.out.println(queue);
		System.out.println("Peek: " + queue.peek());
		
		System.out.println( queue.poll() ); // take off beginning
		System.out.println( queue.poll() );
		System.out.println(queue);

		queue.offer("Orange");
		queue.offer("Black");
		System.out.println(queue);
		
		System.out.println( queue.poll() );
		System.out.println(queue);
		
	}

}
