package ej3_parcial_extra;

import javax.swing.JOptionPane;

class Ej3_parcial_extra {

	public static void main(String[] args) {
		Double nivel;
		int edad, unidad, sexo;
		
		nivel = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese su nivel"
															 + "\nde hemoglobina en sangre"));
		
		edad = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese la edad del "
									   	  + "paciente,\nluego aclarar? si son meses o a?os"));
		
		unidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si la edad es en \nMESES"
																			+"o 2 si es en A?OS"));
		sexo = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese su g?nero indicando"
														   +"\n1 para MUJER o 2 para HOMBRE"));
		
		if (edad < 0) {
			JOptionPane.showMessageDialog(null, "La edad ingresada no"
											   +"\npuede ser menor a 0, \nusted" 
											   +"ingreso " + edad);
		} else {
			if (edad > 12 && unidad == 1) {
				JOptionPane.showMessageDialog(null, "Al ingresar la edad en\n"
												  + "MESES, estos no pueden superar\n"
											  	  + "la cantidad de 12, usted ingres?\n"
										  	  	  + edad + "meses.");
			} else {
				if (edad<=1 && unidad==1) {
					if (nivel>13 && nivel<26) {
						JOptionPane.showMessageDialog(null, "El nivel " + nivel 
												+" de hemoglobina del \npaciente "
												+"es NORMAL");
					} else {
						if (nivel < 13) {
							JOptionPane.showMessageDialog(null, "El nivel " + nivel 
									+" de \nhemoglobina del paciente"
									+"da como resulado, POSITIVO, \nTIENE ANEMIA");
						} else {
							JOptionPane.showMessageDialog(null, "El nivel " + nivel  
													+"\n de hemoglobina del paciente"
													+"\nes MAYOR AL NORMAL, VOLVER"
													+"\nA REPETIR");
						}
					}				
				}
				else {
					if (edad>1 && edad<=6 && unidad==1) {
						if (nivel>10 && nivel<18) {
							JOptionPane.showMessageDialog(null, "El nivel " + nivel 
													+" de hemoglobina del \npaciente "
													+"es NORMAL");
						} else {
							if (nivel < 10) {
								JOptionPane.showMessageDialog(null, "El nivel " + nivel 
										+" de \nhemoglobina del paciente"
										+"da como resulado, POSITIVO, \nTIENE ANEMIA");
							} else {
								JOptionPane.showMessageDialog(null, "El nivel " + nivel  
														+"\nde hemoglobina del paciente"
														+"\nes MAYOR AL NORMAL, VOLVER"
														+"\nA REPETIR");
							}
						}				
					}
					else {
						if (edad>6 && edad<=12 && unidad==1) {
							if (nivel>11 && nivel<15) {
								JOptionPane.showMessageDialog(null, "El nivel " + nivel 
														+" de hemoglobina del \npaciente"
														+"es NORMAL");
							} else {
								if (nivel < 11) {
									JOptionPane.showMessageDialog(null, "El nivel " + nivel 
											+" de \nhemoglobina del paciente"
											+"da como resulado, POSITIVO, \nTIENE ANEMIA");
								} else {
									JOptionPane.showMessageDialog(null, "El nivel " + nivel  
															+"\nde hemoglobina del paciente"
															+"\nes MAYOR AL NORMAL, VOLVER"
															+"\nA REPETIR");
								}
							}				
						}
						else {
							if (edad>=1 && edad<=5 && unidad==2) {
								if (nivel>11.5 && nivel<15) {
									JOptionPane.showMessageDialog(null, "El nivel " + nivel 
															+" de hemoglobina del \npaciente"
															+"es NORMAL");
								} else {
									if (nivel < 11.5) {
										JOptionPane.showMessageDialog(null, "El nivel " + nivel 
												+" de \nhemoglobina del paciente"
												+"da como resulado, POSITIVO, \nTIENE ANEMIA");
									} else {
										JOptionPane.showMessageDialog(null, "El nivel " + nivel  
																+"\nde hemoglobina del paciente"
																+"\nes MAYOR AL NORMAL, VOLVER"
																+"\nA REPETIR");
									}
								}				
							}
							else {
								if (edad>5 && edad<=10 && unidad==2) {
									if (nivel>12.6 && nivel<15.5) {
										JOptionPane.showMessageDialog(null, "El nivel " + nivel 
																+" de hemoglobina del \npaciente"
																+"es NORMAL");
									} else {
										if (nivel < 12.6) {
											JOptionPane.showMessageDialog(null, "El nivel " + nivel 
													+" de \nhemoglobina del paciente"
													+"da como resulado, POSITIVO, \nTIENE ANEMIA");
										} else {
											JOptionPane.showMessageDialog(null, "El nivel " + nivel  
																	+"\nde hemoglobina del paciente"
																	+"\nes MAYOR AL NORMAL, VOLVER"
																	+"\nA REPETIR");
										}
									}				
								}
								else {
									if (edad>10 && edad<=15 && unidad==2) {
										if (nivel>13.0 && nivel<15.5) {
											JOptionPane.showMessageDialog(null, "El nivel " + nivel 
																	+" de hemoglobina del \npaciente"
																	+"es NORMAL");
										} else {
											if (nivel < 13.0) {
												JOptionPane.showMessageDialog(null, "El nivel " + nivel 
														+" de \nhemoglobina del paciente"
														+"da como resulado, POSITIVO, \nTIENE ANEMIA");
											} else {
												JOptionPane.showMessageDialog(null, "El nivel " + nivel  
																		+"\nde hemoglobina del paciente"
																		+"\nes MAYOR AL NORMAL, VOLVER"
																		+"\nA REPETIR");
											}
										}				
									}
									else {
										if (edad>15 && sexo==1 && unidad==2) {
											if (nivel>=12 && nivel<=16) {
												JOptionPane.showMessageDialog(null, "El nivel " + nivel 
																		+" de hemoglobina del \npaciente"
																		+"es NORMAL");
											} else {
												if (nivel < 12) {
													JOptionPane.showMessageDialog(null, "El nivel " + nivel 
															+" de \nhemoglobina del paciente"
															+"da como resulado, POSITIVO, \nTIENE ANEMIA");
												} else {
													JOptionPane.showMessageDialog(null, "El nivel " + nivel  
																			+"\nde hemoglobina del paciente"
																			+"\nes MAYOR AL NORMAL, VOLVER"
																			+"\nA REPETIR");
												}
											}				
										}
										else {
											if (edad>15 && sexo<=2 && unidad==2 && nivel>=14 && nivel<=18) {
												JOptionPane.showMessageDialog(null, "El nivel " + nivel 
																	  +" de hemoglobina del \npaciente"
																	  +"es NORMAL");
											}
											else {
												if (nivel<14 && edad>15 && sexo==2) {
													JOptionPane.showMessageDialog(null, "El nivel " + nivel 
															+" de \nhemoglobina del paciente"
															+"da como resulado, POSITIVO, \nTIENE ANEMIA");
												} else {
													JOptionPane.showMessageDialog(null, "El nivel " + nivel  
															+"\nde hemoglobina del paciente"
															+"\nes MAYOR AL NORMAL, VOLVER"
															+"\nA REPETIR");
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
