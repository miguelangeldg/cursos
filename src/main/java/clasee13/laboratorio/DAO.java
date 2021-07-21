package clasee13.laboratorio;

import java.util.List;

public interface DAO<E, K> {
	
	boolean insertar(E element);
	
	List<E> listar();

}
