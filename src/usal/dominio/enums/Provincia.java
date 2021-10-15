package usal.dominio.enums;

public enum Provincia {
	
	CABA(1, "Capital Federal"),
	BSAS(2, "Buenos Aires"),
	CATAMARCA(3, "Catamarca"),
	CHACO(4, "Chaco"),
	CHUBUT(5, "Chubut"),
	CORDOBA(6, "Cordoba"),
	CORRIENTES(7, "Corrientes"),
	ENTRE_RIOS(8, "Entre Rios"),
	FORMOSA(9, "Formosa"),
	JUJUY(10, "Jujuy"),
	LA_PAMPA(11, "La Pampa"),
	LA_RIOJA(12, "La Rioja"),
	MENDOZA(13, "Mendoza"),
	MISIONES(14, "Misiones"),
	NEUQUEN(15, "Neuquen"),
	RIO_NEGRO(16, "Rio Negro"),
	SALTA(17, "Salta"),
	SAN_JUAN(18, "San Juan"),
	SAN_LUIS(19, "San Luis"),
	SANTA_CRUZ(20, "Santa Cruz"),
	SANTA_FE(21, "Santa Fe"),
	SANTIAGO_DEL_ESTERO(22, "Santiago del Estero"),
	TIERRA_DEL_FUEGO(23, "Tierra del Fuego"),
	TUCUMAN(24, "Tucuman");
	
	private int idProvincia;
	private String nombreProvincia;
	
	private Provincia(int idProvincia, String nombreProvincia) {
		this.idProvincia = idProvincia;
		this.nombreProvincia = nombreProvincia;
	}
	
	public int getIdProvincia() {
		return idProvincia;
	}
	
	public String getNombreProvincia() {
		return nombreProvincia;
	}
	
	//Busca segun nombre de provincia y si coincide devuelve el Enum; Metodo strip() saca espacios en blanco del principio y final 
	public static Provincia getProvincia(String p) {
		for (Provincia x: Provincia.values()) {
			if(x.getNombreProvincia().equalsIgnoreCase(p.strip())) { 
				return x;
			}
		}
		return null;
	}
}