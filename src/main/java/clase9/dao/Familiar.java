package clase9.dao;

import java.util.Date;

public class Familiar extends Auto {
	
	private String categoria;
		
	public Familiar() {
		super();
	}


	public Familiar(String color, String marca, Patente patente, boolean encendido, String categoria) {
		super(color, marca, patente, encendido);
		this.categoria = categoria;
	}

	
	@Override
	public void vender() {
		System.out.println("vender familiar");
		
	}


	@Override
	public boolean reparar(Date fecha, String autoParte, String mecanico) {
		return true;
	}


	@Override
	public boolean cambioPiezas(Date fecha, String autoParte) {
		return true;
	}


	@Override
	public String cambioAceite(Date fecha, String autoParte, String marca, String tipo, double cantidad) {
		return "se cambio el aceite del auto familiar";
	}


	
	
	public String getCategoria() {
		return categoria;
	}
	
	
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}
