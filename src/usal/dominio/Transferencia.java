package usal.dominio;

public class Transferencia extends MedioDePago{

	private int idTransferencia;
	private double monto;
	private String cuentaRemitente;
	private String nombreRemitente;
	private String apellidoRemitente;
	private String cuilRemitente;
	private String banco;
	
	public Transferencia() {}

	public int getIdTransferencia() {
		return idTransferencia;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public String getCuentaRemitente() {
		return cuentaRemitente;
	}

	public void setCuentaRemitente(String cuentaRemitente) {
		this.cuentaRemitente = cuentaRemitente;
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

	public String getCuilRemitente() {
		return cuilRemitente;
	}

	public void setCuilRemitente(String cuilRemitente) {
		this.cuilRemitente = cuilRemitente;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}
}
