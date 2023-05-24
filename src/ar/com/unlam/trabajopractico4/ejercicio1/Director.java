package ar.com.unlam.trabajopractico4.ejercicio1;

import java.time.LocalDate;

public class Director extends Empleado{
	
	private Integer sueldoExtra;
	private Vehiculo cochera;

	public Director(String nombre, String apellido, Integer dni, Integer sueldo, LocalDate fechaDeNacimiento) {
		super(nombre, apellido, sueldo, sueldo, fechaDeNacimiento);
		// TODO Auto-generated constructor stub
	}

	public Integer getSueldoExtra() {
		return sueldoExtra;
	}

	public void setSueldoExtra(Integer sueldoExtra) {
		this.sueldoExtra = sueldoExtra;
	}

	public Vehiculo getCochera() {
		return cochera;
	}

	public void setCochera(Vehiculo cochera) {
		this.cochera = cochera;
	}

	public void calcularSueldo(Integer sueldoExtra) {
		setSueldo(getSueldo()+sueldoExtra);
		
	}

	public void asignarVehiculo(Vehiculo auto) {
		setCochera(auto);
		
	}

}
