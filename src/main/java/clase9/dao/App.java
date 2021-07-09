package clase9.dao;

public class App {

	public static void main(String[] args) {
		
		Auto familiar = new Familiar("rojo", "fiat", new Patente("zzz-111", true), false, "compacto");
				
		FamiliarImpl fimpl = new FamiliarImpl();
		fimpl.insertar(familiar);	
		
		System.out.println(fimpl.get("zzz-111"));
		
//		System.out.println(fimpl.actualizar(familiar));
		
		System.out.println(fimpl.eliminar(familiar));
		
	}

}
