import javax.swing.JOptionPane;

class Ej2_repeticion_while {

	public static void main(String[] args) {
		String confirmar;
		int n1, n2;
		double promedio;
		
		confirmar = JOptionPane.showInputDialog("?Desea calcular un nuevo promedio?");
		
		if (confirmar.equalsIgnoreCase("si")||confirmar.equalsIgnoreCase("no")) {
			while (confirmar.equalsIgnoreCase("si")) {
				n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer n?mero"));
				n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo n?mero"));
				
				promedio = (n1 + n2) / 2;
				
				JOptionPane.showMessageDialog(null, "El promedio entre " + n1 + " y " + n2 + " es " + promedio);
				confirmar = JOptionPane.showInputDialog("?Desea calcular un nuevo promedio?");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Las respuestas posibles son SI o NO");
		}
				
	}

}
