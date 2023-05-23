package ar.com.unlam.trabajopractico4.ejercicio1;

import java.time.LocalDate;

public class Empleado {

	private String nombre;
	private String apellido;
	private Integer dni;
	private Integer sueldo;
	private LocalDate fechaDeNacimiento;

	public Empleado(String nombre, String apellido, Integer sueldo, LocalDate fechaDeNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.sueldo = sueldo;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getSueldo() {
		return sueldo;
	}

	public void setSueldo(Integer sueldo) {
		this.sueldo = sueldo;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

}
