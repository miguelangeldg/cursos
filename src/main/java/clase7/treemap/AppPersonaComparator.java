package clase7.treemap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class AppPersonaComparator {

	public static void main(String[] args) {
		
		Map<PersonaComparator, Integer> personas = new TreeMap<PersonaComparator, Integer>( new OrdenObjetosPersona());
		
		PersonaComparator p1 = new PersonaComparator(1, "jose", "perez");
		PersonaComparator p2 = new PersonaComparator(2, "juan", "alvarez");
		PersonaComparator p3 = new PersonaComparator(3, "felipe", "gonzalez");
		
		personas.put(p1, 1);
		personas.put(p2, 2);
		personas.put(p3, 3);	
		
		for (Entry<PersonaComparator, Integer> p : personas.entrySet()) {
			System.out.println("Apellido: " + p.getKey().getApellido() + ", Nombre: "  + p.getKey().getNombre()  + ", value: " + p.getValue());
		}
		
	}

}
