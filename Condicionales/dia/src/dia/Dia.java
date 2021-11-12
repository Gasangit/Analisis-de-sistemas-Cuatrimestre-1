package dia;

import javax.swing.JOptionPane;

class Dia {

	public static void main(String[] args) {
		String d;
		
		d = JOptionPane.showInputDialog("Ingrese el día en palabras : ");
		
		if (d.equalsIgnoreCase("domingo")) {
			JOptionPane.showMessageDialog(null, "No se trabaja");
		} else {
			JOptionPane.showMessageDialog(null, "Se trabaja");
		}

	}

}
