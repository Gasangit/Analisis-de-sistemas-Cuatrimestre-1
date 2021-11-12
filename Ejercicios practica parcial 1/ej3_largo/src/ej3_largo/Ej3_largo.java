package ej3_largo;

import javax.swing.JOptionPane;

class Ej3_largo {

	public static void main(String[] args) {
		String pais,sexo,talle;
		
		pais = JOptionPane.showInputDialog("Por favor indique cual es su país:"+
								    "\nARGENTINA\nURUGUAY\nCHILE\nBRASIL\nPERÚ");
		sexo = JOptionPane.showInputDialog("Por favor indique si es HOMBRE o MUJER");
		talle = JOptionPane.showInputDialog("Por favor indique su TALLE:"+
															 "\nS\nM\nL");
		
		if (sexo.equalsIgnoreCase("hombre")) {
			if (pais.equalsIgnoreCase("argentina")||pais.equalsIgnoreCase("uruguay")) {
				if (talle.equalsIgnoreCase("s")) {
					JOptionPane.showMessageDialog(null, "El valor para un HOMBRE talle S en ARGENTINA/URUGUAY es $560");
				} else {
					if (talle.equalsIgnoreCase("m")) {
						JOptionPane.showMessageDialog(null, "El valor para un HOMBRE talle M en ARGENTINA/URUGUAY es $575");
					} else {
						JOptionPane.showMessageDialog(null, "El valor para un HOMBRE talle L en ARGENTINA/URUGUAY es $590");
					}
				}
			} else {
				if (pais.equalsIgnoreCase("chile")) {
					if (talle.equalsIgnoreCase("s")) {
						JOptionPane.showMessageDialog(null, "El valor para un HOMBRE talle S en CHILE es $500");
					} else {
						if (talle.equalsIgnoreCase("m")) {
							JOptionPane.showMessageDialog(null, "El valor para un HOMBRE talle M en CHILE es $525");
						} else {
							JOptionPane.showMessageDialog(null, "El valor para un HOMBRE talle L en CHILE es $530");
						}
					}
				} else {
					if (talle.equalsIgnoreCase("s")) {
						JOptionPane.showMessageDialog(null, "El valor para un HOMBRE talle S en BRASIL/PERÚ es $520");
					} else {
						if (talle.equalsIgnoreCase("m")) {
							JOptionPane.showMessageDialog(null, "El valor para un HOMBRE talle M en BRASIL/PERÚ es $545");
						} else {
							JOptionPane.showMessageDialog(null, "El valor para un HOMBRE talle L en BRASIL/PERÚ es $575");
						}
					}
				}
			}
		} else {
			if (pais.equalsIgnoreCase("argentina")||pais.equalsIgnoreCase("uruguay")) {
				if (talle.equalsIgnoreCase("s")) {
					JOptionPane.showMessageDialog(null, "El valor para una MUJER talle S en ARGENTINA/URUGUAY es $450");
				} else {
					if (talle.equalsIgnoreCase("m")) {
						JOptionPane.showMessageDialog(null, "El valor para una MUJER talle M en ARGENTINA/URUGUAY es $500");
					} else {
						JOptionPane.showMessageDialog(null, "El valor para una MUJER talle L en ARGENTINA/URUGUAY es $520");
					}
				}
			} else {
				if (pais.equalsIgnoreCase("chile")) {
					if (talle.equalsIgnoreCase("s")) {
						JOptionPane.showMessageDialog(null, "El valor para una MUJER talle S en CHILE es $410");
					} else {
						if (talle.equalsIgnoreCase("m")) {
							JOptionPane.showMessageDialog(null, "El valor para una MUJER talle M en CHILE es $460");
						} else {
							JOptionPane.showMessageDialog(null, "El valor para una MUJER talle L en CHILE es $475");
						}
					}
				} else {
					if (talle.equalsIgnoreCase("s")) {
						JOptionPane.showMessageDialog(null, "El valor para una MUJER talle S en BRASIL/PERÚ es $425");
					} else {
						if (talle.equalsIgnoreCase("m")) {
							JOptionPane.showMessageDialog(null, "El valor para una MUJER talle M en BRASIL/PERÚ es $450");
						} else {
							JOptionPane.showMessageDialog(null, "El valor para una MUJER talle L en BRASIL/PERÚ es $480");
						}
					}
				}
			}
		}
	}

}
