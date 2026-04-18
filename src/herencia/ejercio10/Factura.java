package herencia.ejercio10;

public class Factura {
	private int numero;
	private Cliente cliente;
	private double total;
	
	public Factura(int numero, Cliente cliente, double total) {
		super();
		this.numero = numero;
		this.cliente = cliente;
		this.total = total;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double calcularTotal() {
		return total;
	}
	
	@Override
	public String toString() {
		return "Factura [numero=" + numero + ", cliente=" + cliente + ", total=" + total + "]";
	}
	
	

}
