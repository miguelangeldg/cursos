package clase9.laboratorio;

public final class Documento {
	
	private TiposDocumento tipo;
	private int numero;	
		
	
	public Documento() {
		super();
	}

	public Documento(TiposDocumento tipo, int numero) {
		super();
		this.tipo = tipo;
		this.numero = numero;
	}
		

	@Override
	public String toString() {
		/**MOSTRAMOS LA DESCRIPCION DEL ENUMERADO*/
		return "Documento [tipo=" + tipo.getDescripcion() + ", numero=" + numero + "]";
	}

	public TiposDocumento getTipo() {
		return tipo;
	}

	public void setTipo(TiposDocumento tipo) {
		this.tipo = tipo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	
}
