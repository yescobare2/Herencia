package herencia.ejercicio8;

public class Circulo extends Figura {
	private double radio;

	public Circulo(double radio) {
		this.radio = radio;
	}

	@Override
	public double calcularArea() {
		return Math.PI * Math.pow(radio, 2);
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", area=" + String.format("%.2f", calcularArea()) + "]";
	}
}