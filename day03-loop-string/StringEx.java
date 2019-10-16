package gcdemos;

public class StringEx {

	public static void main(String[] args) {
		String s = "Java is cool";
		
		System.out.println( s.charAt(3) );
		System.out.println( s.startsWith("Ja") );
		System.out.println( s.endsWith("cool") );
		System.out.println( s.indexOf("foo") );
		System.out.println( s.lastIndexOf("a") );
		System.out.println( s.contains("is c") ); // true
		System.out.println( "".length() ); // 0
		System.out.println( " ".length() ); // 1
		System.out.println( s.replace('a', 'A') );
		System.out.println( s.replace("cool", "Amazing") );
		System.out.println( s.substring(6, 9) );
		System.out.println( s.substring(5) );
		System.out.println( s.toUpperCase() );
		System.out.println( s.toLowerCase() );
		System.out.println( "    Java is cool     ".trim() );
		System.out.println(s); // Strings are immutable		
	}
}
