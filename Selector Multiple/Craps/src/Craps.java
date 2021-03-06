import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

class Craps {
		
	public static void main(String[] args) {
		
		int apuesta=0, dado1=0, dado2=0, dado3=0, gana=0, suma=0;
		
		JOptionPane.showMessageDialog(null, "Tendr? 3 dados para jugar:\n"
										   +"- Gana el triple de la apuesta si suma 3 o 18.\n"
				                           +"- Pierde todo su dinero si obtiene 6, 9 o 12.\n"
				                           +"- Si no suma ninguna de esas cifras tiene segundo\n"
				                           +"  intento.\n"
				                           +"- En la segunda vuelta:\n" 
				                           +"      - Si los 3 dados son iguales gana el doble de la\n" 
				                           +"        apuesta.\n"
				                           +"      - Si alguno de los dados es 1 cobra la apuesta\n"
				                           +"        $10\n"
				                           +"      - Si obtiene 2 dados iguales recupera la apuesta\n",
				                           "CRAPS", JOptionPane.DEFAULT_OPTION,
				                           new ImageIcon(Craps.class.getResource("/img/presentacion.gif")));
		
		apuesta = (int)(Math.random()*100+1);
		JOptionPane.showMessageDialog(null, "Usted apostar? $" + apuesta);
		
		dado1 = (int)(Math.random()*6+1);
		JOptionPane.showMessageDialog(null, "Su primer dado es " + dado1, "CRAPS", JOptionPane.DEFAULT_OPTION,
											new ImageIcon(Craps.class.getResource("/img/dado"+dado1+".png")));
		
		dado2 = (int)(Math.random()*6+1);
		JOptionPane.showMessageDialog(null, "Su segundo dado es " + dado2, "CRAPS", JOptionPane.DEFAULT_OPTION,
											 new ImageIcon(Craps.class.getResource("/img/dado"+dado2+".png")));
		
		dado3 = (int)(Math.random()*6+1);
		JOptionPane.showMessageDialog(null, "Su tercer dado es " + dado3, "CRAPS", JOptionPane.DEFAULT_OPTION,
											new ImageIcon(Craps.class.getResource("/img/dado"+dado3+".png")));
		
			suma = dado1 + dado2 + dado3;
			
			JOptionPane.showMessageDialog(null, "La suma de sus dados" +"\n" + dado1+"\n" +dado2+"\n" +dado3+"\n" + "es: " + suma);
			
		if (suma==3 || suma==18) {
			gana = apuesta * 3;
			JOptionPane.showMessageDialog(null, "Gana el triple de la apuesta (" + apuesta +") $" + gana);
		} else {
			if (suma==6||suma==9||suma==12) {
				JOptionPane.showMessageDialog(null, "Saco 6, 9 o 12. Pierde la apuesta (" + apuesta + ") .Sus dados fueron: " +
																				   "\n" + dado1 + "\n" + dado2 + "\n" + dado3);
			} else {
				
					JOptionPane.showMessageDialog(null,"- Ha ingresado a la segunda vuelta:\n" 
	                           						  +"      - Si los 3 dados son iguales gana el doble de la\n" 
	                           						  +"        apuesta.\n"
	                           						  +"      - Si alguno de los dados es 1 cobra la apuesta\n"
	                           						  +"        $10\n"
	                           						  +"      - Si obtiene 2 dados iguales recupera la apuesta\n");
				
				dado1 = (int)(Math.random()*6+1);
				JOptionPane.showMessageDialog(null, "Su primer dado es " + dado1, "CRAPS", JOptionPane.DEFAULT_OPTION,
													new ImageIcon(Craps.class.getResource("/img/dado"+dado1+".png")));
				
				dado2 = (int)(Math.random()*6+1);
				JOptionPane.showMessageDialog(null, "Su segundo dado es " + dado2, "CRAPS", JOptionPane.DEFAULT_OPTION,
													 new ImageIcon(Craps.class.getResource("/img/dado"+dado2+".png")));
				
				dado3 = (int)(Math.random()*6+1);
				JOptionPane.showMessageDialog(null, "Su tercer dado es " + dado3, "CRAPS", JOptionPane.DEFAULT_OPTION,
													new ImageIcon(Craps.class.getResource("/img/dado"+dado3+".png")));
				if (dado1==dado2 && dado1==dado3) {
					gana = apuesta * 2;
					JOptionPane.showMessageDialog(null, "Gana el doble de su apuesta $" + gana + "\nDado 1: " 
													  + dado1 + "\nDado 2: " + dado2 + "\nDado 3: " + dado3);
				} else {
					if (dado1==1 || dado2==1|| dado3==1) {
						gana = apuesta + 10;
						JOptionPane.showMessageDialog(null, "Saco al menos un 1. Gana su apuesta $" + apuesta + " m?s $10. Es decir $" + gana 
												   					   + "\nDado 1: " + dado1 + "\nDado 2: " + dado2 + "\nDado 3: " + dado3);
					} else {
						if (dado1==dado2 || dado1==dado3 || dado2==dado3) {
							JOptionPane.showMessageDialog(null, "Recupera su apuesta $" + apuesta + " por obtener 2 dados iguales" 
				   					   						+ "\nDado 1: " + dado1 + "\nDado 2: " + dado2 + "\nDado 3: " + dado3);
						} else {
							JOptionPane.showMessageDialog(null, "Obtuvo 3 dados diferentes en la \nsegunda vuelta y ninguno igual a 1,"
																+ " \nPIERDE la apuesta" 
				   												+ "\nDado 1: " + dado1 + "\nDado 2: " + dado2 + "\nDado 3: " + dado3);
						}
					}
				}
			}
		}
		
		
	}

}
