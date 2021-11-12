package azar;

import javax.swing.JOptionPane;

class Azar {

	public static void main(String[] args) {
		double a,b,c;
		int n1,n2,n3;
		int d, carta, rango;
		
		a= Math.random();
		b= Math.random()*10;		
		c= Math.random()*5000;
		
		JOptionPane.showMessageDialog(null, "Entre 0 y 0.9999=> " +a+"\nEntre 0 y 9.9999=> "+b+"\nEntre 0 y 4999.9=> "+c);
		
		n1=(int)(Math.random());
		n2=(int)(Math.random()*10);
		n3=(int)(Math.random()*5000);
		
		JOptionPane.showMessageDialog(null, "Entre 0 y 0.9999=> " +n1+"\nEntre 0 y 9.9999=> "+n2+"\nEntre 0 y 4999.9=> "+n3);
		
		d=(int)(Math.random()*6+1); //cara del dado
		carta=(int)(Math.random()*12+1); //número de carta
		rango=(int)(Math.random()*11+10); // número entre 10 y 20
		
		JOptionPane.showMessageDialog(null, "La cara del dado es => "+d+"\nLa carta es => "+carta+"\nEl número entre 10 y 20 es =>"+rango);
	}

}
