package usal.dominio;

import usal.dominio.enums.Provincia;

public class Direccion {
	
	private int idDireccion;
	private Provincia provincia;
	private String calle;
	private int numero;
	
	public Direccion() {}

	public int getIdDireccion() {
		return idDireccion;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}