package ejextra1;

import javax.swing.JOptionPane;

class Ejextra1 {

	public static void main(String[] args) {
		double vh,ch,sb,sv,os,jub,sn;
		
		vh = Double.parseDouble(JOptionPane.showInputDialog("Ingrese valor hora"));
		ch = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de horas"));
		sb=ch * vh;
		os= sb * 0.07;
		jub=sb*0.10;
		sn=sb-os-jub;
		
		JOptionPane.showMessageDialog(null, "Recibo de Sueldo \n \nsuledo bruto: " + sb +
				"\n desc obra social: " + os + "\ndesc jubilacion: " + jub + "\nsueldo a cobrar: "+ sn);
				
		
	}

}
