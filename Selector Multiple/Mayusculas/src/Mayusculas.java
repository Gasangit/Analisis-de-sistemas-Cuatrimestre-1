import javax.swing.JOptionPane;

class Mayusculas {

	public static void main(String[] args) {
		String cat;
		
		cat = JOptionPane.showInputDialog("Ingresar categor�a");
		
		switch (cat.toLowerCase()) {  //Tambi�n existe toUpperCase para pasar todo el string a may�sculas.
			case "a": JOptionPane.showMessageDialog(null, "Es a");
			break;
			case "b": JOptionPane.showMessageDialog(null, "Es b");
			break;
		
			default: JOptionPane.showMessageDialog(null, "Ninguno");
			break;
		}

	}

}
