package ventana2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

class Ventana2 {

	public static void main(String[] args) {
		
		
		
	JFrame ventana = new JFrame("Primera Ventana");
	JDialog mensaje = new JDialog(ventana, "Mensaje", true);	// JDialog es la forma más básica de un JOptionpane, por lo tanto más configurable
	JLabel label_pane = new JLabel("Un mensaje en este lugar no viene mal",JLabel.CENTER); // El texto dentro del JOptionPane es un JLabel por lo que si
																						   // se genera una instancia de JLabel (la clase que define a los
																						   // labels) se pude modificar la ubicación del texto para luego
																						   // incluirlo en el JOptionPane
	JOptionPane pane = new JOptionPane(label_pane); // Hasta donde entiendo el JOptionPane esta compuesto por el texto, los
																				 // botones y la imagen dentro del cuadro de dialogo que es el JDialog
	JTextField entry = new JTextField(); // Permite crear una casilla para ingresar datos.
		entry.setVisible(true);
		entry.setHorizontalAlignment(JTextField.RIGHT); // Permite que el texto al escribirse aparezca desde la derecha
	
	JPanel panel1, panel2, panel3;								// Declaración de los paneles
	JButton boton1, boton2, boton3;										// Declaración de los botones
	JLabel etiqueta1, etiqueta2;
	
	ventana.setIconImage(new ImageIcon("extraterrestre.png").getImage());
	ventana.setLocation(350, 200);						
	ventana.setSize(615, 400);
	ventana.setVisible(true);
	ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// Hace que finalicen los procesos al cerrarse la ventana.
	ventana.setTitle("Prueba de ventana");
	
	ventana.setLayout(null); 							// Esta es la clase (método) que decide como se colocan los widgets. Al colocar null decidimos nostros la posición
							 							// de los mismos. Si agregamos componentes y no declaramos layout o no le ponemos null no aparece-
														// ran.

	//JInternalFrame frame_interno = new JInternalFrame("frame INterno"); // El JInternalFrame es una ventana interna movible dentro de otra ventana que
																		// normalmente es un JDesktopPane
	//frame_interno.setBounds(20, 200, 200, 50);
	//frame_interno.setVisible(true);
	
	//ventana.add(frame_interno);
	
	panel1= new JPanel(null);		// Creación del panel con un layaout grid (grilla), (fila,columna, distanacia filas, distancia col.)
		panel1.setVisible(true);							// Se hace visible del panel
		panel1.setBorder(BorderFactory.createLineBorder(Color.black)); // Agregado de Borde
		panel1.setBounds(10,10,285,285);							   // Se configura ubicación y tamaño (x,y,ancho,alto)
	
	ventana.add(panel1); 								// Se añade el panel a la ventana
	
		boton1 = new JButton("Botón 1");
		boton1.setBounds(20, 20, 100, 40);
		boton1.setVisible(true);
				
		panel1.add(boton1);
		
		etiqueta1 =new JLabel("Etiqueta 1");
		etiqueta1.setBounds(20,80,200,40);
		etiqueta1.setVisible(true);
		
		panel1.add(etiqueta1);
		
	
	panel2 = new JPanel(null);
	panel2.setVisible(true);
	panel2.setBorder(BorderFactory.createLineBorder(Color.black));
	panel2.setBounds(305,10,285,285);
	
	ventana.add(panel2);
		
		boton2 = new JButton("Botón 2");
		boton2.setBounds(20,20,100,40);
		boton2.setVisible(true);
		
		panel2.add(boton2);
		
		etiqueta2 = new JLabel("Etiqueta 2");
		etiqueta2.setBounds(20,80,200,40);
		etiqueta2.setVisible(true);
		
		panel2.add(etiqueta2);
		
		
		boton1.addActionListener(new ActionListener() {		// Captura las acciones declaradas en actionPerformed para que se realicen al presionar el boton
			public void actionPerformed(ActionEvent e) {	// Se define la/s acción a realizar cuando se presiona el boton
				etiqueta1.setText("Presionó el botón 1");						// Cambia el texto de la etiqueta a vacio
				etiqueta2.setText("Etiqueta 2");
			}
		});
		
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				etiqueta1.setText("Etiqueta 1");
				etiqueta2.setText("Presionó el botón 2");
				mensaje.setBounds(500, 400, 300, 150);
				
				mensaje.setContentPane(pane);
				
				mensaje.setVisible(true);
				pane.setVisible(true);	
				
			}
		});
	
	panel3 = new JPanel(new GridLayout(2,4,0,0)); //Establece una grilla para acomodar los componentes (filas, columnas, distancia entre fials, distancia
												  // entre columnas)
	panel3.setVisible(true);
	panel3.setBorder(BorderFactory.createLineBorder(Color.black));
	panel3.setBounds(10,300,580,50);
	
	
	panel3.add(entry);
	ventana.add(panel3);

	}

}

