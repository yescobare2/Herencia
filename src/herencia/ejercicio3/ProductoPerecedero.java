package herencia.ejercicio3;

import java.time.LocalDate;

public class ProductoPerecedero extends Producto {
	private LocalDate fechaVencimiento;

	public ProductoPerecedero(String nombre, double precio, LocalDate fechaVencimiento) {
		super(nombre, precio);
		this.fechaVencimiento = fechaVencimiento;
		
	}
	
    
	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}


	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}


	public boolean estaVencido() {
		return LocalDate.now() .isAfter(fechaVencimiento);
	}

	@Override
	public String toString() {
		return  
			super.toString() + " El producto vence " + getFechaVencimiento();
		
	};
	
	}
	
	


