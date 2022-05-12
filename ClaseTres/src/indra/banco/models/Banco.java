package indra.banco.models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Banco {
	
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<Cuenta> cuentas = new ArrayList<Cuenta>();

	public List<Cliente> getClientes() {
		return clientes;
	}
	
	public List<Cuenta> getCuentas() {
		return cuentas;
	}

	public void registrarNuevoCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}
	
	public Cuenta abrirNuevaCuenta (Cliente cliente) throws Exception {
		if (!this.clientes.contains(cliente)) {
			throw new Exception (cliente + "no esta registrado en el banco y no puede abrir una cuenta");
		}
		
		Cuenta nuevaCuenta = new Cuenta (generarIbanNuevo(), cliente);
		this.cuentas.add(nuevaCuenta);
		
		return nuevaCuenta;
	}
	
	@SuppressWarnings("removal")
	private String generarIbanNuevo () {
	
//		return Integer.valueOf((int) Math.abs(Math.round(Math.random()*100000000))).toString();
		return UUID.randomUUID().toString(); //otra forma de generar un código aleatorio
	}
}
