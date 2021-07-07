package clase7.treemap;

import java.util.Comparator;

public class OrdenObjetosPersona implements Comparator<PersonaComparator>{

	@Override
	public int compare(PersonaComparator p1, PersonaComparator p2) {
		return p1.getApellido().compareTo(p2.getApellido());
	}

}
