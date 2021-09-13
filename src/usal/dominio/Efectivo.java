package usal.dominio;

public class Efectivo extends MedioDePago{
	
	private int idEfectivo;
	private double monto;
	private String nombreRemitente;
	private String apellidoRemitente;
	
	public Efectivo() {}

	public int getIdEfectivo() {
		return idEfectivo;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public String getNombreRemitente() {
		return nombreRemitente;
	}

	public void setNombreRemitente(String nombreRemitente) {
		this.nombreRemitente = nombreRemitente;
	}

	public String getApellidoRemitente() {
		return apellidoRemitente;
	}

	public void setApellidoRemitente(String apellidoRemitente) {
		this.apellidoRemitente = apellidoRemitente;
	}
}
