package diasarray;

import javax.swing.JOptionPane;

class Diasarray {

	public static void main(String[] args) {
		
		String [] dias = new String[7];
		
		for (int i = 0; i <= 6; i++) {
			dias [i] = JOptionPane.showInputDialog("Ingrese d�a en palabras. "
													 + "De domingo a s�bado");
		}
		
		for (int i = 0; i <= 6; i++) {
			System.out.println("D�a " + i + ": " + dias[i]);
		}
		
		System.out.println("D�a posici�n 4 " + dias[4]);
	}

}
