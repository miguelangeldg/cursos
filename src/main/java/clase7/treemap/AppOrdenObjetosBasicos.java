package clase7.treemap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class AppOrdenObjetosBasicos {

	public static void main(String[] args) {
		
		Map<Integer, String> nombres = new TreeMap<Integer, String>(new OrdenObjetosBasicos());
		
		nombres.put(2, "mariana");
		nombres.put(4, "sebastian");
		nombres.put(5, "sabrina");
		nombres.put(1, "octavio");
		nombres.put(3, "analia");		
		
		for (Entry<Integer, String> e : nombres.entrySet()) {
			System.out.println("key: " + e.getKey() + ", value: " +  e.getValue());
		}
		
	}

}
