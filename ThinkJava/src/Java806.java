
public class Java806 {

	public static void main(String[] args) {
		int[] array = { 2, 3, 546, 37, 790, 1, 5, 576, 68, 4, };
		int n = 574687;
		System.out.println(areFactors(array, n));

	}

	public static boolean areFactors(int[] array, int n) {
		for (int x : array) {
			if (n % x != 0) {
				return false;
			}
		}
		return true;
	}

}
