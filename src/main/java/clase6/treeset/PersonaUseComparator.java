package clase6.treeset;

public class PersonaUseComparator {
	
	private Integer dni;
	private String nombre;
	private String apellido;
		
	
	public PersonaUseComparator() {
		super();
	}


	public PersonaUseComparator(int dni, String nombre, String apellido) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
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
