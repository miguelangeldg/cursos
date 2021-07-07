package clase6.arraylist;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ObjetosBasicosArrayList {

	public static void main(String[] args) {

		List<String> nombresA = new ArrayList<String>();
		AbstractList<String> nombresB = new ArrayList<String>();
		ArrayList<String> nombresC = new ArrayList<String>();
		
		nombresA.add("mariana");
		nombresA.add("analia");
		
		nombresC.add("octavio");
		nombresC.add("jose");
		nombresC.add("jose");
		
		nombresB.addAll(nombresA);
		nombresB.addAll(nombresC);
		
		System.out.println( nombresB.contains("sabriana") );
		
		System.out.println( nombresA.equals(nombresC)); 
		
		nombresB.remove("mariana"); 
		
		nombresB.removeAll(nombresA);
		
		System.out.println(nombresB.size());
		
		Object[] objetos = nombresB.toArray();
		for (Object o : objetos) {
			System.out.println(o);
		}
		
		Iterator<String> it = nombresB.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());		
		}
		
		nombresB.clear();
		
		System.out.println(nombresB.isEmpty());			
		
		if (nombresB.isEmpty()) {
			nombresB.addAll(nombresA);
			nombresB.addAll(nombresC);
		}		
		

		System.out.println("ArrayList con Metodos de List y AbstractList");
		
		nombresB.add(1, "lautaro");
		
		for (int i = 0; i < nombresB.size(); i++) {
			System.out.println(nombresB.get(i));
		}
		
		nombresB.set(0, "ariel");
		
		System.out.println(nombresB.remove(2));
		
		System.out.println(nombresB.indexOf("jose"));
		
		System.out.println(nombresB.lastIndexOf("jose"));
		
		List<String> subLista = nombresB.subList(1, 3);
		
		
		ListIterator<String> iteradorLista = subLista.listIterator();
		
		while (iteradorLista.hasNext()) {
			
			String nombre = iteradorLista.next();

			if (nombre.equals("lautaro")) {
				iteradorLista.remove();
			}

			if (nombre.equals("octavio")) {
				iteradorLista.set("fabian");
			}
			
		}

		
		while (iteradorLista.hasPrevious()) {
			
			String nombre = iteradorLista.previous();
			
			if (nombre.equals("fabian")) {
				iteradorLista.add("laura");
			}
			
		}

	}

}
