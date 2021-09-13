package usal.dominio.enums;

public enum TipoUsuario {
	
	SOCIO("Socio"), EMPLEADO("Empleado");
	
	private String tipoUsuario;
	
	private TipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
	public String getTipoUsuario() {
		return tipoUsuario;
	}
}
