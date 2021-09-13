package usal.dominio;

public abstract class MedioDePago {
	
	private int idMedioDePago;
	private Transferencia transferencia;
	private Efectivo efectivo;
	
	public MedioDePago() {}
	
	public int getIdMedioDePago() {
		return idMedioDePago;
	}

	public Transferencia getTransferencia() {
		return transferencia;
	}

	public void setTransferencia(Transferencia transferencia) {
		this.transferencia = transferencia;
	}

	public Efectivo getEfectivo() {
		return efectivo;
	}

	public void setEfectivo(Efectivo efectivo) {
		this.efectivo = efectivo;
	}
	
}
