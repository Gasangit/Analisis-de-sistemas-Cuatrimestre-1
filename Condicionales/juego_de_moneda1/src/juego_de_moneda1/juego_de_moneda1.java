package juego_de_moneda1;

import javax.swing.JOptionPane;

class juego_de_moneda1 {

	public static void main(String[] args) {
		int m;
		
		m = Integer.parseInt(JOptionPane.showInputDialog("ingrese valor moneda \n0-Cara \1-Ceca"));
		if (m==0) {
			JOptionPane.showMessageDialog(null, "Tienen parcialito");
		}else {
			JOptionPane.showMessageDialog(null, "La profesora trae caramelos");
		}
	}

}
