package usal.dominio;

import java.util.Date;

public class Tramite {

	private int idTramite;
	private Cliente cliente;
	private Localidad localidadADiligenciar;
	private Date fechaLlegada; //Cuando llega el tramite a la oficina
	private String tipoDeTramite; //TODO: pasar a ENUM -> Tipo de Tramite
	private String expediente;
	private String observaciones;
	private double honorarios; //TODO: reemplazar por "Cotizacion"
	private double sellados;
	private double precioTotal; 
	private double montoPagado;
	private String estado;	//TODO: pasar a ENUM -> Estado
	
	public Tramite() {}
	
	public int getIdTramite() {
		return idTramite;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Localidad getLocalidadADiligenciar() {
		return localidadADiligenciar;
	}

	public void setLocalidadADiligenciar(Localidad localidadADiligenciar) {
		this.localidadADiligenciar = localidadADiligenciar;
	}

	public Date getFechaLlegada() {
		return fechaLlegada;
	}

	public void setFechaLlegada(Date fechaLlegada) {
		this.fechaLlegada = fechaLlegada;
	}

	public String getTipoDeTramite() {
		return tipoDeTramite;
	}

	public void setTipoDeTramite(String tipoDeTramite) {
		this.tipoDeTramite = tipoDeTramite;
	}

	public String getExpediente() {
		return expediente;
	}

	public void setExpediente(String expediente) {
		this.expediente = expediente;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public double getHonorarios() {
		return honorarios;
	}

	public void setHonorarios(double honorarios) {
		this.honorarios = honorarios;
	}

	public double getSellados() {
		return sellados;
	}

	public void setSellados(double sellados) {
		this.sellados = sellados;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}

	public double getMontoPagado() {
		return montoPagado;
	}

	public void setMontoPagado(double montoPagado) {
		this.montoPagado = montoPagado;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}
