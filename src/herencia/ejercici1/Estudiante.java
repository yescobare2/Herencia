package herencia.ejercici1;

public class Estudiante extends Persona {
	private String Carnet;

	public Estudiante(String nombre, int edad, String Carnet) {
		super(nombre, edad);
		this.Carnet = Carnet;
	}
	

public String getCarnet() {
		return Carnet;
	}


	public void setCarnet(String carnet) {
		Carnet = carnet;
	}


@Override 	
public void mostrar() {
	System.out.println("Datos de estudiante");
	System.out.println("Nombre: " +getNombre());
	System.out.println("Edad: " +getEdad());
	System.out.println("Carnet: " +getCarnet());
}
	
	
	

}
