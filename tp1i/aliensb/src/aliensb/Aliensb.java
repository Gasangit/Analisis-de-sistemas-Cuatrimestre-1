package aliensb;

import javax.swing.*;
class Aliensb {

	public static void main(String[] args) {

				final String PRESENTACION1 = "Es de noche y se encuentra en su caba�a en el bosque. "+
											"\nLa emisora en la radio tiene su especial de 10 horas "+
										  "\nininterrumpidas de m�sica, desde fuera entra un fuerte "+
										  											   "\nresplandor";
				final String PRESENTACION2 = "Demasiada claridad... sale a ver qu� pasa " +
										 "\n���� Es un OVNI !!!! M�s que uno, son cientos";
				final String PRESENTACION3 = "Corre para regresar a la casa. Tiene que calmarse, pensar "+
										"\ny escapar. No, escapar no. Recuerda que como deber principal "+
									  "\n(m�s all� de estar de vacaciones) su cargo en la ONU lo obliga "+
										   										 "\na pensar en el mundo";
				final String PRESENTACION4 = "El problema es que sus contactos tambi�n est�n de vacaciones,"+
											"\nel celular no funciona y solo cuenta con las postales que le"+
											"\nenviaron para identificar donde se encuentran. Reconozca los"+
										   "\nedificios en las postales para pedir ayuda con la vieja radio"+
									   	  "\nde onda corta de la caba�a y salvar la Tierra. Necesita 6 de 6";

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
				
				resp1=(String)(JOptionPane.showInputDialog(null,"Piense...piense. Rudolf Schneider mencion� "+
											"que estar�a \nen una ciudad con muchos caf�s peque�os","ALIENS",
				      JOptionPane.DEFAULT_OPTION, new ImageIcon(Aliensb.class.getResource("/img/paris.png")),
												  												 null,null));
				
					if (resp1.equalsIgnoreCase("paris")) {
						JOptionPane.showMessageDialog(null, "El bueno de Rudolf, siempre tan \npreciso con sus "+
														  "descripciones.","ALIENS",JOptionPane.WARNING_MESSAGE,
											 new ImageIcon(Aliensb.class.getResource("/img/derribado.png")));
						contador = contador + 1;
					} else {
						JOptionPane.showMessageDialog(null, "Parece que vidrio y pir�mide no le suenan a nada "+
									    "\nla pr�xima piense tambi�n en arte","ALIENS",JOptionPane.WARNING_MESSAGE,
									     new ImageIcon(Aliensb.class.getResource("/img/cara alien texto.png")));
					}
				
				resp2=(String)(JOptionPane.showInputDialog(null,"�Por qu� Xiang Liu escribe en catal�n"+
														   "\ny habla de sandwichs de tortilla?","ALIENS",
				JOptionPane.DEFAULT_OPTION, new ImageIcon(Aliensb.class.getResource("/img/barcelona.png")),
									  														null,null));
				
					if (resp2.equalsIgnoreCase("barcelona")) {
						JOptionPane.showMessageDialog(null, "Qu� bien vendr�a un sandwich de tortilla, no "+
											"\nes bueno enfrentar amenazas con el est�mago vac�o.","ALIENS",
					JOptionPane.WARNING_MESSAGE, new ImageIcon(Aliensb.class.getResource("/img/derribado.png")));
						contador = contador + 1;
					} else {
						JOptionPane.showMessageDialog(null, "Es muy parecida a la bas�lica de Lujan...",
																   "ALIENS",JOptionPane.WARNING_MESSAGE,
									 new ImageIcon(Aliensb.class.getResource("/img/cara alien texto.png")));
					}
				
				resp3=(String)(JOptionPane.showInputDialog(null,"A Lungu Mbembe le gusta divertirse..."+
												"\n�Qu� ciudad puede tener todo tan mezclado?","ALIENS",
					JOptionPane.DEFAULT_OPTION, new ImageIcon(Aliensb.class.getResource("/img/las vegas.png")),
																								null,null));
					
					if (resp3.equalsIgnoreCase("las vegas")) {
						JOptionPane.showMessageDialog(null, "Esperemos que gane algo en la ruleta, la contra"+
														  "\nofensiva va a necesitar financiamiento","ALIENS",
					JOptionPane.WARNING_MESSAGE, new ImageIcon(Aliensb.class.getResource("/img/derribado.png")));
						contador = contador + 1;
						
					} else {
						JOptionPane.showMessageDialog(null, "'El precio de la historia' �Tampoco le suena?"+
													  "\nPobre Chumlee.","ALIENS",JOptionPane.WARNING_MESSAGE,
									   new ImageIcon(Aliensb.class.getResource("/img/cara alien texto.png")));
					}
				
				resp4=(String)(JOptionPane.showInputDialog(null,"Anabella Rossi dijo algo del \ndesierto. La "+
																			   "cuesti�n es cual...", "ALIENS",
				  JOptionPane.DEFAULT_OPTION, new ImageIcon(Aliensb.class.getResource("/img/guiza.png")),
				  																			   null,null));
				
					if (resp4.equalsIgnoreCase("guiza")) {
						JOptionPane.showMessageDialog(null, "�Los camellos comer�n extraterrestres?","ALIENS",
					JOptionPane.WARNING_MESSAGE, new ImageIcon(Aliensb.class.getResource("/img/derribado.png")));
						contador = contador + 1;
					} else {
						JOptionPane.showMessageDialog(null, "Le podr�a recomendar 'Alien�genas \nacestrales', salen"+
												     " estas y otras pir�mides","ALIENS",JOptionPane.WARNING_MESSAGE,
										      new ImageIcon(Aliensb.class.getResource("/img/cara alien texto.png")));
					}
				
				resp5=(String)(JOptionPane.showInputDialog(null,"�Era un auto viejo el que vio \nen las fotos de Anal�a"+
																	  "Esquivel?...","ALIENS",JOptionPane.DEFAULT_OPTION,
										  	   		      new ImageIcon(Aliensb.class.getResource("/img/la habana.png")),
													       									 			     null,null));
				
					if (resp5.equalsIgnoreCase("la habana")) {
						
						JOptionPane.showMessageDialog(null, "Quizas desde Cuba puedan 'palal' esta invasi�n","ALIENS",
						  JOptionPane.WARNING_MESSAGE,new ImageIcon(Aliensb.class.getResource("/img/derribado.png")));
						contador = contador + 1;
					} else {
						JOptionPane.showMessageDialog(null, "�Por qu� tiene esa remera del Che puesta?","ALIENS",
						JOptionPane.WARNING_MESSAGE, new ImageIcon(Aliensb.class.getResource("/img/cara alien texto.png")));
					}
					
				resp6 = (String)(JOptionPane.showInputDialog(null,"En Instagram Joao Silva aparec�a todas las tardes"+
										 "\ncon una taza de t� �Ser� una man�a? ","ALIENS",JOptionPane.DEFAULT_OPTION,
				  	   			 	 new ImageIcon(Aliensb.class.getResource("/img/londres.png")),
							 			   null,null));
				
					if (resp6.equalsIgnoreCase("londres")) {
						JOptionPane.showMessageDialog(null, "Dicen que los brit�nicos son aburridos... mientras est�n "+
											   "\nbien armados no habr�a problema","ALIENS",JOptionPane.WARNING_MESSAGE,
												     new ImageIcon(Aliensb.class.getResource("/img/derribado.png")));
						contador = contador + 1;
					} else {
						JOptionPane.showMessageDialog(null, "Parece que el �nico reloj que vio en su \nvida es el que lleva en"+
																		   	  " la mu�eca","ALIENS",JOptionPane.WARNING_MESSAGE, 
												         new ImageIcon(Aliensb.class.getResource("/img/cara alien texto.png")));
					}
					
				if (contador == 0) {
					JOptionPane.showMessageDialog(null, "��DERROTA!!\nCon 0 aciertos nos fue dif�cil"+
										  "\ndefender su honor... algunos dicen que es una verguenza"+
									   	  "\npara la raza humana. A esta altura su cuerpo debe estar"+ 
									   	  			"\nsiendo diseccionado en la nave madre","ALIENS",
		                   JOptionPane.WARNING_MESSAGE, new ImageIcon(Aliensb.class.getResource("/img/abduccion1b.png")));
				}
				if(contador == 1) {
					JOptionPane.showMessageDialog(null, "��DERROTA!!\nTuvo solamente una respueta correcta, no creemos"+ 
											   				   "\nque haya tenido muchas expectativas con salir ileso."+ 
										   				     "\nDesde aqu� abajo lo saludamos mientras asciende por el"+ 
										   				       "\nhaz de luz hasta el disco plateado. Esperemos sea un"+ 
						   				   "\nproyecto secreto de los yankis...","ALIENS",JOptionPane.WARNING_MESSAGE,
								                  new ImageIcon(Aliensb.class.getResource("/img/abduccion 10.png")));
				}
				if (contador == 2) {
					JOptionPane.showMessageDialog(null, "��DERROTA!!\nTuvo dos respuestas correctas por lo que luego"+ 
											   	   "\nde comunicarse con quien pudo localizar, sali� corriendo hacia"+
											   			 "\nel bosque, donde de repente comenz� a levitar. Al ver el"+
											   		   "\nplato met�lico tuvo la suerte de desmayarse... le deseamos"+
											   					   "\nlo mejor.","ALIENS",JOptionPane.WARNING_MESSAGE,
											   		new ImageIcon(Aliensb.class.getResource("/img/abduccion4b.png")));			
				}
				if (contador == 3) {
					JOptionPane.showMessageDialog(null, "��DERROTA!!\nPudo hablar con tres de sus contactos, pero eso no"+
											  		         "\nevit� que una fuerza invisible lo atrajera hacia afuera."+
											  			  "\nTampoco evito que los tres peque�os seres grises de grandes"+
											  		   "\nojos negros se queden mirando su rostro de terror...", "ALIENS",
											  		   JOptionPane.WARNING_MESSAGE, new ImageIcon(Aliensb.class.getResource
											  				   									("/img/3 grises b.png")));
				}
				if (contador == 4) {
					JOptionPane.showMessageDialog(null, "��DERROTA!!\nLuego de poder comunicarse con cuatro de sus"+ 
												  		"\nallegados termino siendo abducido...no se preocupe, la "+ 
												"\np�rdida de memoria que acompa�a estos acontecimientos permitir�"+
													  "\nque se libre de los malos recuerdos...hasta que aparezcan"+
								    "\nen sus pesadillas o vuelvan por usted.","ALIENS",JOptionPane.WARNING_MESSAGE,
										new ImageIcon(Aliensb.class.getResource("/img/abduccion5b.png")));
				}
				if (contador == 5) {
					JOptionPane.showMessageDialog(null, "��DERROTA!!\nSus cinco contactos no son suficientes para"+
													"\nresolver el problema. Sale corriendo hacia la ruta y queda"+
												 "\ncegado por un haz de luz...La luz cegadora venia de los faros"+
													  "\nde un viejo cami�n que se encontraba parado al borde del"+ 
													 "\nasfalto. El amable campesino le ofrece la ayuda que tanto"+
												   "\nestaba necesitando. Lo que justamente no estaba necesitando"+
							   		        	   		   "\nes que la radio se volviera loca justo antes de que"+ 
							   		        	  	   "\nel cami�n se apagara y que los tres peque�os humanoides"+
							   		        	  	        "\nse acerquen caminando desde los arbustos", "ALIENS",
											    JOptionPane.WARNING_MESSAGE, new ImageIcon(Aliensb.class.getResource
											    									  ("/img/alien y auto b.png")));
				}
				if (contador == 6) {
					JOptionPane.showMessageDialog(null, "��PLANETA A SALVO!!! Con seis aciertos pudo contactar a todos."+
													 "\nEllos a su vez a sus contactos. Su acci�n tom� estado p�blico y"+
														"\nfue reconocido como h�roe... pero tambi�n fue reconocido por"+
												  "\nmalversar fondos p�blicos. Ya vio como investigan los periodistas."+
														"\nMejor capturado por humanos que invadido por aliens","ALIENS",
										             JOptionPane.WARNING_MESSAGE, new ImageIcon(Aliensb.class.getResource
										            		 								   ("/img/arrestadob.png")));
				}
			}		

		}


