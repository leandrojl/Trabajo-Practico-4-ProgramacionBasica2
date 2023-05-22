package ar.com.unlam.trabajopractico4.ejercicio1;
import java.time.LocalDate;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestGestionEmpleadosEjercicio1 {

	/*
	 *  Se desea desarrollar un software para la gestión de los empleados de una empresa. Para
		cada empleado se desea conocer el nombre, apellido, salario y fecha de nacimiento.
		Como la empresa está organizada en forma de departamentos, también se debe conocer
		el gerente encargado de cada uno de ellos. Adicionalmente, los gerentes cuentan con la
		posibilidad de tener una cochera en donde estacionar sus vehículos.
		También se cuenta con un manejo especial para aquellos empleados de tipo “Ingenieros”,
		dado que su salario base se ve afectado por un concepto adicional denominado “para la
		productividad”.
		Por último, se encuentran los directores quienes además de tener su cochera, poseen un
		“sueldo extra” producto de tener la responsabilidad de ser directivo de la empresa. */
	
	@Test
	public void dadoQueTengoUnaEmpresaConEmpleados() {
		Empresa empresa = new Empresa();
		Empleado empleado1 = new Empleado("Leandro", "Girafales", 30000, LocalDate.of(1990, 5, 15));
		Empleado empleado2 = new Empleado("Juan", "Perez", 300000, LocalDate.of(1978, 5, 15));
		
		empresa.agregarEmpleado(empleado1);
		empresa.agregarEmpleado(empleado2);
		
		Assert.assertTrue(empresa.getEmpleados().size() == 2);
	}

}
