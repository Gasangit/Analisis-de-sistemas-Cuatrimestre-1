import javax.swing.JOptionPane;

class Ej2B_selector {

	public static void main(String[] args) {
		double ph = 0 ,phe = 0 ,ch,che, s = 0;
		int cat;
		boolean error = false;
		
		ch = Double.parseDouble(JOptionPane.showInputDialog("Ingrese cantidad de horas"));
		che = Double.parseDouble(JOptionPane.showInputDialog("Ingrese cantidad de horas extra"));
		cat = Integer.parseInt(JOptionPane.showInputDialog("Ingrese categoría 1, 2 o 3"));
		
		switch (cat) {
		case 1: ph = 14;
				phe = 20.5;
			break;
		case 2:ph = 17;
			   phe = 24;			
			break;
		case 3:ph = 21;
			   phe = 34;	
			break;

		default: error = true;
			break;
		}
		if (error) {
			JOptionPane.showMessageDialog(null, "Error en el ingreso");
		} else {
			if (che > 30) {
				phe = phe * 0.93;
			}
			s = ch * ph + che * phe;
			JOptionPane.showMessageDialog(null, "Sueldo " + s);
		}
	}

}
