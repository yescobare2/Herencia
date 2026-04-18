package herencia.ejercicio4;

public class Transporte {
	private int capacidad;
	
    public Transporte(int capacidad){
    	this.capacidad = capacidad;
    	}
    public String descripcion() { return "Capacidad: " + capacidad; }
    


public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
@Override
public String toString() { return descripcion(); 
}

}
