package clase6.laboratorio;

public final class Documento {
	
	private String tipo;
//	private TiposDocumento tipo;
	private int numero;	
		
	
	public Documento() {
		super();
	}

	public Documento(String tipo, int numero) {
//	public Documento(TiposDocumento tipo, int numero) {
		super();
		this.tipo = tipo;
		this.numero = numero;
	}
		

	@Override
	public String toString() {
		return "Documento [tipo=" + tipo + ", numero=" + numero + "]";
//		return "Documento [tipo=" + tipo.getDescripcion() + ", numero=" + numero + "]";
	}

	
//	public TiposDocumento getTipo() {
//		return tipo;
//	}
//
//	public void setTipo(TiposDocumento tipo) {
//		this.tipo = tipo;
//	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
