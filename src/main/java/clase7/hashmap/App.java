package clase7.hashmap;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class App {

	public static void main(String[] args) {
		
		Map<Integer, String> nombres = new HashMap<Integer, String>();
		AbstractMap<Integer, String> nombresA = new HashMap<Integer, String>();
		
		nombres.put(2, "mariana");
		nombres.put(4, "sebastian");
		nombres.put(5, "sabrina");
		nombres.put(1, "octavio");
		nombres.put(3, "analia");
		
		nombres.put(5, "macarena");
		
		System.out.println(nombres.get(1));
		
		Collection<String> c =  nombres.values();
		 
		System.out.println(c);
		
		nombresA.putAll(nombres);
		
		System.out.println(nombres.containsKey(3));
		
		System.out.println(nombres.keySet());
		
		
		Iterator<Integer> ite = nombres.keySet().iterator(); // obtenemos el iterador a partir del set que contiene las keys
		
		while(ite.hasNext()) {
			Integer key = ite.next();
			System.out.println("key: " + key + ", value: " + nombres.get(key));
		}
		
		
		for (Entry<Integer, String> e : nombres.entrySet()) {
			System.out.println("key: " + e.getKey() + ", value: " +  e.getValue());
		}
		
	}

}
