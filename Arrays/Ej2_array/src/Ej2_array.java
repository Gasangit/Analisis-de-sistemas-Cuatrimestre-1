import javax.swing.JOptionPane;

class Ej2_array {

	public static void main(String[] args) {
		int [] curso_a = new int[5];
		int [] curso_b = new int[5];
		int suma_a=0, suma_b=0;
		double prom_a=0, prom_b=0;
		
		for (int i = 0; i < curso_b.length; i++) {
			curso_a[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las notas de los 5 alumnos del Curso A"));
		}
		for (int i = 0; i < curso_b.length; i++) {
			curso_b[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las notas de los 5 alumnos del Curso B"));
		}
		
		for (int i = 0; i < curso_a.length; i++) {
			System.out.println("Nota: " + 1 + " Curso a: " + curso_a[i] + " Curso b: " + curso_b[i]);
			suma_a = suma_a + curso_a[i];
			suma_b = suma_b + curso_b[i];
		}
				
		prom_a = suma_a / 5;
		prom_b = suma_b / 5;
		
		if (prom_a>prom_b) {
			JOptionPane.showMessageDialog(null, "El curso A tiene mejor promedio: " + prom_a);
		} else {
			JOptionPane.showMessageDialog(null, "El curso B tiene mejor promedio: " + prom_b);
		}
	}

}
