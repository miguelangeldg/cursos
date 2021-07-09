package clase9.dao;

public interface DAO<E, K> {
	
	void insertar(E element);
	
	E get(K key);
	
	boolean actualizar(E element);
	
	boolean eliminar(E element);

}
