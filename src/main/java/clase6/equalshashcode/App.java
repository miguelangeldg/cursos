package clase6.equalshashcode;

public class App {

	public static void main(String[] args) {
		
		Persona p1 = new Persona(100, "mariana", "lopez");
		Persona p2 = new Persona(200, "mariana", "lopez");
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());		

	}

}
