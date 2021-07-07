package clase5.excepciones.propias;

public class DivisionCeroException extends Exception {

	@Override
	public String getMessage() {
		return "No se puede dividir por cero";
	}
	
}
