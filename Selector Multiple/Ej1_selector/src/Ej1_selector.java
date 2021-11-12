import javax.swing.JOptionPane;

class Ej1_selector {

	public static void main(String[] args) {
		int n1,n2,operacion;
		double resultado;
		
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número entero"));
		operacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de operación "
													+ "\nmediante el número de la lista\n1-Suma"
												  + "\n2-Resta\n3-Multiplicación\n4-División"));
		
		switch (operacion) {
		case 1:
			resultado = n1 + n2;
			JOptionPane.showMessageDialog(null, "El resultado de la operación es " + resultado);
			break;
		case 2:
			resultado = n1 - n2;
			JOptionPane.showMessageDialog(null, "El resultado de la operación es " + resultado);
			break;
		case 3:
			resultado = n1 * n2;
			JOptionPane.showMessageDialog(null, "El resultado de la operación es " + resultado);
			break;
		case 4:
			resultado = n1 / n2;
			if(n2==0) {
				JOptionPane.showMessageDialog(null, "El divisor no puede se 0");
			}else {
				JOptionPane.showMessageDialog(null, "El resultado de la operación es " + resultado);
			}
			break;
		default: JOptionPane.showMessageDialog(null, "Ha ingresado un valor no válido para definir"
												   + "la operación a realizar");
			break;
		}
	}

}
