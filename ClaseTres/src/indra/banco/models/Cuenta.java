package indra.banco.models;

public class Cuenta {

	private String iban;
	private double saldo = 0;
	private Entidad titular;
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public Cuenta(String iban, Entidad titular) {
		super();
		this.iban = iban;
		this.titular = titular;
	}
	
	public String getIban() {
		return iban;
	}
	
	public Entidad getTitular() {
		return titular;
	}
	
	public void depositar (double monto) {
		this.saldo += monto;
	}
	
	public void extraer (double monto) throws Exception {
		if (monto>saldo) {
			throw new Exception ("No hay saldo suficiente para realizar la extraccion");
		}
		
		this.saldo -= monto;
	}
	
}
