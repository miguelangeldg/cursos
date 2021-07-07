package clase4.abstraccion;

import java.util.Date;

public class App {

	public static void main(String[] args) {

//		Familiar f1 = new Familiar("plateado", "audi", new Patente("zgb-999", true), false, "sedan");
//		
//		System.out.println(f1);
//		
//		f1.vender();	
		
		Auto camion;
		
		camion = new Camion("blanco", "Mercedez", new Patente("arg-21465", true), true, "lic125", null, 8, 9.7);
//		auto.reparar(new Date(), "tren delantero", "juan");
		mostrar(camion, new Date(), "tren delantero", "juan");
		
		Auto familiar = new Familiar("rojo", "fiat", new Patente("arg-58963", true), false, "compacto");
//		auto.reparar(new Date(), "tren trasero", "jose");
		mostrar(familiar, new Date(), "tren trasero", "jose");
		
//		Familiar familiar = (Familiar) auto;
//		System.out.println(familiar.getCategoria());

	}
	
	private static void mostrar(Auto auto, Date fecha, String pieza, String mecanico) {
		auto.reparar(fecha, pieza, mecanico);
	}

}
