package ej2;

import javax.swing.JOptionPane;

class Ej2 {

	public static void main(String[] args) {
		double a,b,c,d,s,p;
		
		a=Double.parseDouble(JOptionPane.showInputDialog("Ingrese n�mero"));
		b=Double.parseDouble(JOptionPane.showInputDialog("Ingrese n�mero"));
		c=Double.parseDouble(JOptionPane.showInputDialog("Ingrese n�mero"));
		d=Double.parseDouble(JOptionPane.showInputDialog("Ingrese n�mero"));
		
		s=a+b+c+d;
		p=s/4;
		JOptionPane.showMessageDialog(null, "La suma es: "+ s + " el promedio es: " + p);
	}

}
