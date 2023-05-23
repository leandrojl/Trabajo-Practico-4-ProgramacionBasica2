package ar.com.unlam.trabajopractico4.ejercicio1;

public class Vehiculo {
	
	private String marca;
	private String modelo;
	private String patente;
	
	public Vehiculo(String marca, String modelo, String patente) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.patente = patente;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	
	

}
