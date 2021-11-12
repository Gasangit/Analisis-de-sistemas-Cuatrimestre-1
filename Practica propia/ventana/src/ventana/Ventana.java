package ventana;

import javax.swing.*;
import java.awt.*;

class Ventana {

	public static void main(String[] args) {
		
	JFrame ventana;
	ventana = new JFrame("Primera Ventana");
	ventana.setIconImage(new ImageIcon("extraterrestre.png").getImage());
	ventana.setLocation(350, 200);
	ventana.setSize(600, 400);
	ventana.setVisible(true);
	ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// Hace que finalicen los procesos al cerrarse la ventana.
	
	
	//El método .setBounds(x,y,ancho,alto) combinar los métodos setLocation y setSize
	
	ventana.setLayout(null); 							// Esta es la clase (método) que decide como se colocan los widgets. Al colocar null decidimos nostros la posición
							 							// de los mismos
	
	JPanel panel1, panel2;								// Declaración de los paneles
	JButton boton1, boton2;								// Declaración de los botones
	
	panel1= new JPanel(new GridLayout(2,2,0,0));		// Creación del panel con un layaout grid (grilla), (fila,columna, distanacia filas, distancia col.)
	panel1.setVisible(true);							// Se hace visible del panel
	panel1.setBorder(BorderFactory.createLineBorder(Color.black)); // Agregado de Borde
	panel1.setBounds(10,10,200,285);							   // Se configura ubicación y tamaño (x,y,ancho,alto)
	
	ventana.add(panel1); 								// Se añade el panel a la ventana
	
	panel2 = new JPanel(new GridLayout(2,2,0,0));
	panel2.setVisible(true);
	panel2.setBorder(BorderFactory.createLineBorder(Color.black));
	panel2.setBounds(375,10,250,285);
	
	ventana.add(panel2);
		
	}

}
