package usal.dominio;

import usal.dominio.enums.TipoUsuario;

public abstract class Usuario {  //TODO: hacer clase abstracta y crear clases hijas "Socio" y "Empleado"
	
	private int idUsuario;
	private String usuario;
	private String contrasena;
	private String nombre;
	private String apellido;
	private String mail;
	private String dni;
	private TipoUsuario tipoUsuario;
	private boolean estado;
	
	public Usuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
}
