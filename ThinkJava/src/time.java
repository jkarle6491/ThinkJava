
public class time {

	public static void main(String[] args) {
		String weekday = "Wednesday";
		String month = "January";
		int day = 25;
		int year = 2017;
		printAmerican(weekday, month, day, year);
		printEuropean(weekday, month, day, year);
	}
	public static void printAmerican(String weekday, String month, int day, int year) {
		System.out.printf("%s, %s %d, %d \n", weekday, month, day, year);
		

	}

	public static void printEuropean(String weekday, String month, int day, int year) {
		System.out.printf("%s %d %s %d", weekday, day, month, year);
		

	}

}
