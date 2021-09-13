package usal.dominio;

public class Precio {
	
	private int idPrecio;
	private String tipoTramite; //TODO: pasar a ENUM
	private double honorarios;
	private double sellados;
	
	public Precio() {}
	
	public int getIdPrecio() {
		return idPrecio;
	}

	public String getTipoTramite() {
		return tipoTramite;
	}

	public void setTipoTramite(String tipoTramite) {
		this.tipoTramite = tipoTramite;
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
	
	
}
