package clasee13.reduce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<String> nombres = Arrays.asList("octavio", "juan", "pedro", "analia", "maria");
		String cadenaNombres = "";
		
//		System.out.println("Antes de java 8");
//		for (String n : nombres) {
//			cadenaNombres += n + ", ";
//		}
//		
//		System.out.println(cadenaNombres);
		
		
		System.out.println("A partir de java 8");
		cadenaNombres = nombres.stream().reduce("", (a, b) -> a + " " + b);
		
		System.out.println(cadenaNombres);
		

	}

}
