import javax.swing.JOptionPane;

public class Ejercicio12App {
	public static void main(String[] args) {
		boolean login = false;
		String password = "contraseña";
		int i = 0;
		do {
			String input = JOptionPane.showInputDialog("Introduce la contraseña: ");
			if( input.equals(password)) {
				JOptionPane.showMessageDialog(null,"Enhorabuena!");
				login = true;
			}
			i++;
		}while(!login && i<3);
	}
}
