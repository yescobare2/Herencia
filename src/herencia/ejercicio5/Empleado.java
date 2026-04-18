package herencia.ejercicio5;

public class Empleado {
	private String nombre;
	private double salario;
	
	public Empleado(String nombre, double salario) {
		super();
		this.nombre = nombre;
		this.salario = salario;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public double getSalario() {
		return salario;
	}



	public void setSalario(double salario) {
		this.salario = salario;
	}



	public double calcularSalario(){
		return getSalario();
		
	}


	@Override
	public String toString() {
		return "Empleado [nombre=" + getNombre() + ", salario=" + getSalario() + "]";
	}

	
}
