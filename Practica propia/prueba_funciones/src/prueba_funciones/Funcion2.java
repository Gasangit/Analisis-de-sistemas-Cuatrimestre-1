package prueba_funciones;

import javax.swing.JOptionPane;

class Funcion2 {

	public static void main(String[] args) {
		int a, b;
		//Funcion1 c1 = new Funcion1(); // Se genera una instancia de la clase Funcion1 para poder usar el m?todo suma()
		
		a = Integer.parseInt(JOptionPane.showInputDialog("N1"));
		b = Integer.parseInt(JOptionPane.showInputDialog("N2"));
		// se generan los dos enteros
		
		JOptionPane.showMessageDialog(null, Funcion1.sumar(a,b) ); // se llama al metodo suma pasandole los dos enteros a sumar y mostrando el 
		 													  // resultado con un joptionpane
		

	}

}
