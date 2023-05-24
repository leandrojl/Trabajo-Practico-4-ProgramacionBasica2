package ar.com.unlam.trabajopractico4.ejercicio1;

import java.time.LocalDate;

public class Gerente extends Empleado{
	
	private Vehiculo cochera;

	public Gerente(String nombre, String apellido, Integer dni, Integer sueldo, LocalDate fechaDeNacimiento) {
		super(nombre, apellido, dni, sueldo, fechaDeNacimiento);
		// TODO Auto-generated constructor stub
	}
	

	public Vehiculo getCochera() {
		return cochera;
	}

	public void setCochera(Vehiculo cochera) {
		this.cochera = cochera;
	}


	public void asignarCochera(Vehiculo auto) {
		setCochera(auto);
		
	}

}
