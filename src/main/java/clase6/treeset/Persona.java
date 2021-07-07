package clase6.treeset;

public class Persona implements Comparable<Persona> {
	
	private Integer dni;
	private String nombre;
	private String apellido;
		
	
	public Persona() {
		super();
	}


	public Persona(int dni, String nombre, String apellido) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	/**
	 * 0   si this == o
	 * +1  si this >  o
	 * -1  si this <  o
	 */
	@Override
	public int compareTo(Persona o) {
		return this.getNombre().compareTo(o.getNombre());
	}
	
	

	public Integer getDni() {
		return dni;
	}


	public void setDni(Integer dni) {
		this.dni = dni;
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


	
	

}
