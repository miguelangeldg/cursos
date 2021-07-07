package clase5.excepciones.propias.auto;

public class App {

	public static void main(String[] args) {
		
		Auto camion;
		
//		camion = new Camion("blanco", "Mercedez", new Patente("arg-21465", true), true, "lic125", null, 8, 9.7);
		camion = new Camion("blanco", "Mercedez", null, true, "lic125", null, 8, 9.7);
		System.out.println(camion);
		
	}

}
