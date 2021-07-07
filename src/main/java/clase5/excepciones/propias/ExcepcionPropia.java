package clase5.excepciones.propias;

public class ExcepcionPropia extends Exception {

	private int codigo;

	public ExcepcionPropia(int codigo) {
		super();
		this.codigo = codigo;
	}

	public ExcepcionPropia(String mensaje) {
		super(mensaje);
	}

	@Override
	public String getMessage() {
		switch (this.codigo) {
		case 1:
			return "El valor ingresado no puede ser cero";
		case 2:
			return "El valor ingresado no puede ser negativo";
		default:
			return super.getMessage();
		}
		
	}

}
