package juegornd;

import javax.swing.*;

class Juegornd {

	public static void main(String[] args) {
		int m;
		//inputdialog(objeto,mensaje,titulo de cuadro, icono, null, null)
		String nom;
		nom = (String)(JOptionPane.showInputDialog(null, "Juego con moneda \n ingrese su nombre","Juego con moneda",
				JOptionPane.DEFAULT_OPTION, new ImageIcon(Juegornd.class.getResource("/img/monedaani.gif")),null,null));
		
		m = (int)(Math.random()*2);
		
		if (m==0) {
			
			JOptionPane.showMessageDialog(null, "Tienen parcialito", "Juego con moneda",JOptionPane.DEFAULT_OPTION,
					new ImageIcon(Juegornd.class.getResource("/img/cara.png")));
		} else {
			JOptionPane.showMessageDialog(null, "El tp1 tiene nota de concepto", "Juego de moneda",JOptionPane.DEFAULT_OPTION,
					new ImageIcon(Juegornd.class.getResource("/img/ceca.png")));
		}

	}

}
