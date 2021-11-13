import javax.swing.JOptionPane;

class Ej5_repeticion_while {

	public static void main(String[] args) {
		String genero, respuesta;
		double altura, peso, porc_apt_fem, porc_apt_masc;
		int cont_fem=0, cont_masc=0, apt_fem=0, apt_masc=0, total_alum;

		do {
			genero = JOptionPane.showInputDialog("Ingrese genero (fem o masc)");
			altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese altura"));
			peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese peso"));
			
			if (genero.equalsIgnoreCase("fem")) {
				cont_fem+=1;
				if (altura>=1.73&&peso>=53&&peso<=83) {
					apt_fem+=1;
				}
			} else {	
				cont_masc+=1;
				if (altura>=1.83&&peso>=73&&peso<=105) {
					apt_masc+=1;
				}
			}
			
			respuesta = JOptionPane.showInputDialog("¿Ingresa otro registro?");
			System.out.println(genero+"		"+altura+"	"+peso+"	"+cont_fem+"	"+
											apt_fem+"		"+cont_masc+"	"+apt_masc);
		} while (respuesta.equalsIgnoreCase("si"));
		
		total_alum = cont_fem + cont_masc;
		porc_apt_fem = (apt_fem*100)/cont_fem;
		porc_apt_masc = (apt_masc*100)/cont_masc;
		
		JOptionPane.showMessageDialog(null, "Total mujeres: " + cont_fem +
									 "\nAlumnas con aptitud: " + apt_fem +
							"\nAlumnas con aptitud (%): " + porc_apt_fem +
										"\nTotal hombres: "  + cont_masc +
									"\nAlumnos con aptitud: " + apt_masc + 
						   "\nAlumnos con aptitud (%): " + porc_apt_masc +
						   			 "\nTotal alumnas/os: " + total_alum);
	}

}
