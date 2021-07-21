package clasee13.laboratorio;

import java.util.Comparator;

public class OrdenEdadDesc implements Comparator<Persona> {

	@Override
	public int compare(Persona persona1, Persona persona2) {
		return persona1.getFechaNacimiento().compareTo(persona2.getFechaNacimiento());
	}

}
