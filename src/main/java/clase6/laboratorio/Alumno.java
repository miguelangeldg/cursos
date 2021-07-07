package clase6.laboratorio;

import java.util.Arrays;
import java.util.Date;

public class Alumno extends Persona {
	
	private String[] cursos;
		

	public Alumno(String[] cursos) {
		super();
		this.cursos = cursos;
	}
	
	
	public Alumno(String nombre, String apellido, Documento documento, Date fechaNacimiento, String[] cursos) {
		super(nombre, apellido, documento, fechaNacimiento);
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


	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void modificar() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mostrarTipoPersona() {
		System.out.println(this.getApellido() + ", soy un alumno");		
	}
	
	

}
