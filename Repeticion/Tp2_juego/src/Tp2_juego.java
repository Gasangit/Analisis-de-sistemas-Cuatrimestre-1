import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

class Tp2_juego {

	public static void main(String[] args) {
		int juego, num, intento=0, n_jugador=0, n_palabra;
		String jugar, lista[]= {"alacran","jugador","mezclar","pantalon","estatico",
				"remera","vacaciones","montaña","cataratas","paraiso"}, jug_palabra;
		
		do {
			juego = Integer.parseInt(JOptionPane.showInputDialog
					("Por favor indique el \njuego que desea jugar (1 o 2)" +
					 "\n1 - Adiviná el número\n2 - Revuelto de letras"));
			
			switch (juego) {
			case 1:
				JOptionPane.showMessageDialog(null, "Tiene 5 intentos para adivinar"+ 
													 "\nun número del 0 al 100 que el"+ 
													 "\nsistema generará al azar. En cada"+
													 "\nintento se le informara si el número"+
													 "\nque menciona es menor o mayor al que"+ 
													 "\ngeneró la maquina");
				
				num = (int)(Math.random()*101);
				while (intento!=5) {
					
					intento+=1;
					
					n_jugador = Integer.parseInt(JOptionPane.showInputDialog("Intento: " + intento +
																  			"\nIndique su número"));
					
					if (n_jugador<0||n_jugador>100) {
						JOptionPane.showMessageDialog(null, "Debe ingresar un número entre 0 y 100. "
														  + "\nNo se contará este intento");
						intento-=1;
					} else {
						if (n_jugador==num) {
							JOptionPane.showMessageDialog(null, "ACERTÓ ¡¡¡FELICITACIONES!!!"+
																"\nEl número es " + num);
							intento = 5;
						} else {
							if (n_jugador<num) {
								JOptionPane.showMessageDialog(null, "El número " + n_jugador + 
																	" es MENOR al generado, \n" +
																	"ELIJA UN NÚMERO MAYOR", "NÚMEROS",
																	JOptionPane.DEFAULT_OPTION,
																	new ImageIcon(Tp2_juego.class.
																	getResource("/img/arriba.gif")));
							} else {
								JOptionPane.showMessageDialog(null, "El número " + n_jugador + 
																	" es MAYOR al generado, \n" + 
																	"ELIJA UN NÚMERO MENOR", "NÚMEROS",
																	JOptionPane.DEFAULT_OPTION,
																	new ImageIcon(Tp2_juego.class.
																	getResource("/img/abajo.gif")));
							}
							if (intento==5) {
								JOptionPane.showMessageDialog(null, "Se terminaron los intentos"+
																    "\nEl número es: " + num);
							}
						}
					}
				}
				
			break;
			case 2:
				n_palabra = (int)(Math.random()*10);
								
				jug_palabra = (String)(JOptionPane.showInputDialog(null,
								  "Adivine la palabra que se forma con"+
								  "\nlas letras mezcladas en la imagen"+
								  "\n(no ingrese tildes)", "PALABRAS REVUELTAS", 
								  JOptionPane.DEFAULT_OPTION,
							      new ImageIcon(Tp2_juego.class.getResource("/img/DESORDEN"+n_palabra+".png"))
								  ,null,null));
				
				System.out.println(n_palabra +"   "+ jug_palabra);
				
				if (jug_palabra.equalsIgnoreCase(lista[n_palabra])) {
					JOptionPane.showMessageDialog(null, "ACERTÓ ¡¡¡FELICITACIONES!!!",
																 "PALABRAS REVUELTAS",
														  JOptionPane.WARNING_MESSAGE,
														new ImageIcon(Tp2_juego.class.
										 getResource("/img/ORDEN"+n_palabra+".png")));
				} else {
					JOptionPane.showMessageDialog(null, "NO ACERTÓ, la palabra correcta es:",
																		 "PALABRAS REVUELTAS",
																  JOptionPane.WARNING_MESSAGE,
																new ImageIcon(Tp2_juego.class.
												 getResource("/img/ORDEN"+n_palabra+".png")));
				}
				break;
	
			default: JOptionPane.showMessageDialog(null, "Solo hay 2 juegos disponibles"+
														 "\ndebe ingresar 1 o 2");
				break;
			}
			intento = 0;
			jugar = JOptionPane.showInputDialog("¿Desea volver a jugar?");
		} while (jugar.equalsIgnoreCase("si"));
		
		

	}

}
