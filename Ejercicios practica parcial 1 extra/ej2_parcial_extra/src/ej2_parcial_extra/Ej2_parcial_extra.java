package ej2_parcial_extra;

import javax.swing.JOptionPane;

class Ej2_parcial_extra {

	public static void main(String[] args) {
		int cumple;
		
		cumple = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su año de nacimiento"+
										  "\n(solo se aceptaran años \nentre 1934 y 2005)"));
		
		if (cumple<1934 || cumple>2005) {
			JOptionPane.showMessageDialog(null, "Debe ingresar un año\nentre1934 y 2005, usted" +
																		  "\ningresó " + cumple);
		} else {
			if (cumple==1934||cumple==1946||
				cumple==1958||cumple==1970||
				cumple==1982||cumple==1994) {
				JOptionPane.showMessageDialog(null, "Su signo en el\nen el horóscopo chino" +
				"\nes PERRO");
			} else {
				if (cumple==1935||cumple==1947||
					cumple==1959||cumple==1971||
					cumple==1983||cumple==1995) {
					JOptionPane.showMessageDialog(null, "Su signo en el\nen el horóscopo chino" +
					"\nes CHANCHO");
				} else {
					if (cumple==1936||cumple==1948||
						cumple==1960||cumple==1972||
						cumple==1984||cumple==1996) {
							JOptionPane.showMessageDialog(null, "Su signo en el\nen el horóscopo chino" +
							"\nes RATA");
					} else {
						if (cumple==1937||cumple==1949||
							cumple==1961||cumple==1973||
							cumple==1985||cumple==1997) {
							JOptionPane.showMessageDialog(null, "Su signo en el\nen el horóscopo chino" +
							"\nes BUEY");
						} else {
							if (cumple==1938||cumple==1950||
								cumple==1962||cumple==1974||
								cumple==1986||cumple==1998) {
								JOptionPane.showMessageDialog(null, "Su signo en el\nen el horóscopo chino" +
								"\nes TIGRE");
							} else {
								if (cumple==1939||cumple==1951||
									cumple==1963||cumple==1975||
									cumple==1987||cumple==1999) {
									JOptionPane.showMessageDialog(null, "Su signo en el\nen el horóscopo chino" +
									"\nes CONEJO");
								} else {
									if (cumple==1940||cumple==1952||
										cumple==1964||cumple==1976||
										cumple==1988||cumple==2000) {
											JOptionPane.showMessageDialog(null, "Su signo en el\nen el horóscopo chino" +
											"\nes DRAGÓN");
									} else {
										if (cumple==1941||cumple==1953||
											cumple==1965||cumple==1977||
											cumple==1989||cumple==2001) {
											JOptionPane.showMessageDialog(null, "Su signo en el\nen el horóscopo chino" +
											"\nes SERPIENTE");
										} else {
											if (cumple==1942||cumple==1954||
												cumple==1966||cumple==1978||
												cumple==1990||cumple==2002) {
													JOptionPane.showMessageDialog(null, "Su signo en el\nen el horóscopo chino" +
													"\nes CABALLO");
											} else {
												if (cumple==1943||cumple==1955||
													cumple==1967||cumple==1979||
													cumple==1991||cumple==2003) {
														JOptionPane.showMessageDialog(null, "Su signo en el\nen el horóscopo chino" +
														"\nes OVEJA");
												} else {
													if (cumple==1944||cumple==1956||
															cumple==1968||cumple==1980||
														cumple==1992||cumple==2004) {
														JOptionPane.showMessageDialog(null, "Su signo en el\nen el horóscopo chino" +
														"\nes MONO");
													} else {
														JOptionPane.showMessageDialog(null, "Su signo en el\nen el horóscopo chino" +
														"\nes GALLO");
													}
												}
											}
										}					
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
