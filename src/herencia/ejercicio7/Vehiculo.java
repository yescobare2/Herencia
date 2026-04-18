package herencia.ejercicio7;

public class Vehiculo {
  private String marca;
  private double velocidad;
  
  public Vehiculo(String marca, double velocidad) {
	super();
	this.marca = marca;
	this.velocidad = velocidad;
  }

  public String getMarca() {
	return marca;
  }

  public void setMarca(String marca) {
	this.marca = marca;
  }

  public double getVelocidad() {
	return velocidad;
  }

  public void setVelocidad(double velocidad) {
	this.velocidad = velocidad;
  }
  
  public void mostrarInfo() {
		System.out.println("Informacion del vehiculo:");
		System.out.println("Marca: " + getMarca() + ", Velocidad: " + getVelocidad() + " km/h");
	}
  
  @Override
	public String toString() {
		return "Vehiculo [marca=" + getMarca() + ", velocidad=" + getVelocidad() + "]";
	}
  
}
