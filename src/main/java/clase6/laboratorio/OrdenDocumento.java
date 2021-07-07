package clase6.laboratorio;

import java.util.Comparator;

public class OrdenDocumento implements Comparator<Persona> {

	@Override
	public int compare(Persona p1, Persona p2) {

		int tipo = p1.getDocumento().getTipo().toString().compareTo(p2.getDocumento().getTipo().toString());

		if (tipo == 0) {
			return p1.getDocumento().getNumero() - p2.getDocumento().getNumero();
		}

		return tipo;
	}

}
