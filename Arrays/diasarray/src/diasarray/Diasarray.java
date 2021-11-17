package diasarray;

import javax.swing.JOptionPane;

class Diasarray {

	public static void main(String[] args) {
		
		String [] dias = new String[7];
		
		for (int i = 0; i <= 6; i++) {
			dias [i] = JOptionPane.showInputDialog("Ingrese día en palabras. "
													 + "De domingo a sábado");
		}
		
		for (int i = 0; i <= 6; i++) {
			System.out.println("Día " + i + ": " + dias[i]);
		}
		
		System.out.println("Día posición 4 " + dias[4]);
	}

}
