package ej6;

import javax.swing.JOptionPane;

class Ej6 {

	public static void main(String[] args) {
		double venta,pago,v;
		
		venta=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de la venta"));
		pago=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de lo abonado"));
		
		v=pago-venta;
		JOptionPane.showMessageDialog(null, "El vuelto a entregarse es: " + v);		
		
		

	}

}
