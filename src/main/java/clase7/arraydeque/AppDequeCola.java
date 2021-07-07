package clase7.arraydeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class AppDequeCola {

	/**
	 * Deque - Implementamos como cola
	 */
	public static void main(String[] args) {

		Deque<String> nombres = new ArrayDeque<String>();

		nombres.add("analia");
		nombres.add("mariana");
		nombres.add("octavio");

		System.out.println(nombres.element()); // devuelve el primer elemento

		nombres.offerLast("sabrina"); // agrega un elemento al final de la cola

		while (!nombres.isEmpty()) {
			System.out.println(nombres.peekFirst()); // devuelve el primer elemento de la cola
			System.out.println(nombres.pollFirst()); // devuelve y elimina el primer elemento de la cola
		}

	}

}
