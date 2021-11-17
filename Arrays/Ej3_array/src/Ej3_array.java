import javax.swing.JOptionPane;

class Ej3_array {

	public static void main(String[] args) {
		double [] corredores = new double[10];
		double primero=99999, segundo=999999, ultimo=0;
		
		for (int i = 0; i < corredores.length; i++) {
			corredores[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tiempo del corredor: " + i));
		}
		
		for (int i = 0; i < corredores.length; i++) {
			
			System.out.println("Corredor: " + i + "Tiempo: " + corredores[i]);
			if (corredores[i]<primero) {
				primero = corredores[i];
			} else {
				if (corredores[i]<segundo) {
					segundo = corredores[i];
				} else {
					if (corredores[i]>ultimo) {
						ultimo = corredores[i];
					}
				}
			}
		}
		
		JOptionPane.showMessageDialog(null, "Primero: " + primero + "\nSegundo: " + segundo +
																		"\nÚltimo: " + ultimo);
		
	}

}
