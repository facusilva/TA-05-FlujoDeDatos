import javax.swing.JOptionPane;

public class Ejercicio11App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dia = JOptionPane.showInputDialog("Indica el día de la semana: ");
		switch(dia.toLowerCase()) {
		case "lunes":
			System.out.println("Laborable");
			break;
		case "martes":
			System.out.println("Laborable");
			break;
		case "miércoles":
			System.out.println("Laborable");
			break;
		case "jueves":
			System.out.println("Laborable");
			break;
		case "viernes":
			System.out.println("Laborable");
			break;
		case "sábado":
			System.out.println("NO laborable");
			break;
		case "domingo":
			System.out.println("NO laborable");
			break;
		default:
			System.out.println("Vuelve a introducir el día");
			break;
		}
	}

}
