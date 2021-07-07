package clase7.treemap;

public class Persona implements Comparable<Persona> {
	
	private Integer dni;
	private String nombre;
	private String apellido;		

	public Persona(Integer dni, String nombre, String apellido) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public int compareTo(Persona o) {
		return this.getApellido().compareTo(o.getApellido());
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
