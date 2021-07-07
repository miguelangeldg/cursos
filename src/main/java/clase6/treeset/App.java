package clase6.treeset;

import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		
		Set<String> meses = new TreeSet<String>();
//		TreeSet<String> meses = new TreeSet<String>();

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

		for (String m : meses) {
			System.out.println(m);
		}
	}

}
