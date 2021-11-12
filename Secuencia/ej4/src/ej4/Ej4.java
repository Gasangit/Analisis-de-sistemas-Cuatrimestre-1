package ej4;

import javax.swing.JOptionPane;

class Ej4 {

	public static void main(String[] args) {
		double n1,n2,n3,prom;
		int mat;
		
		mat=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su número de matrícula:"));
		
		n1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la primera nota:"));
		n2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la segunda nota:"));
		n3=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la tercera nota:"));
			
		prom=(n1+n2+n3)/3;
		JOptionPane.showMessageDialog(null, "El alumno de matricula " + mat + " tiene como promedio: " + prom);
	}

}
