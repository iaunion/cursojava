import java.util.ArrayList;
import java.util.Scanner;

public class ClaseDos {
	
	
	public static void main(String[] args) {
		
//		System.out.println("Bienvenidos a la segunda clase");
//		
//		String nombre = Consola.leerEntrada("Hola cual es tu nombre");
//		
//		String edad = Consola.leerEntrada("Cual es tu edad");
//		
//		if(MetodosNumericos.esNumero(edad)) {
//			//System.out.println("Bienvenido " + nombre + edad);
//			System.out.println(String.format("Bienvenido %s de %s", nombre, edad)); //Mas eficiente que el de arriba
//		} else {
//			System.out.println(String.format("Bienvenido %s. No entendi tu edad", nombre));
//		}
//		
//		System.out.println(Math.floor(Math.random()*10));

//***************************************************************************************
//		boolean encontrado = false;
//		int numOportunidades = 6;
//		int numAleatorio = MetodosNumericos.valorAlAzar(1, 100);
//		int numeroIntroducido;
//		
//		
//		while (!encontrado && numOportunidades>0) {
//			numeroIntroducido = Consola.leerNumero("Introduce un número del 1 al 100");
//			if (numeroIntroducido > numAleatorio) {
//				System.out.println("El numero debe ser menor");
//				numOportunidades--;
//			} else if (numeroIntroducido < numAleatorio) {
//				System.out.println("El numero debe ser mayor");
//				numOportunidades--;
//			} else {
//				System.out.println("Felicidades, has acertado");
//				encontrado = true;
//			}
//		}
//		
//		if (!encontrado && numOportunidades == 0)
//			System.out.println("Has perdido");
//****************************************************************************************
//****************************************************************************************		
//		int primerNumero, segundoNumero, seleccion;
//		primerNumero = Consola.leerNumero("Introduce el primer numero");
//		segundoNumero = Consola.leerNumero("Introduce el segundo numero");
//		seleccion = Consola.leerNumero("Elige una operación: 1. + 2. - 3. * 4. /");
		
//		switch (seleccion) {
//			case 1 : System.out.println(primerNumero+segundoNumero);
//				break;
//			case 2 : System.out.println(primerNumero-segundoNumero);
//				break;
//			case 3 : System.out.println(primerNumero*segundoNumero);
//				break;
//			case 4 : System.out.println(primerNumero/segundoNumero);
//				break;
//		}
		
//		int resultado = switch (seleccion) {
//			case 1 : yield primerNumero+segundoNumero;
//			case 2 : yield primerNumero-segundoNumero;
//			case 3 : yield primerNumero*segundoNumero;
//			default : yield primerNumero/segundoNumero;
//		};
//				
//		System.out.println(resultado);
//****************************************************************************************
//*******************************************************************************************************		
//		String [] nombres = new String[] {"Irene", "Javier", "Ernesto", "Raquel", "Daniel", "Carlos", "Miguel"};
//		for (String val : nombres) System.out.println(val);
//****************************************************************************************************		
//****************************************************************************************************
//		int numElementos = Consola.leerNumero("Cuantos numeros quieres?");
//		int [] elementos = new int [numElementos];
//		int contador = 0;
//		
//		while (contador<numElementos) {
//			elementos[contador] = Consola.leerNumero("Introduce numero");
//			contador++;
//		}
//			
//		int max, min;
//		int suma = 0;
//		max=min=elementos[0];
//
//		for (int i = 0; i < numElementos; i++) {
//		              
//		        if(elementos[i]>max)
//		            max=elementos[i];		            
//		        
//		        if(elementos[i]<min)
//		            min=elementos[i];
//		        suma = suma + elementos[i];
//		}
//		
//		System.out.println("Maximo: " + max + " " + "Minimo: "+ min + " " + "Promedio: "+ suma/numElementos);
//************************************************************************************************************
//***********************************************************************************************************
		
//		ArrayList<String> nombres = new ArrayList<String>();
//		String nombre = Consola.leerEntrada("Introduce nombre");
//		while (nombre.compareTo("FIN")!=0) {
//			nombres.add(nombre);
//			nombre = Consola.leerEntrada("Introduce nombre");
//		}
		
//		for (String val : nombres) {
//			
//			String nombreAlreves = new StringBuilder(val).reverse().toString();
//			for (int i = val.length() - 1; i >= 0; i--) {
//				nombreAlreves += val.charAt(i);
//			}
		
//			nombres.forEach (val -> {
//				String nombreAlreves = new StringBuilder(val).reverse().String();
//				System.out.println("Nombre: "+val+" "+"Longitud: "+val.length()+"Nombre alrevés: "+nombreAlreves);
//			});
//			
//			System.out.println("Nombre: "+val+" "+"Longitud: "+val.length()+"Nombre alrevés: "+nombreAlreves);
//		}

//***********************************************************************************************************
//***********************************************************************************************************
		
		
	
	}

}
