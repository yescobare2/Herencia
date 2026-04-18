package herencia.ejercio10;

public class FacturaContado extends Factura {
	private double descuento;

	public FacturaContado(int numero, Cliente cliente, double total, double descuento) {
		super(numero, cliente, total);
		this.descuento = descuento;
	}

	@Override
	public double calcularTotal() {
		double resultado = getTotal() - descuento;
		return (resultado < 0) ? 0 : resultado; 
	}

	@Override
	public String toString() {
		return "[Contado] " + super.toString() + " | Descuento: $" + descuento + " | TOTAL: $" + calcularTotal();
	}
}