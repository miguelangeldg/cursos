package clase5.excepciones.propias.auto;

public class AutoException extends Exception {

	private int codigo;

	public AutoException(int codigo) {
		super();
		this.codigo = codigo;
	}

	public AutoException(String message) {
		super(message);
	}

	@Override
	public String getMessage() {		
		switch (this.codigo) {
		case 1:
			return "La patente no puede ser nulo";
		case 2:
			return "La patente debe contener 8 caracteres";
		default:
			return super.getMessage();
		}
	}
}
