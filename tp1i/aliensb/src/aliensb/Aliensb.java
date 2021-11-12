package aliensb;

import javax.swing.*;
class Aliensb {

	public static void main(String[] args) {

				final String PRESENTACION1 = "Es de noche y se encuentra en su cabaña en el bosque. "+
											"\nLa emisora en la radio tiene su especial de 10 horas "+
										  "\nininterrumpidas de música, desde fuera entra un fuerte "+
										  											   "\nresplandor";
				final String PRESENTACION2 = "Demasiada claridad... sale a ver qué pasa " +
										 "\n¡¡¡¡ Es un OVNI !!!! Más que uno, son cientos";
				final String PRESENTACION3 = "Corre para regresar a la casa. Tiene que calmarse, pensar "+
										"\ny escapar. No, escapar no. Recuerda que como deber principal "+
									  "\n(más allá de estar de vacaciones) su cargo en la ONU lo obliga "+
										   										 "\na pensar en el mundo";
				final String PRESENTACION4 = "El problema es que sus contactos también están de vacaciones,"+
											"\nel celular no funciona y solo cuenta con las postales que le"+
											"\nenviaron para identificar donde se encuentran. Reconozca los"+
										   "\nedificios en las postales para pedir ayuda con la vieja radio"+
									   	  "\nde onda corta de la cabaña y salvar la Tierra. Necesita 6 de 6";

				int contador = 0;
				String resp1,resp2,resp3,resp4,resp5,resp6;
				
				JOptionPane.showMessageDialog(null, PRESENTACION1, "ALIENS",JOptionPane.WARNING_MESSAGE,
								  new ImageIcon(Aliensb.class.getResource("/img/bosque nocturno.jfif")));
				JOptionPane.showMessageDialog(null, PRESENTACION2, "ALIENS",JOptionPane.WARNING_MESSAGE,
										    new ImageIcon(Aliensb.class.getResource("/img/ovni1.jfif")));
				JOptionPane.showMessageDialog(null, PRESENTACION3, "ALIENS",JOptionPane.WARNING_MESSAGE,
										   new ImageIcon(Aliensb.class.getResource("/img/huida1.jfif")));
				JOptionPane.showMessageDialog(null, PRESENTACION4,"ALIENS",JOptionPane.WARNING_MESSAGE,
										   new ImageIcon(Aliensb.class.getResource("/img/ovni3b.png")));
				
				resp1=(String)(JOptionPane.showInputDialog(null,"Piense...piense. Rudolf Schneider mencionó "+
											"que estaría \nen una ciudad con muchos cafés pequeños","ALIENS",
				      JOptionPane.DEFAULT_OPTION, new ImageIcon(Aliensb.class.getResource("/img/paris.png")),
												  												 null,null));
				
					if (resp1.equalsIgnoreCase("paris")) {
						JOptionPane.showMessageDialog(null, "El bueno de Rudolf, siempre tan \npreciso con sus "+
														  "descripciones.","ALIENS",JOptionPane.WARNING_MESSAGE,
											 new ImageIcon(Aliensb.class.getResource("/img/derribado.png")));
						contador = contador + 1;
					} else {
						JOptionPane.showMessageDialog(null, "Parece que vidrio y pirámide no le suenan a nada "+
									    "\nla próxima piense también en arte","ALIENS",JOptionPane.WARNING_MESSAGE,
									     new ImageIcon(Aliensb.class.getResource("/img/cara alien texto.png")));
					}
				
				resp2=(String)(JOptionPane.showInputDialog(null,"¿Por qué Xiang Liu escribe en catalán"+
														   "\ny habla de sandwichs de tortilla?","ALIENS",
				JOptionPane.DEFAULT_OPTION, new ImageIcon(Aliensb.class.getResource("/img/barcelona.png")),
									  														null,null));
				
					if (resp2.equalsIgnoreCase("barcelona")) {
						JOptionPane.showMessageDialog(null, "Qué bien vendría un sandwich de tortilla, no "+
											"\nes bueno enfrentar amenazas con el estómago vacío.","ALIENS",
					JOptionPane.WARNING_MESSAGE, new ImageIcon(Aliensb.class.getResource("/img/derribado.png")));
						contador = contador + 1;
					} else {
						JOptionPane.showMessageDialog(null, "Es muy parecida a la basílica de Lujan...",
																   "ALIENS",JOptionPane.WARNING_MESSAGE,
									 new ImageIcon(Aliensb.class.getResource("/img/cara alien texto.png")));
					}
				
				resp3=(String)(JOptionPane.showInputDialog(null,"A Lungu Mbembe le gusta divertirse..."+
												"\n¿Qué ciudad puede tener todo tan mezclado?","ALIENS",
					JOptionPane.DEFAULT_OPTION, new ImageIcon(Aliensb.class.getResource("/img/las vegas.png")),
																								null,null));
					
					if (resp3.equalsIgnoreCase("las vegas")) {
						JOptionPane.showMessageDialog(null, "Esperemos que gane algo en la ruleta, la contra"+
														  "\nofensiva va a necesitar financiamiento","ALIENS",
					JOptionPane.WARNING_MESSAGE, new ImageIcon(Aliensb.class.getResource("/img/derribado.png")));
						contador = contador + 1;
						
					} else {
						JOptionPane.showMessageDialog(null, "'El precio de la historia' ¿Tampoco le suena?"+
													  "\nPobre Chumlee.","ALIENS",JOptionPane.WARNING_MESSAGE,
									   new ImageIcon(Aliensb.class.getResource("/img/cara alien texto.png")));
					}
				
				resp4=(String)(JOptionPane.showInputDialog(null,"Anabella Rossi dijo algo del \ndesierto. La "+
																			   "cuestión es cual...", "ALIENS",
				  JOptionPane.DEFAULT_OPTION, new ImageIcon(Aliensb.class.getResource("/img/guiza.png")),
				  																			   null,null));
				
					if (resp4.equalsIgnoreCase("guiza")) {
						JOptionPane.showMessageDialog(null, "¿Los camellos comerán extraterrestres?","ALIENS",
					JOptionPane.WARNING_MESSAGE, new ImageIcon(Aliensb.class.getResource("/img/derribado.png")));
						contador = contador + 1;
					} else {
						JOptionPane.showMessageDialog(null, "Le podría recomendar 'Alienígenas \nacestrales', salen"+
												     " estas y otras pirámides","ALIENS",JOptionPane.WARNING_MESSAGE,
										      new ImageIcon(Aliensb.class.getResource("/img/cara alien texto.png")));
					}
				
				resp5=(String)(JOptionPane.showInputDialog(null,"¿Era un auto viejo el que vio \nen las fotos de Analía"+
																	  "Esquivel?...","ALIENS",JOptionPane.DEFAULT_OPTION,
										  	   		      new ImageIcon(Aliensb.class.getResource("/img/la habana.png")),
													       									 			     null,null));
				
					if (resp5.equalsIgnoreCase("la habana")) {
						
						JOptionPane.showMessageDialog(null, "Quizas desde Cuba puedan 'palal' esta invasión","ALIENS",
						  JOptionPane.WARNING_MESSAGE,new ImageIcon(Aliensb.class.getResource("/img/derribado.png")));
						contador = contador + 1;
					} else {
						JOptionPane.showMessageDialog(null, "¿Por qué tiene esa remera del Che puesta?","ALIENS",
						JOptionPane.WARNING_MESSAGE, new ImageIcon(Aliensb.class.getResource("/img/cara alien texto.png")));
					}
					
				resp6 = (String)(JOptionPane.showInputDialog(null,"En Instagram Joao Silva aparecía todas las tardes"+
										 "\ncon una taza de té ¿Será una manía? ","ALIENS",JOptionPane.DEFAULT_OPTION,
				  	   			 	 new ImageIcon(Aliensb.class.getResource("/img/londres.png")),
							 			   null,null));
				
					if (resp6.equalsIgnoreCase("londres")) {
						JOptionPane.showMessageDialog(null, "Dicen que los británicos son aburridos... mientras estén "+
											   "\nbien armados no habría problema","ALIENS",JOptionPane.WARNING_MESSAGE,
												     new ImageIcon(Aliensb.class.getResource("/img/derribado.png")));
						contador = contador + 1;
					} else {
						JOptionPane.showMessageDialog(null, "Parece que el único reloj que vio en su \nvida es el que lleva en"+
																		   	  " la muñeca","ALIENS",JOptionPane.WARNING_MESSAGE, 
												         new ImageIcon(Aliensb.class.getResource("/img/cara alien texto.png")));
					}
					
				if (contador == 0) {
					JOptionPane.showMessageDialog(null, "¡¡DERROTA!!\nCon 0 aciertos nos fue difícil"+
										  "\ndefender su honor... algunos dicen que es una verguenza"+
									   	  "\npara la raza humana. A esta altura su cuerpo debe estar"+ 
									   	  			"\nsiendo diseccionado en la nave madre","ALIENS",
		                   JOptionPane.WARNING_MESSAGE, new ImageIcon(Aliensb.class.getResource("/img/abduccion1b.png")));
				}
				if(contador == 1) {
					JOptionPane.showMessageDialog(null, "¡¡DERROTA!!\nTuvo solamente una respueta correcta, no creemos"+ 
											   				   "\nque haya tenido muchas expectativas con salir ileso."+ 
										   				     "\nDesde aquí abajo lo saludamos mientras asciende por el"+ 
										   				       "\nhaz de luz hasta el disco plateado. Esperemos sea un"+ 
						   				   "\nproyecto secreto de los yankis...","ALIENS",JOptionPane.WARNING_MESSAGE,
								                  new ImageIcon(Aliensb.class.getResource("/img/abduccion 10.png")));
				}
				if (contador == 2) {
					JOptionPane.showMessageDialog(null, "¡¡DERROTA!!\nTuvo dos respuestas correctas por lo que luego"+ 
											   	   "\nde comunicarse con quien pudo localizar, salió corriendo hacia"+
											   			 "\nel bosque, donde de repente comenzó a levitar. Al ver el"+
											   		   "\nplato metálico tuvo la suerte de desmayarse... le deseamos"+
											   					   "\nlo mejor.","ALIENS",JOptionPane.WARNING_MESSAGE,
											   		new ImageIcon(Aliensb.class.getResource("/img/abduccion4b.png")));			
				}
				if (contador == 3) {
					JOptionPane.showMessageDialog(null, "¡¡DERROTA!!\nPudo hablar con tres de sus contactos, pero eso no"+
											  		         "\nevitó que una fuerza invisible lo atrajera hacia afuera."+
											  			  "\nTampoco evito que los tres pequeños seres grises de grandes"+
											  		   "\nojos negros se queden mirando su rostro de terror...", "ALIENS",
											  		   JOptionPane.WARNING_MESSAGE, new ImageIcon(Aliensb.class.getResource
											  				   									("/img/3 grises b.png")));
				}
				if (contador == 4) {
					JOptionPane.showMessageDialog(null, "¡¡DERROTA!!\nLuego de poder comunicarse con cuatro de sus"+ 
												  		"\nallegados termino siendo abducido...no se preocupe, la "+ 
												"\npérdida de memoria que acompaña estos acontecimientos permitirá"+
													  "\nque se libre de los malos recuerdos...hasta que aparezcan"+
								    "\nen sus pesadillas o vuelvan por usted.","ALIENS",JOptionPane.WARNING_MESSAGE,
										new ImageIcon(Aliensb.class.getResource("/img/abduccion5b.png")));
				}
				if (contador == 5) {
					JOptionPane.showMessageDialog(null, "¡¡DERROTA!!\nSus cinco contactos no son suficientes para"+
													"\nresolver el problema. Sale corriendo hacia la ruta y queda"+
												 "\ncegado por un haz de luz...La luz cegadora venia de los faros"+
													  "\nde un viejo camión que se encontraba parado al borde del"+ 
													 "\nasfalto. El amable campesino le ofrece la ayuda que tanto"+
												   "\nestaba necesitando. Lo que justamente no estaba necesitando"+
							   		        	   		   "\nes que la radio se volviera loca justo antes de que"+ 
							   		        	  	   "\nel camión se apagara y que los tres pequeños humanoides"+
							   		        	  	        "\nse acerquen caminando desde los arbustos", "ALIENS",
											    JOptionPane.WARNING_MESSAGE, new ImageIcon(Aliensb.class.getResource
											    									  ("/img/alien y auto b.png")));
				}
				if (contador == 6) {
					JOptionPane.showMessageDialog(null, "¡¡PLANETA A SALVO!!! Con seis aciertos pudo contactar a todos."+
													 "\nEllos a su vez a sus contactos. Su acción tomó estado público y"+
														"\nfue reconocido como héroe... pero también fue reconocido por"+
												  "\nmalversar fondos públicos. Ya vio como investigan los periodistas."+
														"\nMejor capturado por humanos que invadido por aliens","ALIENS",
										             JOptionPane.WARNING_MESSAGE, new ImageIcon(Aliensb.class.getResource
										            		 								   ("/img/arrestadob.png")));
				}
			}		

		}


