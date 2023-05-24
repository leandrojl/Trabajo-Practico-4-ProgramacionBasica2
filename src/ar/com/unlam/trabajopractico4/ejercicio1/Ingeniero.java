package ar.com.unlam.trabajopractico4.ejercicio1;

import java.time.LocalDate;

public class Ingeniero extends Empleado{
	
	private Integer ConceptoParaLaProductividad;

	public Ingeniero(String nombre, String apellido, Integer dni, Integer sueldo, LocalDate fechaDeNacimiento) {
		super(nombre, apellido, dni, sueldo, fechaDeNacimiento);
		// TODO Auto-generated constructor stub
	}
	
	public Ingeniero(String nombre, String apellido,Integer dni, Integer sueldo, LocalDate fechaDeNacimiento, Integer ConceptoParaLaProductividad) {
		super(nombre, apellido, dni, sueldo, fechaDeNacimiento);
		this.ConceptoParaLaProductividad = ConceptoParaLaProductividad;
	}

	public Integer getParaLaProductividad() {
		return ConceptoParaLaProductividad;
	}

	public void setParaLaProductividad(Integer paraLaProductividad) {
		this.ConceptoParaLaProductividad = paraLaProductividad;
	}

	public void calcularSueldo(Integer conceptoParaLaProductividad) {
		setSueldo(getSueldo()+conceptoParaLaProductividad);
		
	}

	
}
