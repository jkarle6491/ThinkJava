
public class Java607 {

	public static void main(String[] args) {
		System.out.println(oddSum(7));
	}
	public static int oddSum(int n){
		if(n%2 != 0 && n > 0){
			return n + oddSum(n - 2);
		}
		else{
			return n + 1;
		}
	}
}
