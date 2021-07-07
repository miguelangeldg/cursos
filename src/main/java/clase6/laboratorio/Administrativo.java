package clase6.laboratorio;

import java.util.Date;

public class Administrativo extends Empleado {
	
	public Administrativo() {
		super();
	}
	

	public Administrativo(String nombre, String apellido, Documento documento, Date fechaNacimiento, Date fechaCargo,
			double sueldo) {
		super(nombre, apellido, documento, fechaNacimiento, fechaCargo, sueldo);
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
		System.out.println(getApellido() + ", soy un administrativo");
	}

}
