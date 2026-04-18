package herencia.ejercicio5;

public class Gerente extends Empleado {
	private double bonoAdicional;

	public Gerente(String nombre, double salario, double bonoAdicional) {
		super(nombre, salario);
		this.bonoAdicional = bonoAdicional;
	}

	public double getBonoAdicional() {
		return bonoAdicional;
	}

	public void setBonoAdicional(double bonoAdicional) {
		this.bonoAdicional = bonoAdicional;
	}

	@Override
	public double calcularSalario() {
		return getSalario() + this.getBonoAdicional(); 
	}

	@Override
	public String toString() {
	  return "[Gerente] " + super.toString() + ", Bono: " + getBonoAdicional() + ", Total: $" + calcularSalario(); }
	}

	
	
	


