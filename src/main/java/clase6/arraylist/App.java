package clase6.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class App {

	public static void main(String[] args) {
		
		List<String> nombres = new ArrayList<String>();
		
		nombres.add("mariana");
		nombres.add("analia");
		nombres.add("octavio");
		nombres.add("octavio");
		
		
		System.out.println(nombres);		
		
		ListIterator<String> it = nombres.listIterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		System.out.println(nombres);
		
		while (it.hasPrevious()) {
			System.out.println(it.previous());
		}
		
	}

}
