package ej3_repeticion;

import javax.swing.JOptionPane;

class Ej3_repeticion {

	public static void main(String[] args) {
		int n, tipo1=0, tipo2=0, tipo3=0, tipo4=0;
		String ns, lista1="", lista2="", lista3="", lista4="";
		
		
		JOptionPane.showMessageDialog(null, "Se generaran 100 números al azar se contaran las"
								   +"\ncantidades que salgan entre 0 y 25, luego las que salgan"
								  +"\nentre 25 y 50, luego las que se encuentren entre 50 y 75."
									 	  +"\nFinalmente las que se encuentren entre 75 y 100");
		
		for (int num = 0; num <=100; num++) {
			n = (int)(Math.random()*101);
			ns = String.valueOf(n);
			
			if (n>=0 && n<=25) {
				tipo1 = tipo1 + 1;
				lista1 = lista1 + " " + ns;
			} else {
				if (n>=26 && n<=50) {
					tipo2 = tipo2 + 1;
					lista2 = lista2 + " "  + ns;
				} else {
					if (n>=51 && n<=75) {
						tipo3 = tipo3 + 1;
						lista3 = lista3 + " "  + ns;
					} else {
						tipo4 = tipo4 + 1;
						lista4 = lista4 + " "  + ns;
					}
				}
			}
			
		}
		JOptionPane.showMessageDialog(null, "Se contabilizaron:\n"
									   + tipo1 + " entre 0 y 25\n"
									   + lista1 + "\n\n"
									  + tipo2 + " entre 26 y 50\n"
									  + lista2 + "\n\n"
									  + tipo3 + " entre 51 y 75\n"
									  + lista3 + "\n\n"
									 + tipo4 + " entre 76 y 100\n"
								     + lista4);
		
		
	}

}
