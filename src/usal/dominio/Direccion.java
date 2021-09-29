package usal.dominio;

import usal.dominio.enums.Provincia;

public class Direccion {
	
	private int idDireccion;
	private Provincia provincia;
	private String calle;
	private int numero;
	
	public Direccion() {}
	
	public Direccion(Provincia provincia, String calle, int numero) {
		super();
		this.provincia = provincia;
		this.calle = calle;
		this.numero = numero;
	}
	//TODO: BORRAR ESTE SETER DE ID
	public void setIdDireccion(int idDireccion) {
		this.idDireccion = idDireccion;
	}

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