
public class Java702 {

	public static void main(String[] args) {
		sqaureRoot(9);

	}

	public static void sqaureRoot(double num) {
		double guess = num / 2.0;
		while (Math.abs(Math.pow(guess, 2.0) - num) > .0001) {
			double prev = guess;
			guess = (prev + num / prev) / 2.0;
		}
		System.out.println(guess);

	}

}
