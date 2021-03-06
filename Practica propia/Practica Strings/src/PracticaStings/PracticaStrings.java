package PracticaStings;

import java.io.UnsupportedEncodingException;

import javax.swing.JOptionPane;

class PracticaStrings {

	public static void main(String[] args) {
		  
		String frase = "Mi vieja mula ya no es lo que era";
		
		//.charAt devuelve el caracter ubicado en el indice indicado.
		//.valueOf permite convertir un char a string.
		String char14 = String.valueOf(frase.charAt(14));
		System.out.println(char14);
		JOptionPane.showMessageDialog(null, char14);
		
		//.substrings extrae los caracteres de un string segun el indice informado en los argumentos.
		String carct8 = frase.substring(0,8);
		System.out.println(carct8);
		JOptionPane.showMessageDialog(null, carct8);
		
		//.compareTo(objeto u cadena) compara la cadena dada como variable con la cadena dada como argumento. Si el resultado es 0 es que son iguales.
		//Si es menor que 0, el argumento es lexicograficamente mayor que la variable(¿?), si es mayor que 0 es lexicograficamente menor
		String Frase_prueba = JOptionPane.showInputDialog("Por favor ingrese una frase para comparar con 'Mi vieja mula ya no es lo que era'");
		int ind_lex = frase.compareTo(Frase_prueba);
		
		JOptionPane.showMessageDialog(null,frase.compareTo(Frase_prueba));
		
		if(ind_lex == 0) {
			System.out.println("Las frases son iguales, sea creativo por favor");
		}else if(ind_lex < 0){
			String menor_resp = "La frase tiene un orden lexicográfico MENOR que la de 'Mi vieja mula...', hasta donde entiendo viene DESPUÉS"
					+ " en el diccionario (¿?)";
			System.out.println(menor_resp);
			JOptionPane.showMessageDialog(null, menor_resp);
		}else if(ind_lex > 0) {
			String mayor_resp = "La frase tiene un orden lexicográfico MAYOR que la de 'Mi vieja mula...', hasta donde entiendo viene ANTES"
					+ " en el diccionario (¿?)";
			System.out.println(mayor_resp);
			JOptionPane.showMessageDialog(null, mayor_resp);
		}
		
		//.concat nos permite concatenar (unir) 2 strings. Puede ser util en los casos en que no es posible utilizar el signo +.
		String final_de_frase = JOptionPane.showInputDialog("Por favor complete la frase '" + frase + "' con lo que guste.");
		String frase_result = frase.concat(final_de_frase);
		System.out.println("La frase final es : " + frase_result);
		JOptionPane.showMessageDialog(null, "La frase final es : " + frase_result);
		
		//.contentEquals devuelve TRUE si y solo si los strings comparados son iguales. Existe también .Equals pero en ese caso compara objetos comparables
		// como seria un String con otro String, o una StringBuffer con un StringBuffer. Mediante .equalsIgnoreCase se puede realizar la comparación igno-
		// rando las mayusculas.
		JOptionPane.showMessageDialog(null, "Por favor presione enter y escriba lo mas rápido posible : " + frase);
		String intento = JOptionPane.showInputDialog("Escriba");
		boolean comparar = frase.contentEquals(intento);
		
		if(comparar == true) {
			System.out.println("Ha escrito la frase correctamente");
			JOptionPane.showMessageDialog(null,"Ha escrito la frase correctamente");
		}else {
			System.out.println("Verifique la escritura de : " + intento + " parece que algo salió mal.");
			JOptionPane.showMessageDialog(null, "Verifique la escritura de : '" + intento + "'. Parece que algo salió mal.");
		}
		//Declaracion de un ARRAY e iteración con FOR
		String char0a7 = JOptionPane.showInputDialog("Ingrese una frase o palabra de las que se extraeran los primeros 7 caracteres.");
		char caract_frase[]; 
		caract_frase = new char[8]; 
		try {
		for (int i = 0; i<= 7; i++)
		{	caract_frase[i] = char0a7.charAt(i);
			System.out.println(caract_frase[i]);
			JOptionPane.showMessageDialog(null, caract_frase[i]);			
		}
		}catch(Exception Ex){
			JOptionPane.showMessageDialog(null, "Menos de 7 caracteres en el texto");
		}
				
		//.copyValueOf une los caracteres de un array en un string
		String select_char = "";
		String result_str = select_char.copyValueOf(caract_frase, 3, 5);
		JOptionPane.showMessageDialog(null, result_str);
		
		//.endsWith permite saber si un String finaliza con los caracteres detallados en otro String 
		boolean final_frase = frase.endsWith("lo que era");
		if(final_frase == true){
			System.out.println("La frase " + frase + " FINALIZA con 'lo que era'");
			JOptionPane.showMessageDialog(null, "La frase " + frase + " FINALIZA con 'lo que era'");
		} else {
			System.out.println("La frase " + frase + " NO finaliza con 'lo que era'");
			JOptionPane.showMessageDialog(null, "La frase " + frase + " NO finaliza con 'lo que era'");
		}
				
		//.getBytes permite cambiar el CHARSET (paquete de caracteres) de un string determinado.
		try{
			String frase_con = frase + " el año pasado"; 
			String paquete_caract= new String(frase_con.getBytes("ISO-8859-1"));
			System.out.println(paquete_caract);
			JOptionPane.showMessageDialog(null, paquete_caract);
		}catch(UnsupportedEncodingException e){
			System.out.println("Paquete de caracteres no aceptado");
			JOptionPane.showMessageDialog(null, "Paquete de caracteres no acepatados");
		}
						
	}
}
