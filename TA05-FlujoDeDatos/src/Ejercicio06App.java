import javax.swing.JOptionPane;

public class Ejercicio06App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int IVA = 21;
		double num = Double.parseDouble(JOptionPane.showInputDialog("Introduce un número : "));
		System.out.println("El precio final del producto és: "+ (num+(num*IVA)/100));
	}

}
