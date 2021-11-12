package division;

import javax.swing.JOptionPane;

class Division {

	public static void main(String[] args) {
		double dividendo, divisor, cociente;
		
		dividendo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el número a ser dividido"));
		divisor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el número por el cual dividirá el anterior"));
		
		if (divisor==0) {
			JOptionPane.showMessageDialog(null, "=> Imposible dividir por 0 <=");
		} else {
			cociente = dividendo / divisor;
			JOptionPane.showMessageDialog(null, "El cociente es : " + cociente);
		}

	}

}
