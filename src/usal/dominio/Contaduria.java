package usal.dominio;

import java.util.Date;

import usal.dominio.enums.TipoContaduria;

public class Contaduria {
	
	private int idContaduria;
	private Venta venta;
	private Date fecha;
	private double monto;
	private TipoContaduria motivo;
	private String descripcion;
}
