package ej1;

import javax.swing.JOptionPane;

class Ej1 {

	public static void main(String[] args) {
		int a,b,c,d,sum,prod;
		
		a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese número"));
		b=Integer.parseInt(JOptionPane.showInputDialog("Ingrese número"));
		c=Integer.parseInt(JOptionPane.showInputDialog("Ingrese número"));
		d=Integer.parseInt(JOptionPane.showInputDialog("Ingrese número"));
		sum=a+b;
		prod=c*d;
		JOptionPane.showMessageDialog(null, "Suma: " + sum + " Producto: " + prod);
		
	}

}
