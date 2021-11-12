package ej7;

import javax.swing.JOptionPane;

class Ej7 {

	public static void main(String[] args) {
		double lado,p,a;
		
		lado=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del lado"));
		p= lado*4;
		a= lado * lado;
		
		JOptionPane.showMessageDialog(null, "El perimetro es: "+ p + " y el area es: " + a);

	}

}
