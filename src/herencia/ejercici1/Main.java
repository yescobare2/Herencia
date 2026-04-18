package herencia.ejercici1;

import java.time.LocalDate;

import herencia.ejercici2.CuentaCorriente;
import herencia.ejercicio3.ProductoPerecedero;
import herencia.ejercicio4.Bus;
import herencia.ejercicio5.Gerente;
import herencia.ejercicio7.Moto;
import herencia.ejercicio8.Circulo;
import herencia.ejercicio8.Rectangulo;
import herencia.ejercicio9.LibroDigital;
import herencia.ejerciio6.Perro;
import herencia.ejercio10.Cliente;
import herencia.ejercio10.FacturaContado;
import herencia.ejercio10.FacturaCredito;

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
	    
	    System.out.println("Ejercicio 8");
	    System.out.println("Rectangulo");
	    Rectangulo rectangulo1 = new Rectangulo (15.0, 7.0);
	    System.out.println(rectangulo1);
	    System.out.println("Circulo");
	    Circulo circulo1 = new Circulo (9.0);
	    System.out.println(circulo1);
	    
	    System.out.println("Ejercicio 9");
	    LibroDigital ebook1 = new LibroDigital ("La teoria de kim", "Jay Sandoval", 3.5);
	    ebook1.mostrarInfo();
	    
	    System.out.println("Ejercicio 10");
	    Cliente cliente1 = new Cliente("Cesar", "1234567");

	    System.out.println("Factura al contado");
	    FacturaContado fc = new FacturaContado(101, cliente1, 500.0, 50.0);
	    System.out.println(fc);

	    System.out.println("Factura al credito");
	    FacturaCredito fcr = new FacturaCredito(102, cliente1, 1000.0, 100.0, 3);
	    System.out.println(fcr);

	    FacturaContado fcError = new FacturaContado(103, cliente1, 100.0, 150.0);
	    System.out.println("\nPrueba Descuento Excesivo:");
	    System.out.println(fcError);
	    
	    /*
	      * 1. APLICACIÓN DE HERENCIA:
	      - En todos los programas se usó 'extends' para que las clases hijas heredaran 
	       atributos y métodos de las clases padre.
	      - Se aplicó el principio de "Reutilización de Código", evitando volver a 
	      escribir atributos comunes como 'nombre', 'marca' o 'precio' en las hijas.
	      - Se usó 'super()' en cada constructor hijo para enviar los datos hacia arriba, 
	      asegurando que el padre se inicialice primero.
	      * 2. MÉTODOS SOBRESCRITOS (@Override):
	      - Se sobrescribieron métodos de cálculo (como calcularSalario, calcularTotal 
	      o calcularArea) para que cada hijo ejecute su propia lógica.
	      - Se sobrescribió el método 'toString()' en todos los ejercicios.
	      - En ejercicios como Moto y LibroDigital, se usó 'mostrarInfo()' para 
	        personalizar la salida de datos técnica.
	      * 3. CASOS DE PRUEBA UTILIZADOS:
	      - Se crearon objetos de las clases hijas en el Main.
	      - Se probaron valores con decimales para salarios, áreas y precios.
	      - Se validaron fechas con 'LocalDate' en productos y cuotas en facturación.
	      - Se verificó que el polimorfismo funcione: aunque llamemos al mismo método, 
	      un Gerente gana distinto a un Empleado por Horas.
	     */
	  
}
}