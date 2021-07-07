package clase6.treeset;

import java.util.Comparator;

public class OrdenPersona implements Comparator<PersonaUseComparator>{

	@Override
	public int compare(PersonaUseComparator o1, PersonaUseComparator o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}

}
