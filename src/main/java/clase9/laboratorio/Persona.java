package clase9.laboratorio;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public abstract class Persona {
	
	private String nombre;
	private String apellido;
	private Documento documento;
	private Date fechaNacimiento;		
	
	public Persona() {
		super();
	}

	public Persona(String nombre, String apellido, Documento documento, Date fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	/**METODO ABSTRACTO*/
	public abstract void mostrarTipoPersona();
	
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento
				+ ", edad=" + calcularEdad() + "]";
	}
	

	/**
	 * java.time.LocalDate
	 * @return edad
	 */
	private int calcularEdad() {
		int edad = 0;
		Period p = Period.between(convertToLocalDate(fechaNacimiento), LocalDate.now());
		edad = p.getYears();
		return edad;
	}

	/**
	 * Convierte java.util.Date --> java.time.LocalDate
	 * 
	 * @param fecha
	 * @return LocalDate
	 */
	private static LocalDate convertToLocalDate(Date fecha) {
		return fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	}

	/**
	 * java.util.Date
	 * @return Edad
	 */
	private int calcularEdad2() {
		int edad = 0;
		Date fechaActual = new Date();
		long difMilisengundos = fechaActual.getTime() - fechaNacimiento.getTime();
		edad = (int) (difMilisengundos / 3.154e+10); // (3.154e+10 -> un anio en milisegundos)
		return edad;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	
}
