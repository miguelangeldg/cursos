package clase6.genericos;

public class App {

	public static void main(String[] args) {
		
		GenericoDosAtributos<Integer, Integer> telefono = new GenericoDosAtributos<Integer, Integer>(54, 50124478);
//		telefono.setCodigo(54);
//		telefono.setNumero(50124478);
		
		GenericoDosAtributos<String, Integer> documento = new GenericoDosAtributos<String, Integer>();
		documento.setCodigo("DNI");
		documento.setNumero(20520838);
		
		GenericoDosAtributos<String, String> direccion = new GenericoDosAtributos<>();
		direccion.setCodigo("CABA");
		direccion.setNumero("Villa del Parque");
		
		System.out.println("Codigo: " + telefono.getCodigo() + ", Numero: " + telefono.getNumero());
		System.out.println("Documento: " + documento.getCodigo() + " Numero: " + documento.getNumero());

	}

}
