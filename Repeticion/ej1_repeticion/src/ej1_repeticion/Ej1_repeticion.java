package ej1_repeticion;

import javax.swing.JOptionPane;

class Ej1_repeticion {

	public static void main(String[] args) {
		
		Double sueldo=0.0, total=0.0;
		
		for (int c = 1; c <= 10; c++) {
			sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo del trabajador " + c));
			total = total + sueldo;
		}

		JOptionPane.showMessageDialog(null, "El total de sueldos pagados durante este mes es de " + total);
	}

}
