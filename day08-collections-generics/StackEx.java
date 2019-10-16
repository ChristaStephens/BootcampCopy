import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();

		stack.push("Java");
		stack.push("is");
		stack.push("cool");
		
		System.out.println( stack.pop() );
		System.out.println( stack.pop() );
		
		stack.push("d'bomb");
		System.out.println("Peek: " + stack.peek());
		System.out.println( stack.pop() );
		
	}

}
