package clase3.herencia;

public class Camion extends Auto {

	private int ejes;
	private double capacidad;
		
	public Camion() {
		super();
	}	

	public Camion(String color, String marca, Patente patente, boolean encendido, int ejes, double capacidad) {
		super(color, marca, patente, encendido);
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
