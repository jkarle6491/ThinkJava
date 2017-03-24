import javax.swing.JOptionPane;

public class Java302 {

	public static void main(String[] args) {
		String celsius1 = JOptionPane.showInputDialog("Enter Temperature ");
		double celsius2 = Double.parseDouble(celsius1);
		double F = celsius2 * 1.8 + 32;
		System.out.println(F);
	}

}
