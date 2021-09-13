package usal.dominio;

import java.util.Date;

public class Resumen {
	
	//TODO: Relacionar esta clase con la que corresponda...
	private Date fecha; //Date format(mm-yy) -> mes-año
	private double resumen; // resumen = Activo - Pasivo. Patrimonio neto de ese mes en el estudio
	
	public Resumen() {}
	
	public Date getFecha() {
		return fecha;
	}
	
	public double getResumen() {
		return resumen;
	}
	
	public void setResumen(double resumen) {
		this.resumen = resumen;
	}
}
