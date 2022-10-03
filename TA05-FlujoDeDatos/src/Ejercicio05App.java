import javax.swing.JOptionPane;

public class Ejercicio05App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número : "));
		if(num%2 == 0) {
			System.out.println("El número es divisible entre 2");
		}else {
			System.out.println("El número NO es divisible entre 2");
		}
		
	}

}
