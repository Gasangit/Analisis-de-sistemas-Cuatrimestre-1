package ej1;

import javax.swing.JOptionPane;

class Ej1 {

	public static void main(String[] args) {
		int a,b,c,d,sum,prod;
		
		a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese n�mero"));
		b=Integer.parseInt(JOptionPane.showInputDialog("Ingrese n�mero"));
		c=Integer.parseInt(JOptionPane.showInputDialog("Ingrese n�mero"));
		d=Integer.parseInt(JOptionPane.showInputDialog("Ingrese n�mero"));
		sum=a+b;
		prod=c*d;
		JOptionPane.showMessageDialog(null, "Suma: " + sum + " Producto: " + prod);
		
	}

}
