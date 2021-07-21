package clasee13.filter;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class App2 {

	public static void main(String[] args) {
		
		Map<Integer, String> mapa = new HashMap<Integer, String>();
		mapa.put(1, "infobae.com");
		mapa.put(2, "La razon");
		
		String resultado = "";		
//		for (Entry<Integer, String> map : mapa.entrySet()) {
//			if(map.getValue().equals("infobae.com")) {
//				resultado += map.getValue();
//			}
//		}		
//		System.out.println(resultado);
		
		System.out.println("A partir de java 8");
		
		resultado = mapa.entrySet().stream().
				filter( x -> x.getValue().equals("infobae.com") ).
				map( x -> x.getValue() ).collect(Collectors.joining());
		
		System.out.println(resultado);
		
		
		Map<Integer, String> otroResultado = mapa.entrySet().stream().filter( x -> x.getKey() == 2)
				.collect( Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue) );
		
		System.out.println(otroResultado);

	}

}
