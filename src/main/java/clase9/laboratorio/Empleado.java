package clase9.laboratorio;

import java.util.Date;

public abstract class Empleado extends Persona {

	private Date fechaCargo;
	private double sueldo;
	
	public Empleado() {
		super();
	}

	public Empleado(String nombre, String apellido, Documento documento, Date fechaNacimiento, Date fechaCargo, double sueldo) {
		super(nombre, apellido, documento, fechaNacimiento);
		this.fechaCargo = fechaCargo;
		this.sueldo = sueldo;
	}	
	

	@Override
	public String toString() {
		return "Empleado [" + super.toString() +  ", fechaCargo=" + fechaCargo + ", sueldo=" + sueldo + "]";
	}

	public Date getFechaCargo() {
		return fechaCargo;
	}

	public void setFechaCargo(Date fechaCargo) {
		this.fechaCargo = fechaCargo;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	
	
}
