package clase6.treeset;

import java.util.Set;
import java.util.TreeSet;

public class AppComparator {

	public static void main(String[] args) {
		
		PersonaUseComparator p1 = new PersonaUseComparator(1, "juan", "perez");
		PersonaUseComparator p2 = new PersonaUseComparator(2, "jose", "lopez");
		PersonaUseComparator p3 = new PersonaUseComparator(3, "felipe", "gonzalez");		
		
		Set<PersonaUseComparator> personas = new TreeSet<>( new OrdenPersona() );
		personas.add(p1);
		personas.add(p2);
		personas.add(p3);
		
		for (PersonaUseComparator p : personas) {
			System.out.println(p.getDni() + " " + p.getNombre() + " " + p.getApellido());
		}
 
	}

}
