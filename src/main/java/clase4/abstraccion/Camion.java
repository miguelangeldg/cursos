package clase4.abstraccion;

import java.util.Date;

public class Camion extends Transporte {

	private int ejes;
	private double capacidad;
		
	public Camion() {
		super();
	}		
		
	
	public Camion(String color, String marca, Patente patente, boolean encendido, String licencia, String tipo,
			int ejes, double capacidad) {
		super(color, marca, patente, encendido, licencia, tipo);
		this.ejes = ejes;
		this.capacidad = capacidad;
	}


	@Override
	public String toString() {
		return "Camion [ejes=" + ejes + ", capacidad=" + capacidad + ", " +  super.toString() + "]";
	}

	@Override
	public void guardar() {
		System.out.println("Guardar un camion");
	}
	
	@Override
	public void vender() {
		System.out.println("Venta del camion");		
	}
	
	
	@Override
	public boolean reparar(Date fecha, String autoParte, String mecanico) {
		return false;
	}


	@Override
	public boolean cambioPiezas(Date fecha, String autoParte) {
		return false;
	}


	@Override
	public String cambioAceite(Date fecha, String autoParte, String marca, String tipo, double cantidad) {
		return "se realizo un cambio de aceite en el camion";
	}

	
	
	
	/*GETTERS AND SETTERS*/
	public int getEjes() {
		return ejes;
	}


	public void setEjes(int ejes) {
		this.ejes = ejes;
	}


	public double getCapacidad() {
		return capacidad;
	}


	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}
	
}
