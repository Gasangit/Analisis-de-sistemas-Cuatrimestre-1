package ej1_largo;

import javax.swing.*;

class Ej1_largo {

	public static void main(String[] args) {
		int mes,dia;
		
		dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el DÍA de su cumpleaños (en números)"));
		mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el MES de su cumpleaños (en números)"));
		
		if (dia>=1 && dia<=29 && mes==2) {
			if (dia<=18) {
				JOptionPane.showMessageDialog(null, "Usted es de ACUARIO","ZODIACO",JOptionPane.WARNING_MESSAGE,
						new ImageIcon(Ej1_largo.class.getResource("/img/ACUARIO.png")));
			} else {
				JOptionPane.showMessageDialog(null, "Usted es de PISCIS","ZODIACO",JOptionPane.WARNING_MESSAGE,
						new ImageIcon(Ej1_largo.class.getResource("/img/PISCIS.png")));
			}
		} else {
			if (dia>=1 && dia<=31 && (mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12)) {
				if (mes==1 && dia>=1 && dia<=20) {
					JOptionPane.showMessageDialog(null, "Usted es de CAPRICORNIO","ZODIACO",JOptionPane.WARNING_MESSAGE,
							new ImageIcon(Ej1_largo.class.getResource("/img/CAPRICORNIO.png")));
				} else {
					if (mes==1 && dia>=21) {
						JOptionPane.showMessageDialog(null, "Usted es de ACUARIO","ZODIACO",JOptionPane.WARNING_MESSAGE,
								new ImageIcon(Ej1_largo.class.getResource("/img/ACUARIO.png")));
					} else {
						if (mes==3 && dia<=20) {
							JOptionPane.showMessageDialog(null, "Usted es de PISCIS","ZODIACO",JOptionPane.WARNING_MESSAGE,
									new ImageIcon(Ej1_largo.class.getResource("/img/PISCIS.png")));
						} else {
							if (mes==3 && dia>=21) {
								JOptionPane.showMessageDialog(null, "Usted es de ARIES","ZODIACO",JOptionPane.WARNING_MESSAGE,
										new ImageIcon(Ej1_largo.class.getResource("/img/ARIES.png")));
							} else {
								if (mes==5 && dia<=21) {
									JOptionPane.showMessageDialog(null, "Usted es de TAURO","ZODIACO",JOptionPane.WARNING_MESSAGE,
											new ImageIcon(Ej1_largo.class.getResource("/img/TAURO.png")));
								} else {
									if (mes==5 && dia>=22) {
										JOptionPane.showMessageDialog(null, "Usted es de GEMINIS","ZODIACO",JOptionPane.WARNING_MESSAGE,
												new ImageIcon(Ej1_largo.class.getResource("/img/GEMINIS.png")));
									} else {
										if (mes==7 && dia<=22) {
											JOptionPane.showMessageDialog(null, "Usted es de CANCER","ZODIACO",JOptionPane.WARNING_MESSAGE,
													new ImageIcon(Ej1_largo.class.getResource("/img/CANCER.png")));
										} else {
											if ((mes==7 && dia>=23)||(mes==8 && dia<=23)) {
												JOptionPane.showMessageDialog(null, "Usted es de LEO","ZODIACO",JOptionPane.WARNING_MESSAGE,
														new ImageIcon(Ej1_largo.class.getResource("/img/LEO.png")));
											} else {
												if (mes==8 && dia>=24) {
													JOptionPane.showMessageDialog(null, "Usted es de VIRGO","ZODIACO",JOptionPane.WARNING_MESSAGE,
															new ImageIcon(Ej1_largo.class.getResource("/img/VIRGO.png")));
												} else {
													if (mes==10 && dia<=23) {
														JOptionPane.showMessageDialog(null, "Usted es de LIBRA","ZODIACO",JOptionPane.WARNING_MESSAGE,
																new ImageIcon(Ej1_largo.class.getResource("/img/LIBRA.png")));
													} else {
														if (mes==10 && dia>=24) {
															JOptionPane.showMessageDialog(null, "Usted es de ESCORPIO","ZODIACO",JOptionPane.WARNING_MESSAGE,
																	new ImageIcon(Ej1_largo.class.getResource("/img/ESCORPIO.png")));
														} else {
															if (mes==12 && dia<=21) {
																JOptionPane.showMessageDialog(null, "Usted es de SAGITARIO","ZODIACO",JOptionPane.WARNING_MESSAGE,
																		new ImageIcon(Ej1_largo.class.getResource("/img/SAGITARIO.png")));
															} else {
																JOptionPane.showMessageDialog(null, "Usted es de CAPRICORNIO","ZODIACO",JOptionPane.WARNING_MESSAGE,
																		new ImageIcon(Ej1_largo.class.getResource("/img/CAPRICORNIO.png")));
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
			} else {
				if (dia>=1 && dia <=30 && (mes==4||mes==6||mes==9||mes==11)) {
					if (mes==4 && dia<=20) {
						JOptionPane.showMessageDialog(null, "Usted es de ARIES","ZODIACO",JOptionPane.WARNING_MESSAGE,
								new ImageIcon(Ej1_largo.class.getResource("/img/ARIES.png")));
					} else {
						if (mes==4 && dia>=21) {
							JOptionPane.showMessageDialog(null, "Usted es de TAURO","ZODIACO",JOptionPane.WARNING_MESSAGE,
									new ImageIcon(Ej1_largo.class.getResource("/img/TAURO.png")));
						} else {
							if (mes==6 && dia<=21) {
								JOptionPane.showMessageDialog(null, "Usted es de GEMINIS","ZODIACO",JOptionPane.WARNING_MESSAGE,
										new ImageIcon(Ej1_largo.class.getResource("/img/GEMINIS.png")));
							} else {
								if (mes==6 && dia>=22) {
									JOptionPane.showMessageDialog(null, "Usted es de CANCER","ZODIACO",JOptionPane.WARNING_MESSAGE,
											new ImageIcon(Ej1_largo.class.getResource("/img/CANCER.png")));
								} else {
									if (mes==9 && dia<=23) {
										JOptionPane.showMessageDialog(null, "Usted es de VIRGO","ZODIACO",JOptionPane.WARNING_MESSAGE,
												new ImageIcon(Ej1_largo.class.getResource("/img/VIRGO.png")));
									} else {
										if (mes==9 && dia>=24) {
											JOptionPane.showMessageDialog(null, "Usted es de LIBRA","ZODIACO",JOptionPane.WARNING_MESSAGE,
													new ImageIcon(Ej1_largo.class.getResource("/img/LIBRA.png")));
										} else {
											if (mes==11 && dia<=22) {
												JOptionPane.showMessageDialog(null, "Usted es de ESCORPIO","ZODIACO",JOptionPane.WARNING_MESSAGE,
														new ImageIcon(Ej1_largo.class.getResource("/img/ESCORPIO.png")));
											} else {
												JOptionPane.showMessageDialog(null, "Usted es de SAGITARIO","ZODIACO",JOptionPane.WARNING_MESSAGE,
														new ImageIcon(Ej1_largo.class.getResource("/img/SAGITARIO.png")));
											}
										}
									}
								}
							}
						}
					}
				} else {
					JOptionPane.showMessageDialog(null, "Los datos ingresados no corresponden a una fecha existente");
				}
			}
		}

	}

}
