package aumento;

import javax.swing.JOptionPane;

class Aumento {

	public static void main(String[] args) {
		String categoria;
		double sueldo,c,c1,d,d1;
		
		categoria = JOptionPane.showInputDialog("Indique si su categoria es A o B");
		sueldo = Integer.parseInt(JOptionPane.showInputDialog("Indique su sueldo"));
		
		if (categoria.equalsIgnoreCase("a")) {
			c = sueldo * 0.15;
			c1 = sueldo + c;
			JOptionPane.showMessageDialog(null, "El aumento es de : " + c + "\nEl sueldo finalmente" +
					"se de : " + c1);
		}else {
			d = sueldo * 0.10;
			d1 = sueldo + d;
			JOptionPane.showMessageDialog(null, "El aumento es de : " + d + "\nEl sueldo finalmente" +
					"sera de : " + d1);
		}

	}

}
