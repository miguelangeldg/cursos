package clasee13.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {

		List<String> nombres = Arrays.asList("octavio", "juan", "pedro", "analia", "maria");
		List<String> nomComienzan = new ArrayList();
		
//		System.out.println("En forma tradicional");
//		for (String n : nombres) {
//			if(n.startsWith("p")) {
//				nomComienzan.add(n);
//			}
//		}
//		
//		for (String n : nomComienzan) {
//			System.out.println(n);
//		}
		
		System.out.println("A partir de java 8");
		nomComienzan = nombres.stream().filter( (e) -> e.startsWith("p") ).collect(Collectors.toList());
		
		nomComienzan.forEach( (e) -> System.out.println(e) );
		

	}

}
