package clasee13.laboratorio;

import java.util.ArrayList;
import java.util.List;

public class App2 {

	public static void main(String[] args) {
		
		List<Persona> listaPersonas = new ArrayList<>();
		
		AdministrativoImpl adm = new AdministrativoImpl();
		listaPersonas.addAll(adm.listar(false));
		
		listaPersonas.forEach(System.out::println);

	}

}
