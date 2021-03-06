package clase7.laboratorio;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public abstract class Persona implements Persistencia {

	private Integer id;
	private String nombre;
	private String apellido;
	private Documento documento;
	private Date fechaNacimiento;

	private static int contador = 0;

	public Persona() {
		super();
		this.id = ++contador; // BOXING
	}

	public Persona(String nombre, String apellido, Documento documento, Date fechaNacimiento) {
		super();
		this.id = ++contador;
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.fechaNacimiento = fechaNacimiento;
	}

	/** METODO ABSTRACTO */
	public abstract void mostrarTipoPersona();

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento
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
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
