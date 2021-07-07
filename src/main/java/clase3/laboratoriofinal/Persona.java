package clase3.laboratoriofinal;

import java.util.Random;

public class Persona {
	
	private Integer id;
	private String nombre;
	private String apellido;
	private Documento documento;
	private int edad;	
	
	private static int contador = 0;
	
	public Persona() {
		super();
		this.id = ++contador; // BOXING
	}

	public Persona(String nombre, String apellido, Documento documento, int edad) {
		super();
		this.id = ++contador;
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.edad = edad;
	}

	public Persona(String nombre, String apellido, Documento documento) {
		super();
		this.id = ++contador;
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.edad = asignarEdad();
	}
	
	
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento
				+ ", edad=" + edad + "]";
	}

	private int asignarEdad() {
		Random rn = new Random();
		return rn.nextInt(100);
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}	

}
