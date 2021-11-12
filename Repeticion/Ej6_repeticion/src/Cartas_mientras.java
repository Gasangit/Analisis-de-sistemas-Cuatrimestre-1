import javax.swing.JOptionPane;

class Cartas_mientras {

	public static void main(String[] args) {
		int c, tot=0;
		
		c = (int)(Math.random()*12+1);
		System.out.println("Carta: " + tot);
		while (c!=1) {
			tot += c;
			c = (int)(Math.random()*12+1);
		System.out.println("Carta: " + c);	
		}
		
		JOptionPane.showMessageDialog(null, "Suma: " + tot);
		

	}
}
