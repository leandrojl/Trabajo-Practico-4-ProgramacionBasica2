package ar.com.unlam.trabajopractico4.ejercicio1;

import java.util.HashSet;

public class Empresa {
	
	private HashSet<Empleado> empleados;
	
	public Empresa() {
		this.empleados = new HashSet<>();
	}

	public void agregarEmpleado(Empleado empleado) {
		empleados.add(empleado);
		
	}

	public HashSet<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(HashSet<Empleado> empleados) {
		this.empleados = empleados;
	}
}
