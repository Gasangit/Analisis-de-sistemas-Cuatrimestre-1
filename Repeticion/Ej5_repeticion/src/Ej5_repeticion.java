import javax.swing.JOptionPane;


class Ej5_repeticion {

	public static void main(String[] args) {
		String nombre, nom_des="", nom_cat1="", nom_cat2="", nom_cat3="", nom_cat4="", nom_max="";
		int cant_sueldos, desocupados=0, cat1=0, cat2=0, cat3=0, cat4=0;
		double sueldo, subtot1=0, subtot2=0, subtot3=0, subtot4=0, sueldo_max=0, total;
		
		cant_sueldos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de personas de "
																  + "las cuales ingresará el sueldo"));
		
		
		
		for (int n = 1; n <= cant_sueldos; n++) {
			
			nombre = JOptionPane.showInputDialog("Ingrese el nombre de la persona " + n);
			sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo de " + nombre));
		
			if (n==1) {
				sueldo_max = sueldo;
			} else {
				if (sueldo>sueldo_max) {
					sueldo_max = sueldo;
					nom_max = nombre;
				}
			}
			
			
			if (sueldo==0) {
				desocupados = desocupados +1;
				if (nom_des.equalsIgnoreCase("")){
					nom_des = nombre;
				}else {
					nom_des = nom_des + nombre;
				}
			} else {
				if (sueldo<500) {
					
					if(nom_cat1.equalsIgnoreCase("")) {
						nom_cat1 = nombre;
					}else {
						nom_cat1 = nom_cat1 + "\n" + nombre;
					}
					cat1 = cat1 + 1;
					subtot1 = subtot1 + sueldo;
				} else {
					if (sueldo<1000) {
						if(nom_cat2.equalsIgnoreCase("")) {
							nom_cat2 = nombre;
						}else {
							nom_cat2 = nom_cat2 + "\n" + nombre;
						}
						
						cat2 = cat2 + 1;
						subtot2 = subtot2 + sueldo;
					} else {
						if (sueldo<2000) {
							if(nom_cat3.equalsIgnoreCase("")) {
								nom_cat3 = nombre;
							}else {
								nom_cat3 = nom_cat3 + "\n" + nombre;
							}
							
							cat3 = cat3 + 1;
							subtot3 = subtot3 + sueldo;
						} else {
							if(nom_cat4.equalsIgnoreCase("")) {
								nom_cat4 = nombre;
							}else {
								nom_cat4 = nom_cat4 + "\n" + nombre;
							}
							
							cat4 = cat4 + 1;
							subtot4 = subtot4 + sueldo;
						}
					}
				}
			}
			
			System.out.println(n + " /Nombre: " + nombre + " /Sueldo: " + sueldo + " /Sub-total categoía: " +
																	subtot1 + subtot2 + subtot3 + subtot4);
		}
		
		total = subtot1 + subtot2 + subtot3 + subtot4;
		
		JOptionPane.showMessageDialog(null, "Desocupados: " + desocupados + "\n" + nom_des
										  + "\n--Hasta 500: " + cat1 + "\n" + nom_cat1
										  + "\n--500 a 1000: " + cat2 + "\n" + nom_cat2
										  + "\n--1000 a 2000: " + cat3 + "\n" + nom_cat3
										  + "\n--Más de 2000: " + cat4 + "\n" + nom_cat4
										  + "\n--Sueldo máximo: " + sueldo_max + " cobrado por " + nom_max
										  + "\n--El total de sueldos pagados es: " + total);
		System.out.println("Total: " + total);
	}

}
