package clase7.treemap;

import java.util.Map.Entry;
import java.util.TreeMap;

public class AppPersonaComparable {

	public static void main(String[] args) {
		
		TreeMap<Persona, Integer> personas = new TreeMap<>();
				
		Persona p1 = new Persona(1, "jose", "perez");
		Persona p2 = new Persona(2, "juan", "alvarez");
		Persona p3 = new Persona(3, "felipe", "gonzalez");
		
		personas.put(p1, 1);
		personas.put(p2, 2);
		personas.put(p3, 3);
		
		
		for (Entry<Persona, Integer> p : personas.entrySet()) {
			System.out.println("Apellido: " + p.getKey().getApellido() + ", Nombre: "  + p.getKey().getNombre()  + ", value: " + p.getValue());
		}
	}

}
