package ej3;

import javax.swing.JOptionPane;

class Ej3 {

	public static void main(String[] args) {
		double precio,tot;
		int cant;
		
		precio=Double.parseDouble(JOptionPane.showInputDialog("Ingrese precio:"));
		cant=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad:"));
		tot=precio*cant;
		JOptionPane.showMessageDialog(null, "Debe abonar : " + tot);

	}

}
