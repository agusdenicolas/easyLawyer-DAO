package usal.dominio.enums;

public enum TipoContaduria {

	INGRESO("Ingreso"), EGRESO("Egreso");
	
	private String tipoContaduria;
	
	private TipoContaduria(String tipoContaduria) {
		this.tipoContaduria = tipoContaduria;
	}
	
	public String getTipoContaduria() {
		return tipoContaduria;
	}
}
