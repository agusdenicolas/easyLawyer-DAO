package usal.dominio;

import usal.dominio.enums.Provincia;
import usal.dominio.enums.Zona;

public class Localidad {
	
	private int idLocalidad;
	private String localidad;
	private Provincia provincia;
	private Zona zona;
	private double valor;
	
	public Localidad() {}

	public int getIdLocalidad() {
		return idLocalidad;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	
	public Provincia getProvincia() {
		return provincia;
	}
	
	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public Zona getZona() {
		return zona;
	}

	public void setZona(Zona zona) {
		this.zona = zona;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
