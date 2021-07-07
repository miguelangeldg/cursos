package clase7.laboratorio;

import java.util.Arrays;

public class PersonaException extends Exception {

	private int codigo;

	public PersonaException(int codigo) {
		super();
		this.codigo = codigo;
	}

	public PersonaException(String message) {
		super(message);
	}

	@Override
	public String getMessage() {
		switch (this.codigo) {
		case 1:
			return "Los Documentos validos son " + Arrays.toString(DocumentosValidos.tipoDocumento);

		default:
			return super.getMessage();
		}
	}

}
