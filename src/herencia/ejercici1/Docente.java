package herencia.ejercici1;

public class Docente extends Persona{
	private String especialidad;

	public Docente(String nombre, int edad, String especialidad) {
		super(nombre, edad);
		this.especialidad = especialidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	

	@Override
   public void mostrar() {
		System.out.println("Datos de docente");
		System.out.println("Nombre: " +getNombre());
		System.out.println("Nombre: " + getEdad());
		System.out.println("Nombre: " + getEspecialidad());
	}


		
	}
	
	


