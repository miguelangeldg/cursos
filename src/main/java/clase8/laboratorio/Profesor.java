package clase8.laboratorio;

import java.util.Arrays;
import java.util.Date;

public class Profesor extends Empleado {
	
	private String[] cursos;
	
	
	public Profesor() {
		super();
	}
	
	
	public Profesor(String nombre, String apellido, Documento documento, Date fechaNacimiento, Date fechaCargo, double sueldo,
			String[] cursos) {
		super(nombre, apellido, documento, fechaNacimiento, fechaCargo, sueldo);
		this.cursos = cursos;
	}



	@Override
	public String toString() {
		return "Profesor [cursos=" + Arrays.toString(cursos) + "]";
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
		System.out.println(getApellido() + " soy un profesor");		
	}
	

}
