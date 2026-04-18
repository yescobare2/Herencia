package herencia.ejercici1;

import java.time.LocalDate;

import herencia.ejercici2.CuentaCorriente;
import herencia.ejercicio3.ProductoPerecedero;
import herencia.ejercicio4.Bus;
import herencia.ejercicio5.Gerente;
import herencia.ejercicio7.Moto;
import herencia.ejerciio6.Perro;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Ejercicio 1");
		Estudiante estudiante1 = new Estudiante ("Carlos", 17, "Cr123" );
		estudiante1.mostrar();
		
		Docente docente1 = new Docente ("Juan",39, "Calculo" );
		docente1.mostrar();
		
		
		System.out.println("Ejercicio 2");
		CuentaCorriente cuenta1 = new CuentaCorriente ("Marcelo", 1000, 500 );
		cuenta1.retirar(800); //Prueba de sobregiro 
		System.out.println(cuenta1);
		
		cuenta1.retirar(600); //Prueba sin sobregiro
		System.out.println(cuenta1);
		
		cuenta1.retirar(200);//Denegar el retiro
		System.out.println(cuenta1);
		
		System.out.println("Ejercicio 3");
		ProductoPerecedero producto1 = new ProductoPerecedero ("Yogurt", 15.50, LocalDate.of(2026,12,4) );
		System.out.println(producto1 + " | ¿Vencido?: " + (producto1.estaVencido() ? "SÍ" : "NO"));
		
		System.out.println("Ejercicio 4");
		Bus bus1 = new Bus (30, "Ruta del Caribe");
		System.out.println(bus1 );
		
		System.out.println("Ejercicio 5");
		Gerente gerente1 = new Gerente ("Franklin", 10000, 500);
		System.out.println(gerente1);
		
		System.out.println("Ejercicio 6");
	    Perro perro1 = new Perro();
	    perro1.hacerSonido();
	    
	    System.out.println("Ejercicio 7");
	    Moto moto1 = new Moto ("Toyota", 180.50, 250);
	    moto1.mostrarInfo();  
}
}