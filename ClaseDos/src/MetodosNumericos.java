
public class MetodosNumericos {
	
	public static boolean esNumero (String str) {
		
		return (str != null) && (str.matches("[0-9]+")); //esto (str != null) hace que si el string es nulo directamente me devulve false 
	}													 //el + en la expresion regular lo que hace es que desde 0 hasta n se compruebe si se cimple lo que hemos puesto, es decir que todo son numeros, si es verdad se devuelve true

	
	public static int valorAlAzar (int min, int max) {
		
		return (int) (Math.random()*(max-min))+min;
	}

}
