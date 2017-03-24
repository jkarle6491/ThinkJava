
public class Java807 {

	public static void main(String[] args) {
		int[] array = { 5, 3, 2 };
		int n = 30;
		System.out.println(arePrimeFactors(array, n));
	}

	public static boolean arePrimeFactors(int[] array, int n) {
		boolean[] primes = sieve(10000000);
		for(int i = 0; i < array.length; i++){
			if(!primes[array[i]]){
				return false;
			}
		}
		int x = 1;
		for(int i = 0; i < array.length; i++){
			x = x * array[i];
		}
		if(x != n){
			return false;
		}
		return true;
	}

	public static boolean[] sieve(int n) {
		boolean[] primes = new boolean[n];
		for (int i = 0; i < n; i++) {
			primes[i] = true;
		}
		for (int i = 2; i < n; i = i + 2) {
			primes[i] = false;
		}
		for (int i = 3; i < n; i = i + 3) {
			primes[i] = false;
		}
		for (int i = 5; i < n; i = i + 5) {
			primes[i] = false;
		}
		for (int i = 7; i < n; i = i + 7) {
			primes[i] = false;
		}
		primes[0] = false;
		primes[1] = false;
		primes[2] = true;
		primes[3] = true;
		primes[5] = true;
		primes[7] = true;
		return primes;
	}
}
