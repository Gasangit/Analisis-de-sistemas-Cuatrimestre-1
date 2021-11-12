package preguntas;

import javax.swing.JOptionPane;

class Preguntas {

	public static void main(String[] args) {
	final double RAIZ = 12;
		final String FUNDACION = "Pedro de Mendoza";
		final String CAPITAL = "Paris";
		
		double raiz;
		String fundacion, capital;
		int raiz_conf, fundacion_conf, capital_conf, correctas;
		
		raiz = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la raíz de 144 : "));
		fundacion = JOptionPane.showInputDialog("Ingrese quién fundó Buenos Aires : ");
		capital = JOptionPane.showInputDialog("Ingrese la capital de Francia : ");
		
		if (raiz == RAIZ) {
			raiz_conf = 1;
		} else {
			raiz_conf = 0;
		}
		if (fundacion.equalsIgnoreCase(FUNDACION)) {
			fundacion_conf = 1;
		} else {
			fundacion_conf = 0;
		}
		if (capital.equalsIgnoreCase(CAPITAL)) {
			capital_conf = 1;
		} else {
			capital_conf = 0;
		}
		correctas = raiz_conf + fundacion_conf + capital_conf;
		
		if (correctas == 0) {
			JOptionPane.showMessageDialog(null, "No tiene respuestas correctas");
		} else {
			JOptionPane.showMessageDialog(null, "Las respuestas correctas son : " + correctas);
		}
	}
}
