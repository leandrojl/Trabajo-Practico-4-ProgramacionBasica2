package ar.com.unlam.trabajopractico4.ejercicio1;
import java.time.LocalDate;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestGestionEmpleadosEjercicio1 {

	/*
	 *  Se desea desarrollar un software para la gesti�n de los empleados de una empresa. Para
		cada empleado se desea conocer el nombre, apellido, salario y fecha de nacimiento.
		Como la empresa est� organizada en forma de departamentos, tambi�n se debe conocer
		el gerente encargado de cada uno de ellos. Adicionalmente, los gerentes cuentan con la
		posibilidad de tener una cochera en donde estacionar sus veh�culos.
		Tambi�n se cuenta con un manejo especial para aquellos empleados de tipo �Ingenieros�,
		dado que su salario base se ve afectado por un concepto adicional denominado �para la
		productividad�.
		Por �ltimo, se encuentran los directores quienes adem�s de tener su cochera, poseen un
		�sueldo extra� producto de tener la responsabilidad de ser directivo de la empresa. */
	
	@Test
	public void dadoQueTengoUnaEmpresaConEmpleados() {
		Empresa empresa = new Empresa();
		Empleado empleado1 = new Empleado("Leandro", "Girafales",12000000, 30000, LocalDate.of(1990, 5, 15));
		Empleado empleado2 = new Empleado("Juan", "Perez", 13000000,300000, LocalDate.of(1978, 5, 15));
		
		empresa.agregarEmpleado(empleado1);
		empresa.agregarEmpleado(empleado2);
		
		Assert.assertTrue(empresa.getEmpleados().size() == 2);
	}
	
	@Test
	public void queUnaEmpresaTengaUnDepartamentoConEmpleadosYGerenteAsignado() {
		Empresa empresa = new Empresa();
		
		Empleado empleado1 = new Empleado("Leandro", "Girafales", 12000000,30000, LocalDate.of(1990, 5, 15));
		Empleado empleado2 = new Empleado("Juan", "Perez", 13000000,300000, LocalDate.of(1978, 5, 15));
		
		Gerente gerente = new Gerente("Jose", "Girafales", 15000000,300000, LocalDate.of(1960, 5, 15));
		
		Departamento departamentoRecursosHumanos = new Departamento("Recursos Humanos");
		
		empresa.agregarDepartamento(departamentoRecursosHumanos);
		
		departamentoRecursosHumanos.agregarEmpleado(empleado1);
		departamentoRecursosHumanos.agregarEmpleado(empleado2);
		departamentoRecursosHumanos.setGerente(gerente);
		
		Assert.assertTrue(empresa.getDepartamentos().contains(departamentoRecursosHumanos));
		Assert.assertTrue(departamentoRecursosHumanos.getEmpleados().size() == 2);
		Assert.assertEquals(gerente, departamentoRecursosHumanos.getGerente());
		
		
	}
	
	@Test
	public void queElGerenteTengaUnaCocheraParaGuardarSuVehiculo() {
		Gerente gerente = new Gerente("Jose", "Girafales", 18000000, 300000, LocalDate.of(1960, 5, 15));
		
		Vehiculo auto = new Vehiculo("Ford", "Fiesta", "AB312OL");
		
		gerente.asignarCochera(auto);
		
		Assert.assertEquals(auto, gerente.getCochera());
		
	}
	
	@Test
	public void queUnEmpleadoDeTipoIngenieroTengaSuSalarioAfectadoPorUnConceptoDenominadoParaLaProductividad() {
		Ingeniero ingeniero = new Ingeniero("Jose", "Girafales", 18000000, 300000, LocalDate.of(1960, 5, 15));
		
		Integer conceptoParaLaProductividad = 20000;
		
		Integer valorEsperado = 320000;
		
		ingeniero.calcularSueldo(conceptoParaLaProductividad);
		
		Assert.assertEquals(valorEsperado, ingeniero.getSueldo());
		
	}
	
	@Test
	public void queUnDirectorTengaCocheraYPoseaUnSueldoExtra() {
		Director director = new Director("Jose", "Girafales", 20000000, 500000, LocalDate.of(1960, 5, 15));
		Vehiculo auto = new Vehiculo("Ford", "Fiesta", "AB312OL");
		Integer sueldoExtra = 50000;
		
		Integer valorEsperado = 550000;
		
		director.calcularSueldo(sueldoExtra);
		director.asignarVehiculo(auto);
		
		Assert.assertEquals(valorEsperado, director.getSueldo());
		Assert.assertEquals(auto, director.getCochera());
	}
	
	@Test
	public void queNoSePuedanAgregarDosEmpleadosConMismoDniAlDepartamento() {
		
		Empleado empleado1 = new Empleado("Leandro", "Girafales", 12000000,30000, LocalDate.of(1990, 5, 15));
		Empleado empleado2 = new Empleado("Juan", "Perez", 12000000,300000, LocalDate.of(1978, 5, 15));
		
		Departamento departamentoRecursosHumanos = new Departamento("Recursos Humanos");
		
		
		departamentoRecursosHumanos.agregarEmpleado(empleado1);
		departamentoRecursosHumanos.agregarEmpleado(empleado2);


		Assert.assertTrue(departamentoRecursosHumanos.getEmpleados().size()==1);
		
		
	}


}
