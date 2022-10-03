import javax.swing.JOptionPane;

public class Ejercicio10App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ventas = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de ventas : "));
		double total = 0;
		for(int i = 0; i<ventas;i++) {
			total = total + Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio de la venta: "));
		}
		System.out.println("El total de ventas és: "+total);
	}

}
