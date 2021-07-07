package clase6.linkedhashset;

import java.util.AbstractSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ObjetosBasicos {

	public static void main(String[] args) {
		
		Set<String> nombresA = new LinkedHashSet<String>();
		AbstractSet<String> nombresB = new LinkedHashSet<String>();
		HashSet<String> nombresC = new LinkedHashSet<String>();
		
		nombresA.add("mariana");//agrega un elemento
		nombresA.add("analia");
		
		nombresC.add("octavio");
		nombresC.add("jose");
		nombresC.add("jose");
		
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
