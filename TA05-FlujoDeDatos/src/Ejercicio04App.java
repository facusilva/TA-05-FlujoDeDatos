import javax.swing.JOptionPane;

public class Ejercicio04App {

	public static void main(String[] args) {
		double radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio : "));
		double area = Math.PI*Math.pow(radio, 2.0);
		JOptionPane.showMessageDialog(null,"Area = "+area);
	}

}
