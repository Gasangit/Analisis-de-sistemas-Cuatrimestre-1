package nota;

import javax.swing.JOptionPane;

class Nota {

	public static void main(String[] args) {
		int nota;
		
		nota = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese la nota"));
		
		if(nota>4) {
			JOptionPane.showMessageDialog(null, "Aprobada/o");
		}else {
			JOptionPane.showMessageDialog(null, "Desaprobada/o");
		}
		

	}

}
