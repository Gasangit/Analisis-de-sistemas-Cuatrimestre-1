import javax.swing.JOptionPane;

class Ej3_repeticion_while {

	public static void main(String[] args) {
		String nombre, tipo, direccion="";
		int reg_inicial, reg_final, kv=0, total_kv=0, facturas=0;
		double gasto=0, total_fac=0;
		
		nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente. El proceso se cancela con *");
		
		System.out.println("Nombre				Tipo		Direccion				Kv		Gasto		");
		
		while (nombre.equalsIgnoreCase("*")==false) {
			tipo = JOptionPane.showInputDialog("Ingrese el tipo de cliente (A, B, C o D)");
			if (tipo.equalsIgnoreCase("a")||tipo.equalsIgnoreCase("b")||
				tipo.equalsIgnoreCase("c")||tipo.equalsIgnoreCase("d")) {
				
				direccion = JOptionPane.showInputDialog("Ingrese la direcci?n");
				reg_inicial = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer registro del medidor"));
				reg_final = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ?ltimo registro del medidor"));
				kv = reg_final - reg_inicial;
				
				if (tipo.equalsIgnoreCase("a")||tipo.equalsIgnoreCase("c")) {
					if (kv<=140) {
						gasto = kv*3.2;
					} else {
						if (kv>140&&kv<=300) {
							gasto = kv*4;
						} else {
							gasto = kv*4.5;
						}
					}
				} else {
					if (kv<=200) {
						gasto = kv*4.5;
					} else {
						gasto = kv*5.3;
					}
				}
				
			} else {
				JOptionPane.showMessageDialog(null, "Debe ingresar una categor?a v?lida (A, B, C o D)");
			}
			total_fac = total_fac + gasto;
			total_kv = total_kv + kv;
			facturas = facturas + 1;
			
			
			System.out.println(nombre +"				"+ tipo + "   		" + direccion + "				" + kv + "		" + gasto);
			
			nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente. El proceso se cancela con *");
		}
		
		JOptionPane.showMessageDialog(null, "Cantidad de facturas: " + facturas + "\nTotal kv: " + 
													total_kv + "\nTotal facturado: " + total_fac);
	}

}
