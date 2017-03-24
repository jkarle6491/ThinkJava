
public class Java904 {

	public static void main(String[] args) {
		String s = "sdgdzg";
		System.out.println(first(s));
		System.out.println(rest(s));
		System.out.println(middle(s));
		System.out.println(length(s));
		printString(s, length(s));
	}

	public static char first(String s) {
		return s.charAt(0);
	}

	public static String rest(String s) {
		return s.substring(1);
	}

	public static String middle(String s) {
		return s.substring(1, s.length() - 1);
	}

	public static int length(String s) {
		return s.length();
	}

	public static void printString(String s, int l) {
		System.out.println(s);
	}
}
