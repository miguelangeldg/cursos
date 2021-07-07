package clase5.laboratorio;

import java.util.Date;

public class Director extends Empleado {
	
	private String carrera;		

	public Director() {
		super();
	}	

	public Director(String nombre, String apellido, Documento documento, Date fechaNacimiento, Date fechaCargo, double sueldo,
			String carrera) {
		super(nombre, apellido, documento, fechaNacimiento, fechaCargo, sueldo);
		this.carrera = carrera;
	}
	

	@Override
	public String toString() {
		return "Director [" + super.toString() + ", carrera=" + carrera + "]";
	}

	
	/**IMPLEMENTA LOS METODOS DEFINIDOS EN LA INTERFAZ PERSISTENCIA*/
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
		System.out.println(this.getApellido() + " soy un director");
	}
	
	

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	

}
