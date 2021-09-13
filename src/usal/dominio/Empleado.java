package usal.dominio;

import usal.dominio.enums.TipoUsuario;

public class Empleado extends Usuario{

	public Empleado() {
		super(TipoUsuario.EMPLEADO);
	}
}
