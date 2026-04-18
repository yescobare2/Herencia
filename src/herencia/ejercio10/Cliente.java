package herencia.ejercio10;

public class Cliente {
	private String nombre;
	private String NIT;
	
	public Cliente(String nombre, String nIT) {
		super();
		this.nombre = nombre;
		NIT = nIT;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNIT() {
		return NIT;
	}

	public void setNIT(String nIT) {
		NIT = nIT;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", NIT=" + NIT + "]";
	}
	
	
	
	

}
