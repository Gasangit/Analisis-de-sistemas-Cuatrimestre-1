package ejextra3;

import javax.swing.JOptionPane;

class Ejextra3 {

	public static void main(String[] args) {
		final double PI;
		double radio, per, area;
		
		PI = 3.1416;
		radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio"));
		per = 2 * PI * radio;
		area = PI * (radio*radio);
		JOptionPane.showMessageDialog(null, "El perimetro de la circunferencia es : \n" + per + "\nEl area es : \n" + area);

	}

}
