package arcangelo_functions;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JButton;

class Arc_panel1 {

	public static JPanel dib_panel1(JButton button1) {
		JPanel panel1;
		
		panel1 = new JPanel(null);
		
		panel1.setVisible(true);
		panel1.setBorder(BorderFactory.createLineBorder(Color.black));
		panel1.setBounds(10, 10, 310, 200);
		
		panel1.add(button1);
				
		return panel1;
	}

}
