package usal.dominio;

public class Entidad {

	private int idEntidad;
	private Direccion direccion;
	private String nombre;

	public Entidad() {}

	public int getIdEntidad() {
		return idEntidad;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}