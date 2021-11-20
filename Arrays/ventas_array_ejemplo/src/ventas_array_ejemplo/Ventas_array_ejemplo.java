package ventas_array_ejemplo;

import javax.swing.JOptionPane;

class Ventas_array_ejemplo {

	public static void main(String[] args) {
		double tot=0, min=99999, max=0;
		double [] ventas = new double[7];
		
		for (int i = 0; i < ventas.length; i++) {
			ventas[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese venta"));
			System.out.println("Venta " + i + ": " + ventas[i]);
		}

		for (int i = 0; i < ventas.length; i++) {
			tot+=ventas[i];
			if (ventas[i]<min) {
				min=ventas[i];
			} 
			if(ventas[i]>max){
				max = ventas [i];
			}
		}
		JOptionPane.showMessageDialog(null, "Total ventas: " + tot + " venta máxima: " + max + " venta mínima: " + min);
	}

}
