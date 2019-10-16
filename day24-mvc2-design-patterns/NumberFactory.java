
public class NumberFactory {
	
	public static Number getNumber(String str) {
		if (str.contains(".")) {
			return Double.parseDouble(str);
		} else {
			long n = Long.parseLong(str);
			if (n > Byte.MIN_VALUE && n < Byte.MAX_VALUE) {
				return (byte) n;
			} else if (n > Short.MIN_VALUE && n < Short.MAX_VALUE) {
				return (short) n;
			} else if (n > Integer.MIN_VALUE && n < Integer.MAX_VALUE) {
				return (int) n;
			} else {
				return n;
			}
		}
	}

}
