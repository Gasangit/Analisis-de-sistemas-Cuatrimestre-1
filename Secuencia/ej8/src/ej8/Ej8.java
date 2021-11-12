package ej8;

import javax.swing.JOptionPane;

class Ej8 {

	public static void main(String[] args) {
		double vd,cant,tot;
		
		vd=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del dolar el día de hoy"));
		cant=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de dolares a cambiar"));
		tot= vd*cant;
		  
		JOptionPane.showMessageDialog(null, "El valor de los dolares en pesos es: " + tot);
				
	}

}
