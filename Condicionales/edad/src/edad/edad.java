package edad;

import javax.swing.JOptionPane;

class Edad {

	public static void main(String[] args) {
		int edad;
		
	edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresar edad"));
	if (edad >= 21) {
		JOptionPane.showMessageDialog(null, "Es mayor de edad");
	} else {
		JOptionPane.showMessageDialog(null, "Es menor de edad");
	}
	}

}