package sumar;
import javax.swing.*;

class Sumar {

	public static void main(String[] args) {
		String nom;
		int a,b,c;
		JOptionPane.showMessageDialog(null, "Hola mundo");

		nom = JOptionPane.showInputDialog("Ingresar nombre");
		JOptionPane.showMessageDialog(null, "Bienvenido a Java " + nom);
		
		a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese n�mero"));
		b=Integer.parseInt(JOptionPane.showInputDialog("Ingrese n�mero"));
		c=a+b;
		JOptionPane.showMessageDialog(null, "La suma es : " + c);		
	}

}
