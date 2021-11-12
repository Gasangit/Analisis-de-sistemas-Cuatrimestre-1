package arcangelo;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

class Arcangelo {

	public static void main(String[] args) {
		
		JFrame ventana;
		JPanel panel1,panel2;
		
		ventana = new JFrame("Arcangelo Libros");
			Dimension minimo = new Dimension(350,600);
				ventana.setMinimumSize(minimo);
				ventana.setBounds(350,100,350,600);
				ventana.setVisible(true);
				ventana.setLayout(null);
				
		panel1 = new JPanel(null);
			
			panel1.setVisible(true);
			panel1.setBorder(BorderFactory.createLineBorder(Color.black));
			panel1.setBounds(10, 10, 310, 200);
			
			ventana.add(panel1);
			
		panel2 = new JPanel(null);
		
			panel2.setVisible(true);
			panel2.setBorder(BorderFactory.createLineBorder(Color.black));
			panel2.setBounds(10, 220, 310, 330);
			
			ventana.add(panel2);
		

	}

}