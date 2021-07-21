package clasee13.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		
		List<String> nombres = Arrays.asList("octavio","juan","pedro","analia","maria");
		List<String> nomMayusculas = new ArrayList();
				
//		for (String n : nombres) {
//			nomMayusculas.add(n.toUpperCase());
//		}
		
//		System.out.println("Forma tradicional");
//		for (String n : nomMayusculas) {
//			System.out.print(n + ", ");
//		}		
		
		System.out.println("A partir de java 8");
		nomMayusculas = nombres.stream().map( (e) -> e.toUpperCase() ).collect(Collectors.toList() );		
				
		System.out.println("\n\nIteracion funcional");
		nomMayusculas.forEach( (e) -> System.out.print(e + ", ") );

	}

}
