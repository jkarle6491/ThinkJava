
public class Java603 {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		isTriangle(a, b, c);
	}
	static boolean isTriangle(int a, int b, int c){
		if(Math.pow(a, 2)+Math.pow(b, 2)==Math.pow(c, 2)){
			return true;
		}
		else {
			return false;
		}
	}
}
