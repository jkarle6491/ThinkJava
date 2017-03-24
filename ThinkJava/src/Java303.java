import javax.swing.JOptionPane;

public class Java303 {

	public static void main(String[] args) {
		String time = JOptionPane.showInputDialog("Enter Seconds");
		int time1 = Integer.parseInt(time);
		int hours = time1 / 3600;
		int minutes = time1 % 3600 / 60;
		int seconds = time1 % 3600 % 60;
		System.out.printf("%d second(s) = %d hour(s), %d minute(s), %d second(s).", time1, hours, minutes, seconds);

	}

}
