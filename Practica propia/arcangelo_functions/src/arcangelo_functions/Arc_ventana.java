package arcangelo_functions;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

class Arc_ventana {

	public static JFrame dib_ventana(JPanel panel1, JPanel panel2) {
		
		JFrame ventana;
		
		ventana = new JFrame("Arcangelo Libros");
		Dimension minimo = new Dimension(350,600);
			ventana.setMinimumSize(minimo);
			ventana.setBounds(350,100,350,600);
			ventana.setVisible(true);
			ventana.setLayout(null);
			
			ventana.add(panel1);
			ventana.add(panel2);
			
			return ventana;
		
	}

}
