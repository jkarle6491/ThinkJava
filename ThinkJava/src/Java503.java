
public class Java503 {

	public static void main(String[] args) {
		int beers = 99;
		song(beers);
	}
	private static void song(int beers) {
		if (beers > 0) {
			// 99 bottles of beer on the wall,
			// 99 bottles of beer,
			// ya’ take one down,
			// ya’ pass it around,
			// 98 bottles of beer on the wall.
			System.out.printf("%d bottles of beer on the wall,\n", beers);
			System.out.printf("%d bottles of beer,\n", beers);
			System.out.println("ya’ take one down,");
			System.out.println("ya’ pass it around,");
			beers = beers -1;
			song(beers);
		}
		else{
		// No bottles of beer on the wall,
		// no bottles of beer,
		// ya’ can’t take one down,
		// ya’ can’t pass it around,
		// ’cause there are no more bottles of beer on the wall!
			System.out.println("No bottles of beer on the wall,");
			System.out.println("no bottles of beer,");
			System.out.println("ya’ can’t take one down,");
			System.out.println("ya’ can’t pass it around,");
			System.out.println("’cause there are no more bottles of beer on the wall!");
		}
	}
}
