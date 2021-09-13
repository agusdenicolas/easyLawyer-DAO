package usal.dominio;

import java.util.Date;

public class Recibo {

	private int idRecibo;
	private Venta venta;
	private MedioDePago medioDePago; //Pudiendo ser en Efectivo o Transferencia
	private Date fecha;
	
	public Recibo() {}
	
	public int getIdRecibo() {
		return idRecibo;
	}

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}

	public MedioDePago getMedioDePago() {
		return medioDePago;
	}

	public void setMedioDePago(MedioDePago medioDePago) {
		this.medioDePago = medioDePago;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
}
