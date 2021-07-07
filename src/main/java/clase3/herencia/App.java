package clase3.herencia;

public class App {

	public static void main(String[] args) {
		
		Patente p = new Patente("OWO713", true);
		
		Auto a1 = new Auto("rojo", "fiat", p, false);
		System.out.println(a1);
		
		Camion c1 = new Camion("amarillo", "Mercedez", new Patente("cam-7896", true), true, 4, 50);
		System.out.println(c1);		
		
	}

}
