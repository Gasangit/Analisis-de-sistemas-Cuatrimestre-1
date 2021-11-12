package aliens;

import javax.swing.*;

class Aliens {

	public static void main(String[] args) {
		final String PRESENTACION1 = "Se encuentra en un bosque de noche, ve una luz intensa...";
		final String PRESENTACION2 = "Demasiada claridad... ���� Es un OVNI !!!!";
		final String PRESENTACION3 = "Tiene que calmarse, pensar y escapar...";
		final String PRESENTACION4 = "Consiga  tomar 6  decisiones correctas  para poder  estar a"+
								   "\nsalvo. Ingrese  como  dato  las  palabras  que  aparecen  en"+
							       "\nMAY�SCULA dentro del texto (puede escribirlas en min�scula."+ 
							       "\nEn  caso de  no ingresar  respuesta o  ingresar un  dato no"+ 
							       "\nv�lido se contar� como una mala decisi�n).";

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
								              "termina en unos arbustos �Qu� sendero tomar�?","ALIENS",
			 JOptionPane.DEFAULT_OPTION, new ImageIcon(Aliens.class.getResource("/img/sendero.jfif")),
										  												  null,null));
		
			if (resp1.equalsIgnoreCase("izquierda")) {
				JOptionPane.showMessageDialog(null, "Tiene la suerte de encontrar una piedra en medio"+
												   "\ndel barro que le permite moverse con velocidad."+
									 "\nLa nave desciende cerca.","ALIENS",JOptionPane.WARNING_MESSAGE,
									 new ImageIcon(Aliens.class.getResource("/img/escape texto.png")));
				contador = contador + 1;
			} else {
				JOptionPane.showMessageDialog(null, "Se introdujo demasiado r�pido detr�s de los"+ 
									"\narbustos torci�ndose el tobillo. No es grave, pero pierde"+
				 "\nunos segundos. La nave desciende cerca.","ALIENS",JOptionPane.WARNING_MESSAGE,
		      				new ImageIcon(Aliens.class.getResource("/img/cara alien texto.png")));
			}
		
		resp2=(String)(JOptionPane.showInputDialog(null,"Unos metros m�s adelante ve un �rbol."+ 
							  		"\nDecida si SUBIR y esconderse o SEGUIR adelante","ALIENS",
		JOptionPane.DEFAULT_OPTION, new ImageIcon(Aliens.class.getResource("/img/bosqueb.png")),
							  														null,null));
		
			if (resp2.equalsIgnoreCase("subir")) {
				JOptionPane.showMessageDialog(null, "No parec�a la mejor opci�n �No? Desde la copa"+
										   "\ndel �rbol puede ver el mejor camino hacia una caba�a"+
										 "\ncercana. De no haberse subido habr�a sumado 100 metros"+ 
										  "\na la huida. La cobard�a a veces ayuda. Se dirige a la"+
										"\ncaba�a que parece m�s segura. Se ven sombras humanoides"+
									   "\nentre el follaje...","ALIENS",JOptionPane.WARNING_MESSAGE,
								  new ImageIcon(Aliens.class.getResource("/img/escape texto.png")));
				contador = contador + 1;
			} else {
				JOptionPane.showMessageDialog(null, "El p�nico del escape le hace tomar el camino"+
										   "\nm�s largo hacia la caba�a que ve adelante. De haber"+
								   	   "\nsubido al �rbol podr�a haber tomado un atajo que se ve"+
								   	  "\ndesde arriba. Se ven sombras humanoides entre el follaje"+
											           "\n...","ALIENS",JOptionPane.WARNING_MESSAGE,
							 new ImageIcon(Aliens.class.getResource("/img/cara alien texto.png")));
			}
		
		resp3=(String)(JOptionPane.showInputDialog(null,"Ingresa a la caba�a que es algo rustica y"+
						 				   "\nno parece ofrecer un buen refugio. Hay una linterna,"+ 
					 				    "\ndecida si TOMAR o DEJAR la misma. La caba�a experimenta"+
			 				   "\nun ligero temblor, que extra�o...mejor seguir adelante.","ALIENS",
			JOptionPane.DEFAULT_OPTION, new ImageIcon(Aliens.class.getResource("/img/cabana3b.png")),
																						null,null));
			
			if (resp3.equalsIgnoreCase("dejar")) {
				JOptionPane.showMessageDialog(null, "Escaparse en la oscuridad sin llamar la atenci�n"+
											   "\ncon la linterna fue lo mejor que se pudo hacer, las"+
										   "\nsombras humanoides ahora se ven algo m�s peque�as, pero"+
						  "\ntodav�a no est� fuera de peligro...","ALIENS",JOptionPane.WARNING_MESSAGE,
						   			 new ImageIcon(Aliens.class.getResource("/img/escape texto.png")));
				contador = contador + 1;
				
			} else {
				JOptionPane.showMessageDialog(null, "La luz de la linterna llama la atenci�n de las"+
										   "\nsombras humanoides...���Ahora se ven m�s cerca!!! Fue"+
									   	 "\nmala idea lo de la linterna. Ahora a intentar alejarnos"+
									  "\nlo m�s r�pido posible.","ALIENS",JOptionPane.WARNING_MESSAGE,
							   new ImageIcon(Aliens.class.getResource("/img/cara alien texto.png")));
			}
		
		resp4=(String)(JOptionPane.showInputDialog(null,"Llega a un alambrado. Es dif�cil decidir"+
												  "\nsi BORDEAR el mismo hasta encontrar un tramo"+ 
										  "\nroto por donde pasar o TREPAR �?�?�?�?�?...","ALIENS",
		  JOptionPane.DEFAULT_OPTION, new ImageIcon(Aliens.class.getResource("/img/alambrado2b.png")),
		  																			   null,null));
		
			if (resp4.equalsIgnoreCase("bordear")) {
				JOptionPane.showMessageDialog(null, "Moverse junto al alambrado le permite mantenerse"+
										   "\noculto en las sombras. Por suerte a los pocos metros el"+ 
									   	 "\nalambrado est� roto. Una luz sondea por sobre los �rboles"+
									   	 	 "\npero ahora puede estar m�s tranquilo con el alambrado"+
											     "\nde por medio","ALIENS",JOptionPane.WARNING_MESSAGE,
									 new ImageIcon(Aliens.class.getResource("/img/escape texto.png")));
				contador = contador + 1;
			} else {
				JOptionPane.showMessageDialog(null, "Ha subido al alambrado desde donde puede ser"+ 
									   "\nvisto... y parece que lo vieron... Lo confirma el ruido"+
							   	  "\nde ramas cercano y el haz de luz que apunta en su direcci�n."+
							   	  				"\nNo fue buena idea dejarse ver en lo alto de la"+ 
							   	  				   "\nvalla.","ALIENS",JOptionPane.WARNING_MESSAGE,
							 new ImageIcon(Aliens.class.getResource("/img/cara alien texto.png")));
			}
		
		resp5=(String)(JOptionPane.showInputDialog(null,"El sonido del agua hace que recuerde el r�o cercano."+
					 										  "\n Hay un puente a unos 50 metros... �Qu� ser�"+
		 										  	"\nmejor? �CRUZAR el puente o NADAR hasta la otra orilla?"+
		 										  	   "\nEsperemos que los extraterrestres sean al�rgicos al"+
		 										  	   			 "\nagua.","ALIENS",JOptionPane.DEFAULT_OPTION,
								  	   			 	 new ImageIcon(Aliens.class.getResource("/img/rio2b.png")),
											       									 			   null,null));
		
			if (resp5.equalsIgnoreCase("nadar")) {
				
				JOptionPane.showMessageDialog(null, "Al meterse al r�o, lo arrastra la corriente que"+
										  "\npor suerte le permite alejarse de los perseguidores. En"+
									    "\nun tramo donde el agua se tranquiliza puede continuar por"+
									   	   "\ntierra. No avista luz o sombras entre los �rboles pero"+
							"\nigual no es buena idea confiarse","ALIENS",JOptionPane.WARNING_MESSAGE,
									new ImageIcon(Aliens.class.getResource("/img/escape texto.png")));
				contador = contador + 1;
			} else {
				JOptionPane.showMessageDialog(null, "El puente est� roto y se ve complicado saltar"+
						  "\n�Qu� hacer? ...El reloj corre... otra p�rdida de tiempo.."+
						  	 "\nhay unas piedras unos metros r�o arriba, se ve dif�cil"+
					  	  "\npero es la mejor opci�n �Qu� ser� peor, el tiempo perdido"+
					  	 "\no el rostro de ojos grandes y negros que ilumina el haz de"+
					  	 				"\nluz...","ALIENS",JOptionPane.WARNING_MESSAGE,
						  new ImageIcon(Aliens.class.getResource("/img/cara alien texto.png")));
			}
			
		resp6 = (String)(JOptionPane.showInputDialog(null,"Llega a la ruta que parece algo desolada."+
							  "\nPuede ESPERAR a que pase alg�n veh�culo que le preste"+ 
						   "\nauxilio o SEGUIR hasta el otro lado intentando poner m�s"+
						   "\ndistancia con los aliens","ALIENS",JOptionPane.DEFAULT_OPTION,
		  	   			 	 new ImageIcon(Aliens.class.getResource("/img/ruta4b.png")),
					 			   null,null));
		
			if (resp6.equalsIgnoreCase("esperar")) {
				JOptionPane.showMessageDialog(null, "Mantenerse oculto fue la mejor opci�n, no hay"+
										"\nruidos...no se ve nada en movimiento entre la maleza..."+
										"\nDe repente una luz terriblemente cegadora le hace temer"+
										"\nlo peor...","ALIENS",JOptionPane.WARNING_MESSAGE,
										new ImageIcon(Aliens.class.getResource("/img/escape texto.png")));
				contador = contador + 1;
			} else {
				JOptionPane.showMessageDialog(null, "Atraviesa la ruta y queda expuesto, un zumbido"+
									  "\naltera el ambiente...ruidos entre los �rboles...De repente"+
									  "\nuna luz terriblemente cegadora le hace temer lo peor...","ALIENS",
									  JOptionPane.WARNING_MESSAGE, new ImageIcon(Aliens.class.getResource
											  ("/img/cara alien texto.png")));
			}
			
		if (contador == 0) {
			JOptionPane.showMessageDialog(null, "��ATRAPADO!!\nCon 0 decisiones correctas nos fue dif�cil"+
								 "\ndefender su honor... algunos dicen que es una verguenza"+
							   	 "\npara la raza humana. A esta altura su cuerpo debe estar"+ 
						   	    "\nsiendo diseccionado cerca de J�piter o fuera del sistema"+ 
						   	   "\nsolar.","ALIENS",JOptionPane.WARNING_MESSAGE, new ImageIcon
						   	        (Aliens.class.getResource("/img/abduccion1.jfif")));
		}
		if(contador == 1) {
			JOptionPane.showMessageDialog(null, "��ATRAPADO!!\nTom� solamente una buena decisi�n, no creemos"+ 
									   "\nque haya tenido muchas expectativas con salir ileso."+ 
									 "\nDesde aqu� abajo lo saludamos mientras asciende por el"+ 
									   "\nhaz de luz hasta el disco plateado. Esperemos sea un"+ 
					 "\nproyecto secreto de los yankis...","ALIENS",JOptionPane.WARNING_MESSAGE,
						      new ImageIcon(Aliens.class.getResource("/img/abduccion 10.png")));
		}
		if (contador == 2) {
			JOptionPane.showMessageDialog(null, "��ATRAPADO!!\nTom� dos decisiones correctas por lo que luego"+ 
									   "\nde la luz cegadora, su cuerpo se paraliz� totalmente y"+ 
								  "\ncomenz� a levitar. Al ver el plato met�lico tuvo la suerte"+
				"\nde desmayarse...le deseamos lo mejor...","ALIENS",JOptionPane.WARNING_MESSAGE,
							      new ImageIcon(Aliens.class.getResource("/img/abduccion4b.png")));			
		}
		if (contador == 3) {
			JOptionPane.showMessageDialog(null, "��ATRAPADO!!\nTom� tres decisiones correctas, pero eso no evit�"+
									  				 "\nque una fuerza invisible lo atrajera hacia los arbustos."+
									  			  "\nTampoco evito que los tres peque�os seres grises de grandes"+
									  		   "\nojos negros se queden mirando su rostro de terror...", "ALIENS",
									  		   JOptionPane.WARNING_MESSAGE, new ImageIcon(Aliens.class.getResource
									  				   									("/img/3 grises b.png")));
		}
		if (contador == 4) {
			JOptionPane.showMessageDialog(null, "��ATRAPADO!!\nAl tomar 4 decisiones correctas, se mantuvo un"+ 
									"\nbuen tiempo a salvo...bueno lo mantuvieron a salvo...los"+
								  "\ngrises jugaron con su suerte hasta que decidieron hacer lo"+
								   "\nque mejor hacen...abducir...no se preocupe, la perdida de"+ 
								  	 "\nla memoria que acompa�a estos acontecimientos permitir�"+
							  	   "\nque se libre de los malos recuerdos...hasta que aparezcan"+
				 "\nen sus pesadillas o vuelvan por usted.","ALIENS",JOptionPane.WARNING_MESSAGE,
								new ImageIcon(Aliens.class.getResource("/img/abduccion5b.png")));
		}
		if (contador == 5) {
			JOptionPane.showMessageDialog(null, "��ATRAPADO!!\nEstas cinco decisiones correctas le permitieron"+
									 "\nllegar hasta la ruta. La luz cegadora venia de los faros"+
							   		 "\nde un viejo cami�n que se encontraba parado al borde del"+ 
						   		    "\nasfalto. El amable campesino le ofrece la ayuda que tanto"+
					   		      "\nestaba necesitando. Lo que justamente no estaba necesitando"+
					   		        	  "\nes que la radio se volviera loca justo antes de que"+ 
				   		        	  "\nel cami�n se apagara y que los tres peque�os humanoides"+
									  "\nse acerquen caminando desde los arbustos", "ALIENS",
									  JOptionPane.WARNING_MESSAGE, new ImageIcon(Aliens.class.getResource
											  ("/img/alien y auto b.png")));
		}
		if (contador == 6) {
			JOptionPane.showMessageDialog(null, "����ESCAP�!!??Sus seis decisiones correctas le permitieron al"+
									"\nfin estar a salvo. Le hab�an segado los ojos s�, pero con"+
									"\nlos faros de una patrulla policial. Sube desesperadamente"+
								"\ny puede escapar al fin ���Felicitaciones!!! Aunque uno de los"+ 
								   "\ndos oficiales mira su rostro y reconoce a quien se fug� de"+ 
							     "\nla c�rcel de la regi�n hace dos d�as. Bueno, mejor capturado"+
								 "\nen la tierra que en alguna luna de Saturno", "ALIENS",
								  JOptionPane.WARNING_MESSAGE, new ImageIcon(Aliens.class.getResource
										  ("/img/arrestadob.png")));
		}
	}		

}
