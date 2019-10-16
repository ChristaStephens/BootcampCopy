package gcdemos;

public class StringBuilderEx {

	public static void main(String[] args) {
		StringBuffer b = new StringBuffer("heLLO");
		
		b.replace(0, 1, "H");
		b.replace(2, 5, "llo");
		
		b.insert(2, "y, he");
		b.reverse();
		
		System.out.println(b);

	}

}
