package ej3_selector;

import javax.swing.JOptionPane;

class Ej3_selector {

	public static void main(String[] args) {
		int carrera;
		double nota,promedio;

		carrera = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la carrera seg�n \nel"
						   + "n�mero correspondiente:\n1-Econom�a\n2-Inform�tica\n3-Agronom�a"
						   						+ "\n4-Contabilidad\n5-Qu�mica\n6-Sistemas"));
		nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del CUATRIMESTRE"));
		promedio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del PROMEDIO"));
		
		switch (carrera) {
		case 1:
		case 4:
			if (nota>=6 && promedio>9) {
				JOptionPane.showMessageDialog(null, "Accede a la beca");
			} else {
				JOptionPane.showMessageDialog(null, "NO accede a la beca");
			}
			break;
		case 2:
		case 6:	
			if (nota>6 && promedio>9.2) {
				JOptionPane.showMessageDialog(null, "Accede a la beca");
			} else {
				JOptionPane.showMessageDialog(null, "NO accede a la beca");
			}
			break;
		case 3:
		case 5:	
			if (nota>5 && promedio>8.8) {
				JOptionPane.showMessageDialog(null, "Accede a la beca");
			} else {
				JOptionPane.showMessageDialog(null, "NO accede a la beca");
			}
			break;	
		default:
			JOptionPane.showMessageDialog(null, "Solo existen 6 carreras");
			break;
		}
		
		
	}

}
