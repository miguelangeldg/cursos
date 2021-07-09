package clase9.laboratorio;

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
	public void mostrarTipoPersona() {
		System.out.println(getApellido() + ", soy un administrativo");
	}

}
