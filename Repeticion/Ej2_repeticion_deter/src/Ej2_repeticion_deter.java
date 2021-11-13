import javax.swing.JOptionPane;

class Ej2_repeticion_deter {

	public static void main(String[] args) {
		double capital, interes, calc;
		int meses;
		
		capital = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el capital"));
		meses = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los meses de inversión"));
		interes = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el interes"));
		
		for (int i = 1; i <=meses ; i++) {
			calc = (1 + (interes/100));
			capital = capital * calc;
			
			System.out.println(i+"		"+calc +"		"+capital);
		}
		JOptionPane.showMessageDialog(null, "El monto resultante es: " + capital);
	}

}
