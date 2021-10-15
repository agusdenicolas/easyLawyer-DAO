package usal.dominio;

import usal.dominio.enums.Provincia;

public class Direccion {
	
	private Provincia provincia;
	private String calle;
	private String numero;
	
	public Direccion() {}
	
	public Direccion(Provincia provincia, String calle, String numero) {
		this.provincia = provincia;
		this.calle = calle;
		this.numero = numero;
	}
	
	public static Direccion convertirDireccion(String d) {
		Direccion direccion = new Direccion();
		
		if (d != null) {	
			String [] aux = d.split(",[\s]");
			
			//Calculo el ultimo " " para poder separar el nombre de la calle con el numero
			int i = aux[0].lastIndexOf(" ");
			
			direccion.setCalle(aux[0].substring(0, i).trim());
			direccion.setNumero(aux[0].substring(i, aux[0].length()).trim());
			direccion.setProvincia(Provincia.getProvincia(aux[1]));
		}
		
		return direccion;
	}
	
	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return calle + " " + numero + ", " + provincia.getNombreProvincia();
	}
	
	
}