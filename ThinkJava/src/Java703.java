
public class Java703 {

	public static void main(String[] args) {
		System.out.print(power(4, 3));
	}

	public static double power(double x, int n) {
		double x1 = x;
		while(n > 1){

			x = x1 * x;
			n = n-1;
		}
		return x;
	}

}
