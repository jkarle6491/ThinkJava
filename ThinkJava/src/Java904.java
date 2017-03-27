
public class Java904 {
	public static void main(String[] args) {
		String s = "wedgghggdew";
		printString(s);
		printBackward(s);
		reverseString(s);
		System.out.println(isPalindrome(s));
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

	public static void printString(String s) {
		for (int x = 0; x < s.length(); x++) {
			System.out.println(s.charAt(x));
		}
	}

	public static void printBackward(String s) {
		for (int x = s.length() - 1; x > -1; x--) {
			System.out.println(s.charAt(x));
		}
	}

	public static void reverseString(String s) {
		for (int x = s.length() - 1; x > -1; x--) {
			System.out.print(s.charAt(x));
		}
		System.out.println("");
	}

	public static boolean isPalindrome(String s) {
		for (int x = s.length() - 1; x > -1; x--) {
			if (s.charAt(0) == s.charAt(s.length() - 1)) {
				return true;
			}
		}
		return false;

	}
}
