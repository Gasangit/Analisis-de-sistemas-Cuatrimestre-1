import javax.swing.JOptionPane;

class Ej4_selector {

	public static void main(String[] args) {
		String producto, tipo;
		int cantidad;
		double costo = 0, valor, descuento;
		boolean error = false;
		
		producto = JOptionPane.showInputDialog("Ingrese producto A o B");
		
		if (producto.equalsIgnoreCase("a") || producto.equalsIgnoreCase("b")) {
			cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingresar la cantidad a comprar"));
			
			producto = producto.toLowerCase();
			
			switch (producto) {
			case "a":
						tipo = JOptionPane.showInputDialog("Ingrese el tipo de producto: \n"
														  +"A - Primavera / Marino / Oto?o");
						tipo = tipo.toLowerCase();
						
						switch (tipo) {
						case "primavera":
								costo = 1.5;
						break;
						case "marino":
								costo = 1.55;
						break;
						case "oto?o":
								costo = 1.6;
						break;	
	
						default: JOptionPane.showMessageDialog(null, "El producto A solo puede ser de\n"
																   + "tipo Primavera, Marino u Oto?o");
								 error = true;
						break;
						}
			break;
			case "b":
						tipo = JOptionPane.showInputDialog("Ingrese el tipo de producto: \n"
														  +"A - Grande / Mediano / Peque?o");
						tipo = tipo.toLowerCase();
	
						switch (tipo) {
						case "grande":
								costo = 2.05;
						break;
						case "mediano":
								costo = 1.6;
						break;
						case "peque?o":
								costo = 1.1;
						break;	
	
						default: JOptionPane.showMessageDialog(null, "El producto B solo puede ser de\n"
								   								   + "tipo Grande, Mediano o Peque?o");
								 error = true;
						break;
						}
			break;			
			}
		
				if(error!=true) {
					valor = costo *cantidad;
					
					if (valor > 100) {
						valor = valor * 0.9;
						descuento = valor * 0.1;
						
						JOptionPane.showMessageDialog(null, "A recibido un descuento por una compra\n" + 
														   "mayor a $100. El valor final es: " + valor + 
																  "\ncon un descuento de " + descuento);
					} else {
						JOptionPane.showMessageDialog(null, "El valor final de la compra es: " + valor);
					}
				}else {
						
				}
		
		}else {
			JOptionPane.showMessageDialog(null, "Solo existen productos de tipo A y B");
		}
				  
	}

}
