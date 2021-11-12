package aliens;

import javax.swing.*;

class Aliens {

	public static void main(String[] args) {
		final String PRESENTACION1 = "Se encuentra en un bosque de noche, ve una luz intensa...";
		final String PRESENTACION2 = "Demasiada claridad... ¡¡¡¡ Es un OVNI !!!!";
		final String PRESENTACION3 = "Tiene que calmarse, pensar y escapar...";
		final String PRESENTACION4 = "Consiga  tomar 6  decisiones correctas  para poder  estar a"+
								   "\nsalvo. Ingrese  como  dato  las  palabras  que  aparecen  en"+
							       "\nMAYÚSCULA dentro del texto (puede escribirlas en minúscula."+ 
							       "\nEn  caso de  no ingresar  respuesta o  ingresar un  dato no"+ 
							       "\nválido se contará como una mala decisión).";

		int contador = 0;
		String resp1,resp2,resp3,resp4,resp5,resp6;
		
		JOptionPane.showMessageDialog(null, PRESENTACION1, "ALIENS",JOptionPane.WARNING_MESSAGE,
						  new ImageIcon(Aliens.class.getResource("/img/bosque nocturno.jfif")));
		JOptionPane.showMessageDialog(null, PRESENTACION2, "ALIENS",JOptionPane.WARNING_MESSAGE,
								    new ImageIcon(Aliens.class.getResource("/img/ovni1.jfif")));
		JOptionPane.showMessageDialog(null, PRESENTACION3, "ALIENS",JOptionPane.WARNING_MESSAGE,
								   new ImageIcon(Aliens.class.getResource("/img/huida1.jfif")));
		JOptionPane.showMessageDialog(null, PRESENTACION4,"ALIENS",JOptionPane.WARNING_MESSAGE,
								   new ImageIcon(Aliens.class.getResource("/img/ovni3b.png")));
		
		resp1=(String)(JOptionPane.showInputDialog(null,"El sendero se bifurca. Hacia la IZQUIERDA\n"+
								              "el camino se encuentra embarrado y hacia la DERECHA\n"+ 
								              "termina en unos arbustos ¿Qué sendero tomará?","ALIENS",
			 JOptionPane.DEFAULT_OPTION, new ImageIcon(Aliens.class.getResource("/img/sendero.jfif")),
										  												  null,null));
		
			if (resp1.equalsIgnoreCase("izquierda")) {
				JOptionPane.showMessageDialog(null, "Tiene la suerte de encontrar una piedra en medio"+
												   "\ndel barro que le permite moverse con velocidad."+
									 "\nLa nave desciende cerca.","ALIENS",JOptionPane.WARNING_MESSAGE,
									 new ImageIcon(Aliens.class.getResource("/img/escape texto.png")));
				contador = contador + 1;
			} else {
				JOptionPane.showMessageDialog(null, "Se introdujo demasiado rápido detrás de los"+ 
									"\narbustos torciéndose el tobillo. No es grave, pero pierde"+
				 "\nunos segundos. La nave desciende cerca.","ALIENS",JOptionPane.WARNING_MESSAGE,
		      				new ImageIcon(Aliens.class.getResource("/img/cara alien texto.png")));
			}
		
		resp2=(String)(JOptionPane.showInputDialog(null,"Unos metros más adelante ve un árbol."+ 
							  		"\nDecida si SUBIR y esconderse o SEGUIR adelante","ALIENS",
		JOptionPane.DEFAULT_OPTION, new ImageIcon(Aliens.class.getResource("/img/bosqueb.png")),
							  														null,null));
		
			if (resp2.equalsIgnoreCase("subir")) {
				JOptionPane.showMessageDialog(null, "No parecía la mejor opción ¿No? Desde la copa"+
										   "\ndel árbol puede ver el mejor camino hacia una cabaña"+
										 "\ncercana. De no haberse subido habría sumado 100 metros"+ 
										  "\na la huida. La cobardía a veces ayuda. Se dirige a la"+
										"\ncabaña que parece más segura. Se ven sombras humanoides"+
									   "\nentre el follaje...","ALIENS",JOptionPane.WARNING_MESSAGE,
								  new ImageIcon(Aliens.class.getResource("/img/escape texto.png")));
				contador = contador + 1;
			} else {
				JOptionPane.showMessageDialog(null, "El pánico del escape le hace tomar el camino"+
										   "\nmás largo hacia la cabaña que ve adelante. De haber"+
								   	   "\nsubido al árbol podría haber tomado un atajo que se ve"+
								   	  "\ndesde arriba. Se ven sombras humanoides entre el follaje"+
											           "\n...","ALIENS",JOptionPane.WARNING_MESSAGE,
							 new ImageIcon(Aliens.class.getResource("/img/cara alien texto.png")));
			}
		
		resp3=(String)(JOptionPane.showInputDialog(null,"Ingresa a la cabaña que es algo rustica y"+
						 				   "\nno parece ofrecer un buen refugio. Hay una linterna,"+ 
					 				    "\ndecida si TOMAR o DEJAR la misma. La cabaña experimenta"+
			 				   "\nun ligero temblor, que extraño...mejor seguir adelante.","ALIENS",
			JOptionPane.DEFAULT_OPTION, new ImageIcon(Aliens.class.getResource("/img/cabana3b.png")),
																						null,null));
			
			if (resp3.equalsIgnoreCase("dejar")) {
				JOptionPane.showMessageDialog(null, "Escaparse en la oscuridad sin llamar la atención"+
											   "\ncon la linterna fue lo mejor que se pudo hacer, las"+
										   "\nsombras humanoides ahora se ven algo más pequeñas, pero"+
						  "\ntodavía no está fuera de peligro...","ALIENS",JOptionPane.WARNING_MESSAGE,
						   			 new ImageIcon(Aliens.class.getResource("/img/escape texto.png")));
				contador = contador + 1;
				
			} else {
				JOptionPane.showMessageDialog(null, "La luz de la linterna llama la atención de las"+
										   "\nsombras humanoides...¡¡¡Ahora se ven más cerca!!! Fue"+
									   	 "\nmala idea lo de la linterna. Ahora a intentar alejarnos"+
									  "\nlo más rápido posible.","ALIENS",JOptionPane.WARNING_MESSAGE,
							   new ImageIcon(Aliens.class.getResource("/img/cara alien texto.png")));
			}
		
		resp4=(String)(JOptionPane.showInputDialog(null,"Llega a un alambrado. Es difícil decidir"+
												  "\nsi BORDEAR el mismo hasta encontrar un tramo"+ 
										  "\nroto por donde pasar o TREPAR ¿?¿?¿?¿?¿?...","ALIENS",
		  JOptionPane.DEFAULT_OPTION, new ImageIcon(Aliens.class.getResource("/img/alambrado2b.png")),
		  																			   null,null));
		
			if (resp4.equalsIgnoreCase("bordear")) {
				JOptionPane.showMessageDialog(null, "Moverse junto al alambrado le permite mantenerse"+
										   "\noculto en las sombras. Por suerte a los pocos metros el"+ 
									   	 "\nalambrado está roto. Una luz sondea por sobre los árboles"+
									   	 	 "\npero ahora puede estar más tranquilo con el alambrado"+
											     "\nde por medio","ALIENS",JOptionPane.WARNING_MESSAGE,
									 new ImageIcon(Aliens.class.getResource("/img/escape texto.png")));
				contador = contador + 1;
			} else {
				JOptionPane.showMessageDialog(null, "Ha subido al alambrado desde donde puede ser"+ 
									   "\nvisto... y parece que lo vieron... Lo confirma el ruido"+
							   	  "\nde ramas cercano y el haz de luz que apunta en su dirección."+
							   	  				"\nNo fue buena idea dejarse ver en lo alto de la"+ 
							   	  				   "\nvalla.","ALIENS",JOptionPane.WARNING_MESSAGE,
							 new ImageIcon(Aliens.class.getResource("/img/cara alien texto.png")));
			}
		
		resp5=(String)(JOptionPane.showInputDialog(null,"El sonido del agua hace que recuerde el río cercano."+
					 										  "\n Hay un puente a unos 50 metros... ¿Qué será"+
		 										  	"\nmejor? ¿CRUZAR el puente o NADAR hasta la otra orilla?"+
		 										  	   "\nEsperemos que los extraterrestres sean alérgicos al"+
		 										  	   			 "\nagua.","ALIENS",JOptionPane.DEFAULT_OPTION,
								  	   			 	 new ImageIcon(Aliens.class.getResource("/img/rio2b.png")),
											       									 			   null,null));
		
			if (resp5.equalsIgnoreCase("nadar")) {
				
				JOptionPane.showMessageDialog(null, "Al meterse al río, lo arrastra la corriente que"+
										  "\npor suerte le permite alejarse de los perseguidores. En"+
									    "\nun tramo donde el agua se tranquiliza puede continuar por"+
									   	   "\ntierra. No avista luz o sombras entre los árboles pero"+
							"\nigual no es buena idea confiarse","ALIENS",JOptionPane.WARNING_MESSAGE,
									new ImageIcon(Aliens.class.getResource("/img/escape texto.png")));
				contador = contador + 1;
			} else {
				JOptionPane.showMessageDialog(null, "El puente está roto y se ve complicado saltar"+
						  "\n¿Qué hacer? ...El reloj corre... otra pérdida de tiempo.."+
						  	 "\nhay unas piedras unos metros río arriba, se ve difícil"+
					  	  "\npero es la mejor opción ¿Qué será peor, el tiempo perdido"+
					  	 "\no el rostro de ojos grandes y negros que ilumina el haz de"+
					  	 				"\nluz...","ALIENS",JOptionPane.WARNING_MESSAGE,
						  new ImageIcon(Aliens.class.getResource("/img/cara alien texto.png")));
			}
			
		resp6 = (String)(JOptionPane.showInputDialog(null,"Llega a la ruta que parece algo desolada."+
							  "\nPuede ESPERAR a que pase algún vehículo que le preste"+ 
						   "\nauxilio o SEGUIR hasta el otro lado intentando poner más"+
						   "\ndistancia con los aliens","ALIENS",JOptionPane.DEFAULT_OPTION,
		  	   			 	 new ImageIcon(Aliens.class.getResource("/img/ruta4b.png")),
					 			   null,null));
		
			if (resp6.equalsIgnoreCase("esperar")) {
				JOptionPane.showMessageDialog(null, "Mantenerse oculto fue la mejor opción, no hay"+
										"\nruidos...no se ve nada en movimiento entre la maleza..."+
										"\nDe repente una luz terriblemente cegadora le hace temer"+
										"\nlo peor...","ALIENS",JOptionPane.WARNING_MESSAGE,
										new ImageIcon(Aliens.class.getResource("/img/escape texto.png")));
				contador = contador + 1;
			} else {
				JOptionPane.showMessageDialog(null, "Atraviesa la ruta y queda expuesto, un zumbido"+
									  "\naltera el ambiente...ruidos entre los árboles...De repente"+
									  "\nuna luz terriblemente cegadora le hace temer lo peor...","ALIENS",
									  JOptionPane.WARNING_MESSAGE, new ImageIcon(Aliens.class.getResource
											  ("/img/cara alien texto.png")));
			}
			
		if (contador == 0) {
			JOptionPane.showMessageDialog(null, "¡¡ATRAPADO!!\nCon 0 decisiones correctas nos fue difícil"+
								 "\ndefender su honor... algunos dicen que es una verguenza"+
							   	 "\npara la raza humana. A esta altura su cuerpo debe estar"+ 
						   	    "\nsiendo diseccionado cerca de Júpiter o fuera del sistema"+ 
						   	   "\nsolar.","ALIENS",JOptionPane.WARNING_MESSAGE, new ImageIcon
						   	        (Aliens.class.getResource("/img/abduccion1.jfif")));
		}
		if(contador == 1) {
			JOptionPane.showMessageDialog(null, "¡¡ATRAPADO!!\nTomó solamente una buena decisión, no creemos"+ 
									   "\nque haya tenido muchas expectativas con salir ileso."+ 
									 "\nDesde aquí abajo lo saludamos mientras asciende por el"+ 
									   "\nhaz de luz hasta el disco plateado. Esperemos sea un"+ 
					 "\nproyecto secreto de los yankis...","ALIENS",JOptionPane.WARNING_MESSAGE,
						      new ImageIcon(Aliens.class.getResource("/img/abduccion 10.png")));
		}
		if (contador == 2) {
			JOptionPane.showMessageDialog(null, "¡¡ATRAPADO!!\nTomó dos decisiones correctas por lo que luego"+ 
									   "\nde la luz cegadora, su cuerpo se paralizó totalmente y"+ 
								  "\ncomenzó a levitar. Al ver el plato metálico tuvo la suerte"+
				"\nde desmayarse...le deseamos lo mejor...","ALIENS",JOptionPane.WARNING_MESSAGE,
							      new ImageIcon(Aliens.class.getResource("/img/abduccion4b.png")));			
		}
		if (contador == 3) {
			JOptionPane.showMessageDialog(null, "¡¡ATRAPADO!!\nTomó tres decisiones correctas, pero eso no evitó"+
									  				 "\nque una fuerza invisible lo atrajera hacia los arbustos."+
									  			  "\nTampoco evito que los tres pequeños seres grises de grandes"+
									  		   "\nojos negros se queden mirando su rostro de terror...", "ALIENS",
									  		   JOptionPane.WARNING_MESSAGE, new ImageIcon(Aliens.class.getResource
									  				   									("/img/3 grises b.png")));
		}
		if (contador == 4) {
			JOptionPane.showMessageDialog(null, "¡¡ATRAPADO!!\nAl tomar 4 decisiones correctas, se mantuvo un"+ 
									"\nbuen tiempo a salvo...bueno lo mantuvieron a salvo...los"+
								  "\ngrises jugaron con su suerte hasta que decidieron hacer lo"+
								   "\nque mejor hacen...abducir...no se preocupe, la perdida de"+ 
								  	 "\nla memoria que acompaña estos acontecimientos permitirá"+
							  	   "\nque se libre de los malos recuerdos...hasta que aparezcan"+
				 "\nen sus pesadillas o vuelvan por usted.","ALIENS",JOptionPane.WARNING_MESSAGE,
								new ImageIcon(Aliens.class.getResource("/img/abduccion5b.png")));
		}
		if (contador == 5) {
			JOptionPane.showMessageDialog(null, "¡¡ATRAPADO!!\nEstas cinco decisiones correctas le permitieron"+
									 "\nllegar hasta la ruta. La luz cegadora venia de los faros"+
							   		 "\nde un viejo camión que se encontraba parado al borde del"+ 
						   		    "\nasfalto. El amable campesino le ofrece la ayuda que tanto"+
					   		      "\nestaba necesitando. Lo que justamente no estaba necesitando"+
					   		        	  "\nes que la radio se volviera loca justo antes de que"+ 
				   		        	  "\nel camión se apagara y que los tres pequeños humanoides"+
									  "\nse acerquen caminando desde los arbustos", "ALIENS",
									  JOptionPane.WARNING_MESSAGE, new ImageIcon(Aliens.class.getResource
											  ("/img/alien y auto b.png")));
		}
		if (contador == 6) {
			JOptionPane.showMessageDialog(null, "¿¿¡¡ESCAPÓ!!??Sus seis decisiones correctas le permitieron al"+
									"\nfin estar a salvo. Le habían segado los ojos sí, pero con"+
									"\nlos faros de una patrulla policial. Sube desesperadamente"+
								"\ny puede escapar al fin ¡¡¡Felicitaciones!!! Aunque uno de los"+ 
								   "\ndos oficiales mira su rostro y reconoce a quien se fugó de"+ 
							     "\nla cárcel de la región hace dos días. Bueno, mejor capturado"+
								 "\nen la tierra que en alguna luna de Saturno", "ALIENS",
								  JOptionPane.WARNING_MESSAGE, new ImageIcon(Aliens.class.getResource
										  ("/img/arrestadob.png")));
		}
	}		

}
