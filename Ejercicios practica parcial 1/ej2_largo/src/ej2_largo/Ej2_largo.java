package ej2_largo;

import javax.swing.JOptionPane;

class Ej2_largo {

	public static void main(String[] args) {
		int maria,juan,pedro,votos_cand_1,votos_cand_2;
		Double mitad;
		String balotaje1,balotaje2;
		
		maria = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los votos obtenidos por MARÍA"));
		juan = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los votos obtenidos por JUAN"));
		pedro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los votos obtenidos por PEDRO"));
		
		mitad = (double)((maria + juan + pedro)/2);
		
		if (maria>mitad || juan>mitad || pedro>mitad) {
			if (maria>mitad) {
				JOptionPane.showMessageDialog(null, "MARÍA ha ganado la elección");
			} else {
				if (juan>mitad) {
					JOptionPane.showMessageDialog(null, "JUAN ha ganado la elección");
				} else {
					JOptionPane.showMessageDialog(null, "PEDRO ha ganado la elección");
				}
			}
		} else {
			if ((juan==pedro && maria>juan)||(juan==maria && pedro>juan)||
				(pedro==maria && juan>pedro)||(maria==juan && maria==pedro)) {
				if (maria==juan && maria==pedro) {
					JOptionPane.showMessageDialog(null, "La elección queda anulada por empate triple");
				} else {
					JOptionPane.showMessageDialog(null, "La elección queda anulada por empate en el segundo lugar");
				}
			} else {
				if (maria>=juan && juan>pedro) {  //si primero y segundo son iguales y mayores al tercero falla
					balotaje1 = "MARÍA";
					balotaje2 = "JUAN";
				} else {
					if (maria>=pedro && pedro>juan) {
						balotaje1 = "MARÍA";
						balotaje2 = "PEDRO";
					} else {
						balotaje1 = "JUAN";
						balotaje2 = "PEDRO";
					}
				}
					
				JOptionPane.showMessageDialog(null, "Los candidatos " + balotaje1 + " y " + balotaje2 + " irán a segunda vuelta");
				
				votos_cand_1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese los votos obtenidos por " + balotaje1 +
																										   " en segunda vuelta"));
				votos_cand_2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese los votos obtenidos por " + balotaje2 +
						  																				   " en segunda vuelta"));
				
				if (votos_cand_1==votos_cand_2) {
					JOptionPane.showMessageDialog(null, "La elección queda anulada por empate en segunda vuelta");
				} else {
					if (votos_cand_1>votos_cand_2) {
						JOptionPane.showMessageDialog(null, "El ganador/a de la elección es " + balotaje1);
					} else {
						JOptionPane.showMessageDialog(null, "El ganador/a de la elección es " + balotaje2);
					}
					
				}
			}
		}
		
		
	}

}
