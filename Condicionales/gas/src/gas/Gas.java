package gas;

import javax.swing.JOptionPane;

class Gas {

	public static void main(String[] args) {
		double m3, tnormal, texcedente;
		
		m3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los m3 consumidos: "));
		
		if (m3<=150) {
			tnormal = m3*15.8;
			JOptionPane.showMessageDialog(null, "Paga SIN aumento : " + tnormal);
		} else {
			texcedente = (m3 *15.8) + (m3 - 150) * 1.5;
			JOptionPane.showMessageDialog(null, "Paga CON aumento : " + texcedente);
		}

	}

}
