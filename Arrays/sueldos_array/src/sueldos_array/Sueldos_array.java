package sueldos_array;

import javax.swing.JOptionPane;

class Sueldos_array {

	public static void main(String[] args) {
		
		double [] s = new double[10];
		double tot=0;
		
		for (int i = 0; i <= 9; i++) {
			s[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese sueldo"));
			tot = tot + s[i];	
		}
			JOptionPane.showMessageDialog(null, "Total sueldos: " + tot);

			for (int i = 0; i <= 9; i++) {
				
				System.out.println("Sueldo " + (i+1) + ": " + s[i]);
			}
	}

}
