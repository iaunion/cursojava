package indra.banco;

import java.time.LocalDate;
import java.util.Scanner;

import indra.banco.models.Banco;
import indra.banco.models.Cliente;
import indra.banco.models.Cuenta;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
//************************************************************************************
//			System.out.println("Introduce tu nombre");
//			String nombre = sc.nextLine();
//			System.out.println("Introduce tu apellido");
//			String apellido = sc.nextLine();
//			System.out.println("Introduce tu fecha de nacimiento (YYYY-MM-DD)");
//			LocalDate nacimiento = LocalDate.parse(sc.nextLine());
//************************************************************************************
//			Cliente cliente = new Cliente();
//			System.out.println("Introduce tu nombre");
//			cliente.setNombre(sc.nextLine());
//			System.out.println("Introduce tu apellido");
//			cliente.setApellido(sc.nextLine());
//			System.out.println("Introduce tu fecha de nacimiento (YYYY-MM-DD)");
//			cliente.setFechaNacimiento(LocalDate.parse(sc.nextLine()));
//			System.out.println(cliente);
//*************************************************************************************			
			System.out.println("Introduce tu nombre");
			String nombre = sc.nextLine();
			System.out.println("Introduce tu apellido");
			String apellido = sc.nextLine();
			System.out.println("Introduce tu fecha de nacimiento (YYYY-MM-DD)");
			LocalDate nacimiento = LocalDate.parse(sc.nextLine());
			Cliente cliente = new Cliente(nombre, apellido, nacimiento);
			
			Banco banco = new Banco();
			banco.registrarNuevoCliente(cliente);
			Cuenta cuenta = banco.abrirNuevaCuenta(cliente);
			cuenta.depositar(1000);
			
			System.out.println(cliente);
			
		}
		
		catch (Exception e){
			System.err.println(e.getMessage());
		}
		finally {
			sc.close();
		}

	}

}
