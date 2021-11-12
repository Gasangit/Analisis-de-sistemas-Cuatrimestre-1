import java.util.Iterator;

import javax.swing.JOptionPane;

class Sumar_cartas {

	public static void main(String[] args) {
		int tot=0, c;
		
		for (int i = 1; i <= 4; i++) {
			c = (int)(Math.random()*12+1);
			tot = tot + c;
			
			System.out.println("Carta " + c);
			
		}
		
		JOptionPane.showMessageDialog(null, "Suma " + tot);

	}

}
