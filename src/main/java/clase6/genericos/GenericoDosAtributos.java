package clase6.genericos;

public class GenericoDosAtributos<K, V> {
	
	private K codigo;
	private V numero;
	
	public GenericoDosAtributos() {		
	}
	
	public GenericoDosAtributos(K codigo, V numero) {
		this.codigo = codigo;
		this.numero = numero;		
	}	
	
	public K getCodigo() {
		return codigo;
	}
	public void setCodigo(K codigo) {
		this.codigo = codigo;
	}
	public V getNumero() {
		return numero;
	}
	public void setNumero(V numero) {
		this.numero = numero;
	}
	
	

}
