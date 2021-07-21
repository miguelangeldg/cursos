package clasee13.ordenamiento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<Persona> lista = new ArrayList();
		lista.add(new Persona(1, "juana", "perez"));
		lista.add(new Persona(2, "marcelo", "gonzalez"));
		lista.add(new Persona(3, "laura", "alvarez"));
		
		System.out.println("Ordenar por nombre");
		
//		Collections.sort(lista, new OrdenPorNombre());
//		
//		for (Persona p : lista) {
//			System.out.println(p);
//		}
				
		Comparator<Persona> ordenPorNombre = (Persona p1, Persona p2) -> p1.getNombre().compareTo(p2.getNombre());
		Collections.sort(lista, ordenPorNombre);
		lista.forEach( System.out::println );
		
		System.out.println("\nOrdenar por apellido");
		Comparator<Persona> ordenPorApellido = (Persona p1, Persona p2) -> p1.getApellido().compareTo(p2.getApellido());
		Collections.sort(lista, ordenPorApellido);
		lista.forEach(System.out::println);
		
	}

}
