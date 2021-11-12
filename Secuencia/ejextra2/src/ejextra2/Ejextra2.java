package ejextra2;

import javax.swing.JOptionPane;

class Ejextra2 {

	public static void main(String[] args) {
		String nom; 
		int anac,edad,edf;
		
		nom = JOptionPane.showInputDialog("Ingrese su nombre");
		anac= Integer.parseInt(JOptionPane.showInputDialog("Ingrese año de nacimiento"));
		edad= 2021 - anac;
		edf= 2050 - anac;
		JOptionPane.showMessageDialog(null, nom + " Edad: " + edad + "\nenel 2050: " + edf);
	}

}
