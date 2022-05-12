import java.util.Scanner;

public class Consola {
	
	public static String leerEntrada (String titulo) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println(titulo);
		
		try {
			String entrada = teclado.nextLine();

			if(entrada.isEmpty()) {
				System.out.println("Ingresa de nuevo");
				entrada = teclado.nextLine();
			}
			
			return entrada;
		} finally {
			//teclado.close(); ESTO DA ERROR
		}
	}
	
	public static int leerNumero (String titulo) {
		
		System.out.println(titulo); 
	    Scanner teclado = new Scanner(System.in);
	    String numero = teclado.nextLine();
	    
	    while(numero.isEmpty() || !MetodosNumericos.esNumero(numero)){
	        System.out.println("Por favor, ingresa un valor numérico");
	        numero = teclado.nextLine();
	    }
//	    teclado.close();
	    return Integer.parseInt(numero);
	    
	}

}
