package cartas_repite;

import javax.swing.JOptionPane;

class Cartas_repite {

	public static void main(String[] args) {
		int c, tot=0;
		
		do {
			c = (int)(Math.random()*12+1);
			System.out.println("Carta " + c);
			tot += c;
		} while (c!=1);
		
		JOptionPane.showMessageDialog(null, "Suma " + tot);
		
	}

}
