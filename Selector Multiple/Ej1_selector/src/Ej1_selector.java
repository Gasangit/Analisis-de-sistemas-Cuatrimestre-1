import javax.swing.JOptionPane;

class Ej1_selector {

	public static void main(String[] args) {
		int n1,n2,operacion;
		double resultado;
		
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un n�mero entero"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro n�mero entero"));
		operacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de operaci�n "
													+ "\nmediante el n�mero de la lista\n1-Suma"
												  + "\n2-Resta\n3-Multiplicaci�n\n4-Divisi�n"));
		
		switch (operacion) {
		case 1:
			resultado = n1 + n2;
			JOptionPane.showMessageDialog(null, "El resultado de la operaci�n es " + resultado);
			break;
		case 2:
			resultado = n1 - n2;
			JOptionPane.showMessageDialog(null, "El resultado de la operaci�n es " + resultado);
			break;
		case 3:
			resultado = n1 * n2;
			JOptionPane.showMessageDialog(null, "El resultado de la operaci�n es " + resultado);
			break;
		case 4:
			resultado = n1 / n2;
			if(n2==0) {
				JOptionPane.showMessageDialog(null, "El divisor no puede se 0");
			}else {
				JOptionPane.showMessageDialog(null, "El resultado de la operaci�n es " + resultado);
			}
			break;
		default: JOptionPane.showMessageDialog(null, "Ha ingresado un valor no v�lido para definir"
												   + "la operaci�n a realizar");
			break;
		}
	}

}
