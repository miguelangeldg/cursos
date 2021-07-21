package clasee13.ordenamiento;

import java.util.Comparator;

public class OrdenPorNombre implements Comparator<Persona> {

	@Override
	public int compare(Persona o1, Persona o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}

}
