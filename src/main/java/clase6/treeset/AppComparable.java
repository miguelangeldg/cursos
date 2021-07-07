package clase6.treeset;

import java.util.Set;
import java.util.TreeSet;

public class AppComparable {

	public static void main(String[] args) {
		
		Persona p1 = new Persona(1, "juan", "perez");
		Persona p2 = new Persona(2, "juan", "lopez");
		Persona p3 = new Persona(3, "felipe", "gonzalez");
		
		System.out.println(p1.compareTo(p2));
		
		Set<Persona> personas = new TreeSet<Persona>();
		personas.add(p3);
		personas.add(p1);
		personas.add(p2);
		
		for (Persona p : personas) {
			System.out.println(p.getDni() + " " + p.getNombre() + " " + p.getApellido());
		}
 
	}

}
