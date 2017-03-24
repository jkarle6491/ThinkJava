
public class Java704 {

	public static void main(String[] args) {
		System.out.println(factorial(3));

	}

	public static int factorial(int x) {
		int x1 = x - 1;
		while (x1 > 0) {

			x = x * x1;
			x1 = x1 - 1;
		}
		return x;
	}

}
