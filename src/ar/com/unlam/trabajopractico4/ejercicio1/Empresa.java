package ar.com.unlam.trabajopractico4.ejercicio1;

import java.util.HashSet;

public class Empresa {
	
	private HashSet<Empleado> empleados;
	private HashSet<Departamento> departamentos;
	
	public Empresa() {
		this.empleados = new HashSet<>();
		this.departamentos = new HashSet<>();
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

	public HashSet<Departamento> getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(HashSet<Departamento> departamentos) {
		this.departamentos = departamentos;
	}

	public void agregarDepartamento(Departamento departamentoRecursosHumanos) {
		this.departamentos.add(departamentoRecursosHumanos);
		
	}
}
