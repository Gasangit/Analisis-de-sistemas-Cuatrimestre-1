import javax.swing.JOptionPane;

class Ej6_repeticion {

	public static void main(String[] args) {
		int cant_num, num, num_max=0, num_min=0, rango;
		
		cant_num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de n?meros"));
		
		for (int n = 1; n <= cant_num; n++) {
			
			num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese n?mero"));
			
			if (n==1) {
				num_max= num;
				num_min= num;
			} else {
				if (num>num_max) {
					num_max= num;
				}else if (num<num_min) {
					num_min= num;	
					}	
			}
			System.out.println("N?mero: " + num + "  /N?mero m?ximo: " + num_max + "/  N?mero m?nimo: " + num_min);
		}
		rango = num_max - num_min;
		JOptionPane.showMessageDialog(null, "El rango es : " + rango);
		
		System.out.println("\nRango= " + num_max + " - " + num_min + " = " + rango);
	}
}
