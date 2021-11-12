package moneda;

import javax.swing.JOptionPane;

class Moneda {

	public static void main(String[] args) {
		String m;
		
		m = JOptionPane.showInputDialog("Ingrese valor de moneda"
				+ "\ncara \ncruz");
		if (m.equalsIgnoreCase("cara")) {
			JOptionPane.showMessageDialog(null, "Tienen parcialito");
		} else {
			JOptionPane.showMessageDialog(null, "El TP1 tiene nota de concepto");
		}
	}

}
