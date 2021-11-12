package vasos;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

class Vasos {

	public static void main(String[] args) {
		int apuesta, vaso,eleccion_int;
		String eleccion;
		
		apuesta = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese su \napuesta de"
				+ "1 a 100"));
		
		if (apuesta>=1 && apuesta<=100) {
			eleccion = (String)JOptionPane.showInputDialog(null,"Ingrese el celular a destapar "
														 + "\ncon el número de la descripción:"
									 + "\n1 - Izquierda\n2 - Centro\n3 - Derecha","ICARDEANDO",
									 							   JOptionPane.WARNING_MESSAGE,
			          new ImageIcon(Vasos.class.getResource("/img/celulares.png")),null,null);
			
			eleccion_int = Integer.parseInt(eleccion);
			
			switch (eleccion_int) {
			case 1:
			break;
			case 2:
			break;
			case 3:
			break;	

			default: JOptionPane.showMessageDialog(null, "Debe elegir entre las "
													 + "\n3 opciones existentes");
			break;
			}
			vaso = (int)(Math.random()*3+1);
			if (eleccion_int==vaso) {
				JOptionPane.showMessageDialog(null, "ACERTÓ, eligió el celular " + vaso + "\nGana el doble \nde lo apostado\n"+
																		  apuesta*2,"ICARDEANDO",JOptionPane.DEFAULT_OPTION,
													   new ImageIcon(Vasos.class.getResource("/img/vaso" + vaso + ".png")));
			} else {
				JOptionPane.showMessageDialog(null, "FALLÓ, eligió el celular " + vaso + "\nPierde lo apostado","ICARDEANDO",
						JOptionPane.DEFAULT_OPTION, new ImageIcon(Vasos.class.getResource("/img/vaso"+ vaso + ".png")));
			}
		} else {
			JOptionPane.showMessageDialog(null, "La apuesta debe ser entre 1 y 100");
		}

	}

}
