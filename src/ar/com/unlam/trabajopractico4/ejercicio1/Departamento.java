package ar.com.unlam.trabajopractico4.ejercicio1;

import java.util.HashSet;

public class Departamento {
	
	private String nombre;
	private Gerente gerente;
	private HashSet<Empleado> empleados;
	
	public Departamento(String nombre) {
		this.nombre = nombre;
		this.empleados = new HashSet<Empleado>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public HashSet<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(HashSet<Empleado> empleados) {
		this.empleados = empleados;
	}

	public Gerente getGerente() {
		return gerente;
	}

	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}

	public void agregarEmpleado(Empleado empleado) {
		this.empleados.add(empleado);
		
	}
	
	

}
