package ej4_largo;

import javax.swing.*;

class Ej4_largo {

	public static void main(String[] args) {
		String actividad,sexo,combate;
		
		JOptionPane.showMessageDialog(null, "Elija alguno de los deportistas que aparecen en"+
										  "\nlas imagenes y reponda las siguiente pregunstas",
													"Deportistas",JOptionPane.WARNING_MESSAGE,
		      			  new ImageIcon(Ej4_largo.class.getResource("/img/deportistas.png")));
		
		sexo = JOptionPane.showInputDialog("?Es MUJER?");
		actividad = JOptionPane.showInputDialog("?Se encuentra en ACTIVIDAD?");
		combate = JOptionPane.showInputDialog("Su deporte ?Es de COMBATE?");
		
		if (sexo.equalsIgnoreCase("si")) {
			if (actividad.equalsIgnoreCase("si")) {
				if (combate.equalsIgnoreCase("si")) {
					JOptionPane.showMessageDialog(null, "Usted eligi? a ERICA FARIAS");
				} else {
					JOptionPane.showMessageDialog(null, "Usted eligi? a DELFINA PIGNATIELLO");
				}
			} else {
				if (combate.equalsIgnoreCase("si")) {
					JOptionPane.showMessageDialog(null, "Usted eligi? a PAULA PARETO");
				} else {
					JOptionPane.showMessageDialog(null, "Usted eligi? a LUCIANA AIMAR");
				}
			}
		} else {
			if (actividad.equalsIgnoreCase("si")) {
				if (combate.equalsIgnoreCase("si")) {
					JOptionPane.showMessageDialog(null, "Usted eligi? a SANTIAGO PONZINIBBIO");
				} else {
					JOptionPane.showMessageDialog(null, "Usted eligi? a LIONEL MESSI");
				}
			} else {
				if (combate.equalsIgnoreCase("si")) {
					JOptionPane.showMessageDialog(null, "Usted eligi? a MARCOS MAIDANA");
				} else {
					JOptionPane.showMessageDialog(null, "Usted eligi? a RICARDO BOCHINI");
				}
			}
		}
		
	}

}
