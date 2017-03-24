
public class Java903 {

	public static void main(String[] args) {
		String expression = "(23+(4))";
		System.out.println(countPar(expression));

	}

	public static int countPar(String expression) {
		int count = 0;
		for (int i = 0; i < expression.length(); i++) {
			char c = expression.charAt(i);
			if (c == '(') {
				count++;
			} else if (c == ')') {
				count--;
			}
		}
		return count;
	}

}
