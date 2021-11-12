import javax.swing.JOptionPane;

class array_for {

	public static void main(String[] args) {
		//Declaracion de un ARRAY e iteración con FOR
		String char0a7 = JOptionPane.showInputDialog("Ingrese una frase o palabra de las que se extraeran los primeros 7 caracteres.");
		char caract_frase[]; 
		caract_frase = new char[8]; 
		for (int i = 0; i<= 7; i++)
		{	caract_frase[i] = char0a7.charAt(i);
			System.out.println(caract_frase[i]);
			JOptionPane.showMessageDialog(null, caract_frase[i]);			
		}

	}
}
