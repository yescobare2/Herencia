package herencia.ejercio10;

public class FacturaCredito extends Factura {
	private double recargo;
	private int cuotas;

	public FacturaCredito(int numero, Cliente cliente, double total, double recargo, int cuotas) {
		super(numero, cliente, total);
		this.recargo = recargo;
		this.cuotas = cuotas;
	}

	@Override
	public double calcularTotal() {
		return getTotal() + recargo;
	}

	public double getValorCuota() {
		return calcularTotal() / cuotas;
	}

	@Override
	public String toString() {
		return "[Credito] " + super.toString() + " | Recargo: $" + recargo + " | Cuotas: " + cuotas + " de $" + getValorCuota() + " | TOTAL: $" + calcularTotal();
	}
}