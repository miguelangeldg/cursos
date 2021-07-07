package clase3.laboratoriofinal;

import java.util.Arrays;

public class Alumno extends Persona {
	
	private String[] cursos;
		

	public Alumno(String[] cursos) {
		super();
		this.cursos = cursos;
	}
	
	
	public Alumno(String nombre, String apellido, Documento documento, int edad, String[] cursos) {
		super(nombre, apellido, documento, edad);
		this.cursos = cursos;
	}


	@Override
	public String toString() {
		return "Alumno [" + super.toString() + "cursos=" + Arrays.toString(cursos) + "]";
	}


	public String[] getCursos() {
		return cursos;
	}

	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}
	
	

}
