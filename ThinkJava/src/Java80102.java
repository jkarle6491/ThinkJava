import java.util.Arrays;

public class Java80102 {

	public static void main(String[] args) {
		int counts = 100;
		int []array={ 2, 2, 5, 1, 6, 8, 4, 54 };
		histogram(counts, array);

	}

	public static int[] histogram(int number, int[]array) {
		int scores[] = array;
		int [] counts = new int [number];
		for (int i = 0; i < scores.length; i++) {
			int index = scores[i];
			counts[index]++;
		}
		System.out.println(Arrays.toString(counts));
		return counts;

	}

}
