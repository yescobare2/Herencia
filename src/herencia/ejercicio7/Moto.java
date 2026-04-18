package herencia.ejercicio7;

public class Moto extends Vehiculo {
	private int cilindrada;

	public Moto(String marca, double velocidad, int cilindrada) {
		super(marca, velocidad);
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public void mostrarInfo() {
		super.mostrarInfo(); 
		System.out.println("Cilindrada: " + getCilindrada() + "cc");
	}

	@Override
	public String toString() {
		return "[Moto] " + super.toString() + ", Cilindrada: " + getCilindrada();
	}
}