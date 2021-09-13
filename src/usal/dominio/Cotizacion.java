package usal.dominio;

import java.util.Date;

public class Cotizacion {
	
	private int idCotizacion;
	private Precio precio;
	private Localidad localidad;
	private Cliente cliente;
	private Date fecha;
	private double montoTotal;
	
	public Cotizacion() {}

	public int getIdCotizacion() {
		return idCotizacion;
	}

	public Precio getPrecio() {
		return precio;
	}

	public void setPrecio(Precio precio) {
		this.precio = precio;
	}

	public Localidad getLocalidad() {
		return localidad;
	}

	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(double montoTotal) {
		this.montoTotal = montoTotal;
	}
}
