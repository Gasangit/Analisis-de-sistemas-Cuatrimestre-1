import javax.swing.JOptionPane;

class Ej1_repeticion_while {

	public static void main(String[] args) {
		
		int nota, aprobado=0, desaprobado=0, tp=0, escrito=0;
		
		System.out.println("Nota  Aprobados  TP  Escrito  Desaprobados");
		
		do {
			nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota del alumno, corta el "
																+ "\nbucle con una nota negativa (-1)"));
			
			if (nota>4) {
				aprobado = aprobado + 1;
				if (nota>7) {
					tp = tp + 1;
				} else {
					escrito = escrito + 1;
				}
			} else {
				if (nota<0 || nota>10) {
					JOptionPane.showMessageDialog(null, "Debe ingresar una nota entre 0 y 10");
				} else {
					desaprobado = desaprobado + 1;
				}
				
			}
			System.out.println(nota + "     " + aprobado + "          " + tp + "    " + escrito + "         " + desaprobado);
		} while (nota>=0 && nota<11);
		
		JOptionPane.showMessageDialog(null, "Aprobados: " + aprobado + "\nTrabajo Pr?ctico: " + tp +
												"\nEscrito: " + escrito + "\nDesaprobados: " + desaprobado);
	}

}
