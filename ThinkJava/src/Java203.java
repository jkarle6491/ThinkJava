import java.text.DecimalFormat;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Java203 {

	public static void main(String[] args) {
		
		// Time since midnight
			
			//Fetch local time
			LocalTime time = ZonedDateTime.now().toLocalTime().truncatedTo(ChronoUnit.SECONDS);
			int secondtime = ((time.getHour() * 60 * 60) + (time.getMinute() * 60) + time.getSecond());
			
			//Display time
			System.out.println("Seconds since midnight: " + secondtime);
		
		// Percentage of day left
		DecimalFormat dec = new DecimalFormat("#.##");
		int secondsperday = (24 * 60 * 60);
		double percent = (secondtime/ ((double)secondsperday))*100;
		System.out.println("Percent of day past: " + dec.format(percent) + "%");
	}

}
