package usal.dominio;

import java.time.LocalTime;
import java.util.Date;

public class Turno {

	private int idTurno;
	private Usuario usuario;
	private Entidad entidad;
	private Date fecha;
	private LocalTime hora;
	
	public Turno() {}

	public int getIdTurno() {
		return idTurno;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Entidad getEntidad() {
		return entidad;
	}

	public void setEntidad(Entidad entidad) {
		this.entidad = entidad;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	
	
}
