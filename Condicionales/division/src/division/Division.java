package division;

import javax.swing.JOptionPane;

class Division {

	public static void main(String[] args) {
		double dividendo, divisor, cociente;
		
		dividendo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el n�mero a ser dividido"));
		divisor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el n�mero por el cual dividir� el anterior"));
		
		if (divisor==0) {
			JOptionPane.showMessageDialog(null, "=> Imposible dividir por 0 <=");
		} else {
			cociente = dividendo / divisor;
			JOptionPane.showMessageDialog(null, "El cociente es : " + cociente);
		}

	}

}
