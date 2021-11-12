package juegodado;

import javax.swing.JOptionPane;

class Juegodado {

	public static void main(String[] args) {
		int d;
		
		d=(int)(Math.random()*6+1);
		
		switch (d) {
			case 1:
			case 3:
			case 5:JOptionPane.showMessageDialog(null, "Tienen parcialito");
				break;
			case 2:JOptionPane.showMessageDialog(null, "No tienen tarea");
				break;
			case 4:JOptionPane.showMessageDialog(null, "Les permitimos comprar dólares");
				break;
			case 6:JOptionPane.showMessageDialog(null, "Tienen 10 minutos más en el parcial");
				break;
		}

	}

}
