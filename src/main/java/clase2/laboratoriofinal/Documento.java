package clase2.laboratoriofinal;

public class Documento {
	
	private String tipo;
	private int numero;	
		
	
	public Documento() {
		super();
	}

	public Documento(String tipo, int numero) {
		super();
		this.tipo = tipo;
		this.numero = numero;
	}

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
