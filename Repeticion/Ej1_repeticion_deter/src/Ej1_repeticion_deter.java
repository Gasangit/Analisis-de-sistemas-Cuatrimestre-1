import javax.swing.JOptionPane;

class Ej1_repeticion_deter {

	public static void main(String[] args) {
		String vend_max="";
		int tipo, cant_contado=0, cant_tarjeta=0;
		double monto, total_contado=0, total_tarjeta=0, venta_max=0, monto_total;
		boolean error=false;

		
		tipo = Integer.parseInt(JOptionPane.showInputDialog("Si desea ingresar una venta informe el tipo: "
														+ "\n1 - Contado \n2 - Tarjeta" +
														"\nCon cualquier otro número sale del proceso"));
		switch (tipo) {
		case 1:
		case 2:	
			while (tipo==1||tipo==2) {
				monto = Double.parseDouble(JOptionPane.showInputDialog("Indique el monto"));
				if (tipo==1) {
					cant_contado+=1;
					total_contado+=monto;
				} else {
					cant_tarjeta+=1;
					total_tarjeta+=monto;
				}
				if (cant_contado+cant_tarjeta==1) {
					venta_max = monto;
					vend_max = JOptionPane.showInputDialog("Realizó la mayor venta, ingrese su nombre");
				} else {
					if (monto>venta_max) {
						venta_max = monto;
						vend_max = JOptionPane.showInputDialog("Realizó la mayor venta, ingrese su nombre");
					}
				}
				System.out.println(tipo+"	"+monto+"	");
				tipo = Integer.parseInt(JOptionPane.showInputDialog("Si desea ingresar una venta informe el tipo: "
						+ "\n1 - Contado \n2 - Tarjeta" +
						"\nCon cualquier otro número sale del proceso"));
			}
				
			break;

			default: error=true;
			break;
		}
		if (error) {
			JOptionPane.showMessageDialog(null, "Ingresó un tipo de venta incorrecto");
		} else {
			monto_total = total_contado + total_tarjeta;
			JOptionPane.showMessageDialog(null, "Cant. ventas tarjeta: " + cant_tarjeta +
					"\nTotal de efectivo: " + total_contado + 
					"\nMonto total tarjeta: " + total_tarjeta +
					"\nMonto total del día: " + monto_total +
					"\nVenta máxima: " + venta_max + 
					"\nVendedor venta máxima: " + vend_max);
		}
	}

}
