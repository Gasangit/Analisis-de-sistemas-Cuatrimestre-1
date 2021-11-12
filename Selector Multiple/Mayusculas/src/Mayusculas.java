import javax.swing.JOptionPane;

class Mayusculas {

	public static void main(String[] args) {
		String cat;
		
		cat = JOptionPane.showInputDialog("Ingresar categoría");
		
		switch (cat.toLowerCase()) {  //También existe toUpperCase para pasar todo el string a mayúsculas.
			case "a": JOptionPane.showMessageDialog(null, "Es a");
			break;
			case "b": JOptionPane.showMessageDialog(null, "Es b");
			break;
		
			default: JOptionPane.showMessageDialog(null, "Ninguno");
			break;
		}

	}

}
