package imagendado;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

class Imagendado {

	public static void main(String[] args) {
		
		int d;
		d = (int)(Math.random()*6+1);
		
		JOptionPane.showMessageDialog(null, "Su dado es ", "Tirar dado", JOptionPane.DEFAULT_OPTION,
														  new ImageIcon(Imagendado.class.getResource
														    ("/img/imagenes dados" + d + ".png" )));

	}

}
