package prueba_funciones;

class Funcion1 {
	public static void main(String[] args) {
		
		// void significa que la funcion o metodo no devuelve un resultado.
		 
	}
	public static int sumar(int n, int n2){
		// Funcion que recibe 2 enteros y los suma
		// static indica que no es necesario un objeto para aplicar el metodo (objeto.sumar(1,4))
		
		int resultado;
		resultado = n + n2;
		
		return resultado; // se agrega return para que al llamar a Funcion1.sumar(n,n1) devuelva el resultado
	}
}
