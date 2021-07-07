package clase6.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class AppPersona {

	public static void main(String[] args) {
		
		List<Persona> personas = new ArrayList<Persona>();
		
//		Persona p1 = new Persona(1, "juan", "perez");
//		Persona p2 = new Persona(2, "juan", "lopez");
//		Persona p3 = new Persona(3, "felipe", "gonzalez");
//		
//		personas.add(p1);
//		personas.add(p2);
//		personas.add(p3);		
		
		personas.add(new Persona(1, "juan", "perez"));
		personas.add(new Persona(2, "juan", "lopez"));
		personas.add(new Persona(3, "felipe", "gonzalez"));
		
		ListIterator<Persona> it = personas.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());			
		}
		
		System.out.println();
		while(it.hasPrevious()) {
			System.out.println(it.previous());			
		}

	}

}
