package clasee13.foreach;

import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<String> nombres = Arrays.asList("octavio","juan","pedro","analia","maria");
		
		System.out.println("Forma tradicional");
		for (String n : nombres) {
			System.out.print(n + ", ");
		}
		
		System.out.println("\n\nIteracion funcional");
		nombres.forEach( (e) -> System.out.print(e + ", ") );
	}

}
