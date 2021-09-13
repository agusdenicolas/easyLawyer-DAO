package usal.dominio;

import usal.dominio.enums.TipoUsuario;

public class Socio extends Usuario{
	
	public Socio() {
		super(TipoUsuario.SOCIO);
	}
}
