package clase2.laboratoriofinal;

import java.util.Random;

public class Persona {
	
	private String nombre;
	private String apellido;
	private Documento documento;
	private int edad;	
	
	
	public Persona() {
		super();
	}

	public Persona(String nombre, String apellido, Documento documento, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.edad = edad;
	}

	public Persona(String nombre, String apellido, Documento documento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.edad = asignarEdad();
	}
	
	
	private int asignarEdad() {
		Random rn = new Random();
		return rn.nextInt(100);
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
