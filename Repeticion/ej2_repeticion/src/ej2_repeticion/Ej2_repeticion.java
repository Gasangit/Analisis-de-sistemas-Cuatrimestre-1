package ej2_repeticion;

import javax.swing.JOptionPane;

class Ej2_repeticion {

	public static void main(String[] args) {
		String lista="", ns;
		int n, ceros=0;
		
		JOptionPane.showMessageDialog(null, "Se generaran 20 números al azar entre "
										 + "\n0 y 10 contandose los ceros obtenidos");
		
		for (int num = 1; num <=20; num++) {
			n = (int)(Math.random()*11);
			ns = String.valueOf(n);
			lista = lista + " " + ns;
			
			if (n == 0) {
				JOptionPane.showMessageDialog(null, n);
				ceros = ceros + 1;
			} else {
				JOptionPane.showMessageDialog(null, n);
			}
		}
		JOptionPane.showMessageDialog(null, "La cantidad de ceros es " + ceros + "\nNúmeros obtenidos:\n" + lista);
	}

}
