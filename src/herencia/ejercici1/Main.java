package herencia.ejercici1;

public class Main {

	public static void main(String[] args) {
		Estudiante estudiante1 = new Estudiante ("Carlos", 17, "Cr123" );
		
		estudiante1.mostrar();
		
		Docente docente1 = new Docente ("Juan",39, "Calculo" );
		
		docente1.mostrar();
		
	}
}