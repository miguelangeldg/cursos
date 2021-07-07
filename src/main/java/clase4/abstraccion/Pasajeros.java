package clase4.abstraccion;

import java.util.Date;

public class Pasajeros extends Transporte {
	
	private Boolean accesoEspecial;
	

	public Pasajeros() {
		super();
	}


	public Pasajeros(String color, String marca, Patente patente, boolean encendido, String licencia, String tipo,
			Boolean accesoEspecial) {
		super(color, marca, patente, encendido, licencia, tipo);
		this.accesoEspecial = accesoEspecial;
	}


	@Override
	public void vender() {
		System.out.println("Venta de transporte pasajeros");
	}
	
	@Override
	public boolean reparar(Date fecha, String autoParte, String mecanico) {
		return true;
	}


	@Override
	public boolean cambioPiezas(Date fecha, String autoParte) {
		return false;
	}


	@Override
	public String cambioAceite(Date fecha, String autoParte, String marca, String tipo, double cantidad) {
		return "se realizo un cambio de aceite en el transporte de pasajeros";
	}


	public Boolean getAccesoEspecial() {
		return accesoEspecial;
	}


	public void setAccesoEspecial(Boolean accesoEspecial) {
		this.accesoEspecial = accesoEspecial;
	}

	

}
