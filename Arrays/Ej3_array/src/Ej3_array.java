import javax.swing.JOptionPane;

class Ej3_array {

	public static void main(String[] args) {
		double [] corredores = new double[10];
		double primero=99999, segundo=999999, ultimo=0;
		int corredor_1=0,corredor_2=0, corredor_3=0;
		
		for (int i = 0; i < corredores.length; i++) {
			corredores[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tiempo del corredor: " + i));
		}
		for (int i = 0; i < corredores.length; i++) {
			
			System.out.println("Corredor: " + i + "Tiempo: " + corredores[i]);
			if (corredores[i]<primero) {
				primero = corredores[i];
				corredor_1 = i +1;
			} else {
				if (corredores[i]<segundo) {
					segundo = corredores[i];
					corredor_2+= i + 1;
				} else {
					if (corredores[i]>ultimo) {
						ultimo = corredores[i];
						corredor_3+= i + 1;
					}
				}
			}
		}
		JOptionPane.showMessageDialog(null, "El corredor: "+corredor_1+ " salió primero con: " + primero +
											 "\nEl corredor: " +corredor_2+ " salio segundo: " + segundo +
											 "\nEl corredor: " + corredor_3 + " salió último: " + ultimo);	
	}
}
