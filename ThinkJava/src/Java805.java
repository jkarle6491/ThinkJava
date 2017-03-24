import java.util.Arrays;

public class Java805 {

	public static void main(String[] args) {
		int n = 25;
		sieve(n);

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
		System.out.println(Arrays.toString(primes));
		return primes;

	}

}
