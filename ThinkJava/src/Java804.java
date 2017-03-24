
public class Java804 {

	public static void main(String[] args) {
		int[] array = { 3, 3, 56, 2, 2, 5, 6, 9 };
		indexOfMax(array);
	}

	public static int indexOfMax(int[] array) {
		int max = array[0];
		int maxIndex = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				maxIndex = i;
				max = array[i];
			}
		}
		System.out.println(maxIndex);
		return maxIndex ;
	}
}
