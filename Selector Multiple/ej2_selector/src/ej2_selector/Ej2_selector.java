package ej2_selector;

import javax.swing.JOptionPane;

class Ej2_selector {

	public static void main(String[] args) {
		int categoria, horas, extras,fallo = 0;
		double sueldo = 0;
		
		categoria = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la categoría"));
		horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de HORAS"));
		extras = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas EXTRA"));
		
		switch (categoria) {
		case 1:
			if (extras<=30) {
				sueldo = (horas*14)+(extras*20.50);
			} else {
				sueldo = (horas*14)+(extras*(20.50*0.93));
			}
			break;
		case 2:
			if (extras<=30) {
				sueldo = (horas*17)+(extras*24);
			} else {
				sueldo = (horas*17)+(extras*(24*0.93));
			}
			break;
		case 3:
			if (extras<=30) {
				sueldo = (horas*21)+(extras*34);
			} else {
				sueldo = (horas*21)+(extras*(34*0.93));
			}
			break;
		default:
			JOptionPane.showMessageDialog(null, "La categoría ingresada no es valida");
			fallo = 1;
			break;
		}
		if (fallo!=1) {
			JOptionPane.showMessageDialog(null, "El sueldo a cobrar es : " + sueldo);
		}
		
	}

}
