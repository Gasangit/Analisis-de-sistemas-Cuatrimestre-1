import javax.swing.JOptionPane;

class Ej1_array {

	public static void main(String[] args) {
		
		int [] num = new int[8];
		
		int tot=0, treinta_6=0, max_50=0;
		
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(JOptionPane.showInputDialog("Número: "+ i +
													" Ingrese 8 entre 0 y 100"));
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
			tot = tot + num[i];
			if (num[i]==36) {
				treinta_6= treinta_6+1;
			} else {
				if (num[i]>50) {
					max_50 = max_50 + 1;
				}
			}
			
		}
		
		JOptionPane.showMessageDialog(null, "Igual a 36: " + treinta_6 + "\nMayor a 50: " + max_50);
		
	}

}
