package clase3.laboratoriofinal;

public class Profesor extends Persona {
	
	private double pago;
	
	
	public Profesor() {
		super();
	}


	public Profesor(String nombre, String apellido, Documento documento, double pago) {
		super(nombre, apellido, documento);
		this.pago = pago;
	}


	public Profesor(String nombre, String apellido, Documento documento, int edad, double pago) {
		super(nombre, apellido, documento, edad);
		this.pago = pago;
	}

	
	
	@Override
	public String toString() {
		return "Profesor [" + super.toString() + "pago=" + pago + "]";
	}


	public double getPago() {
		return pago;
	}


	public void setPago(double pago) {
		this.pago = pago;
	}

	
	
	

}
