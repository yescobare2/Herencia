package herencia.ejercicio9;

public class LibroDigital extends Libro{
	private double tamanoMB;

	public LibroDigital(String titulo, String autor, double tamanoMB) {
		super(titulo, autor);
		this.tamanoMB = tamanoMB;
	}
	

	public void setTamanoMB(double tamanoMB) {
		this.tamanoMB = tamanoMB;
	}


	public double getTamanoMB() { return tamanoMB; }

	@Override
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Tamano del archivo: " + tamanoMB + " MB");
	}

	@Override
	public String toString() {
		return "[Digital] " + getTitulo() + " (" + tamanoMB + "MB)";
	}
	
	

}
