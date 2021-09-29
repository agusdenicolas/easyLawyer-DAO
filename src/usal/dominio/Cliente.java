package usal.dominio;

public class Cliente {
	
	private int idCliente;
	private String nombre;
	private String apellido;
	private String cuit;
	private Direccion direccion;
	private String mail;
	private String celular;
	private int estado;
	
	public Cliente() {}
	
	

	public Cliente(String nombre, String apellido, String cuit, Direccion direccion, String mail, String celular, int estado) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuit = cuit;
		this.direccion = direccion;
		this.mail = mail;
		this.celular = celular;
		this.estado = estado;
	}
	
	//TODO: Borrar este Seter de id
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public int getEstado() {
		return estado;
	}
	
	public void setEstado(int estado) {
		this.estado = estado;
	}
}
