package clase6.treeset;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ObjetosBasicos {

	public static void main(String[] args) {
		
		Set<String> nombresA = new TreeSet<String>();
		AbstractSet<String> nombresB = new TreeSet<String>();
		SortedSet<String> nombresC = new TreeSet<String>();
		
		nombresA.add("mariana");//agrega un elemento
		nombresA.add("analia");
		
		nombresC.add("octavio");
		nombresC.add("jose");
		nombresC.add("jose");// la interfaz set no admite duplicados
		
		nombresB.addAll(nombresA);//agrega una coleccion
		nombresB.addAll(nombresC);
		
		System.out.println( nombresB.contains("sabriana") );// verifica si contiene el valor
		
		System.out.println( nombresA.equals(nombresC)); // verifica si son iguales
		
		nombresB.remove("mariana"); //remueve un elemento
		
		nombresB.removeAll(nombresA);//remueve todos
		
		System.out.println(nombresB.size());//devuelve el tamanio
		
		Object[] objetos = nombresB.toArray();//devuelve un array de objetos
		for (Object o : objetos) {
			System.out.println(o);
		}
		
		Iterator<String> it = nombresB.iterator();//devuelve un iterator
		
		while(it.hasNext()) {//devuelve true si tiene elementos
			System.out.println(it.next());//devuelve el siguiente elemento			
		}
		
		nombresB.clear();//limpia la coleccion
		
		System.out.println(nombresB.isEmpty());//devuelve true si esta vacia		
		
	}

}
