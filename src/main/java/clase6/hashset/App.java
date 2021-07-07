package clase6.hashset;

import java.util.HashSet;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		
		Set<String> meses = new HashSet<String>();
		
		meses.add("enero");
		meses.add("febrero");
		meses.add("marzo");
		meses.add("abril");
		meses.add("mayo");
		meses.add("junio");
		meses.add("julio");
		meses.add("agosto");
		meses.add("septiembre");
		meses.add("octubre");
		meses.add("noviembre");
		meses.add("diciembre");
		
		meses.add("diciembre");
		
		System.out.println(meses);
		
		for (String mes : meses) {
			System.out.println(mes);
		}
		

	}

}
