
import javax.swing.*;

class Ej1_parcial_extra {

	public static void main(String[] args) {
		int n_signo;
		
		n_signo = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el signo a" + 
										   "\nconsultar mediante el >>NÚMERO<< en el listado" +
						   "\n1-ARIES\n2-TAURO\n3-GÉMINIS\n4-CÁNCER\n5-LEO\n6-VIRGO\n7-LIBRA" +
						  "\n8-ESCORPIO\n9-SAGITARIO\n10-CAPRICORNIO\n11-ACUARIO\n12-PISCIS"));
		
		if (n_signo<1 || n_signo>12) {
			JOptionPane.showMessageDialog(null, "Debe ingresar un \nnúmero entre 1 y 12, \nusted" +
																			" ingreso " + n_signo);
		} else {
			if (n_signo==1||n_signo==5||n_signo==9) {
				if (n_signo==1) {
					JOptionPane.showMessageDialog(null, "Su signo es ARIES" +
												  "\nde la categoría FUEGO");
				} else {
					if (n_signo==1||n_signo==5||n_signo==9) {
						if (n_signo==1) {
							JOptionPane.showMessageDialog(null, "Su signo es LEO" +
														"\nde la categoría FUEGO");
						} else {
							JOptionPane.showMessageDialog(null, "Su signo es SAGITARIO" +
									  					      "\nde la categoría FUEGO");
						}
					}
				}
			} else {
				if (n_signo==2||n_signo==6||n_signo==10) {
					if (n_signo==2) {
						JOptionPane.showMessageDialog(null, "Su signo es TAURO" +
													  "\nde la categoría TIERRA");
					} else {
						if (n_signo==1||n_signo==5||n_signo==9) {
							if (n_signo==1) {
								JOptionPane.showMessageDialog(null, "Su signo es VIRGO" +
															  "\nde la categoría TIERRA");
							} else {
								JOptionPane.showMessageDialog(null, "Su signo es CAPRICORNIO" +
										  					       "\nde la categoría TIERRA");
							}
						}
					}
				} else {
					if (n_signo==3||n_signo==7||n_signo==11) {
						if (n_signo==3) {
							JOptionPane.showMessageDialog(null, "Su signo es GEMINIS" +
														     "\nde la categoría AIRE");
						} else {
							if (n_signo==7) {
								if (n_signo==1) {
									JOptionPane.showMessageDialog(null, "Su signo es LIBRA" +
																   "\nde la categoría AIRE");
								} else {
									JOptionPane.showMessageDialog(null, "Su signo es ACUARIO" +
											  					     "\nde la categoría AIRE");
								}
							}
						}
					} else {
						if (n_signo==4) {
							JOptionPane.showMessageDialog(null, "Su signo es CÁNCER" +
														    "\nde la categoría AGUA");
						} else {
							if (n_signo==8) {
								if (n_signo==1) {
									JOptionPane.showMessageDialog(null, "Su signo es ESCORPIO" +
																      "\nde la categoría AGUA");
								} else {
									JOptionPane.showMessageDialog(null, "Su signo es PISCIS" +
											  					    "\nde la categoría AGUA");
								}
							}
						}
					}
				}
			}
		}

	}

}
