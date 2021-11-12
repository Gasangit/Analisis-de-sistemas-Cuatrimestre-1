package libreria;

import javax.swing.JOptionPane;

class Libreria {

	public static void main(String[] args) {
		Double valor,pago;
		String tipo;
		
		valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese valor de la compra"));
		tipo =JOptionPane.showInputDialog("Si la compra es al contado ingrese C");
		
		if (tipo.equals("c")) {
			pago = valor - valor * 0.10;
			JOptionPane.showMessageDialog(null, "Paga con 10% de descuento : $ " + pago);
		} else {
			JOptionPane.showMessageDialog(null, "Paga sin descuento : $ " + valor);
		}
		
	}

}
