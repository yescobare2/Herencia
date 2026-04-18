package herencia.ejercicio4;

public class Bus extends Transporte {
    private String ruta;
    
    public Bus(int c, String r) { 
    	super(c); this.ruta = r;
    	}
    
    public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	@Override
    public String descripcion() { return super.descripcion() + ", Ruta: " + getRuta(); }
    
    @Override
    public String toString() { return "[Bus] " + descripcion(); }
}
