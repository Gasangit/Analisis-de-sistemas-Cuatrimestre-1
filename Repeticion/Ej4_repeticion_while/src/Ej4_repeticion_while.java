import javax.swing.JOptionPane;

class Ej4_repeticion_while {

	public static void main(String[] args) {
		String sexo;
		double promedio, fem_max=0, masc_max=0, fem_porc, masc_porc;
		int matricula, cont_fem=0, cont_masc=0;
		
		matricula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese matrícula (si desea finalizar ingrese 0)"));
		
		while (matricula!=0) {
			sexo = JOptionPane.showInputDialog("Ingrese sexo (fem para mujeres y masc para hombres)");
			promedio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese promedio"));
			
			
			System.out.println(sexo + "		" + promedio + "		" + matricula);
			
			if (sexo.equalsIgnoreCase("fem")) {
				cont_fem += 1;
				if (cont_fem==1) {
					fem_max = promedio;
				} else if (promedio>fem_max) {
						fem_max = promedio;
					}
			} else {
				cont_masc += 1;
				if (cont_masc==1) {
					masc_max = promedio;
				} else if (promedio>masc_max) {
						masc_max = promedio;
					}
			}
			
			matricula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese matrícula (si desea finalizar ingrese 0)"));
		} 
		
		fem_porc = cont_fem * 100 / (cont_fem + cont_masc);
		masc_porc = cont_masc * 100 / (cont_fem + cont_masc);
		
		System.out.println(cont_fem +"	"+ cont_masc);
		
		JOptionPane.showMessageDialog(null, "Porcentaje de mujeres: " + fem_porc + 
										  "\nPorcentaje de hombres: " + masc_porc +
										  "\nMejor promedio mujeres: " + fem_max +
										  "\nMejor promedio hombres: " + masc_max);

	}

}
