import java.util.Arrays;

public class Java902 {

	public static void main(String[] args) {
		String string = "bed time fool";
		letterHist(string);

	}

	public static int[] letterHist(String string) {
		int answer[]= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		string = string.toLowerCase();
		char i;
		for(int array = 0; array < string.length(); array++){
			i = string.charAt(array);
			if (i >= 96 && i <=132)
				answer[i-97]++;
		}
		System.out.println(Arrays.toString(answer));
		return answer;
	}

}
