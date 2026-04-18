package herencia.ejercici1;

import herencia.ejercici2.CuentaCorriente;

public class Main {

	public static void main(String[] args) {
		
		//ejercicio 1
		Estudiante estudiante1 = new Estudiante ("Carlos", 17, "Cr123" );
		
		estudiante1.mostrar();
		
		Docente docente1 = new Docente ("Juan",39, "Calculo" );
		
		docente1.mostrar();
		
		//ejercicio 2
		
		CuentaCorriente cuenta1 = new CuentaCorriente ("Marcelo", 1000, 500 );
		cuenta1.retirar(800); //Prueba de sobregiro 
		System.out.println(cuenta1);
		
		cuenta1.retirar(600); //Prueba sin sobregiro
		System.out.println(cuenta1);
		
		cuenta1.retirar(200);//Denegar el retiro
		System.out.println(cuenta1);
	}
}