
public class Java80101 {

	public static void main(String[] args) {
		double power = 3;
		double[] things = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		double[] biggering = powArray(things, power);
		for (double number : biggering) {
			System.out.print(number + "  ");
		}
	}

	public static double[] powArray(double a[], double power) {
		double[] newArray = new double[a.length];
		for (int i = 0; i < a.length; i++) {
			newArray[i] = Math.pow(a[i], power);
		}
		return newArray;

	}

}
