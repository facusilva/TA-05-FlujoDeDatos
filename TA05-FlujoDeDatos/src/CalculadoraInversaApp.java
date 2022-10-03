import javax.swing.JOptionPane;

public class CalculadoraInversaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer operando: "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo operando: "));
		String signo = JOptionPane.showInputDialog("Introduce un signo aritmético: ");
		switch(signo) {
		case "+":
			JOptionPane.showMessageDialog(null,"Resultado: "+(num1+num2));
			break;
		case "-":
			JOptionPane.showMessageDialog(null,"Resultado: "+(num1-num2));
			break;
		case "*":
			JOptionPane.showMessageDialog(null,"Resultado: "+(num1*num2));
			break;
		case "/":
			JOptionPane.showMessageDialog(null,"Resultado: "+(num1/num2));
			break;
		case "^":
			JOptionPane.showMessageDialog(null,"Resultado: "+(Math.pow(num1, num2)));
			break;
		case "%":
			JOptionPane.showMessageDialog(null,"Resultado: "+(num1%num2));
			break;
		}
	}

}
