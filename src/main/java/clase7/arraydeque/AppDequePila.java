package clase7.arraydeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class AppDequePila {

	/**
	 * Deque - Implementamos como pila
	 */
	public static void main(String[] args) {

		Deque<String> nombres = new ArrayDeque<String>();

		nombres.add("analia");
		nombres.add("mariana");
		nombres.add("octavio");

		System.out.println(nombres.element()); // devuelve el primer elemento

		nombres.offerLast("sabrina"); // agrega un elemento al final de la pila

		while (!nombres.isEmpty()) {
			System.out.println(nombres.peekLast()); // devuelve el ultimo elemento de la pila
			System.out.println(nombres.pollLast()); // devuelve y elimina el ultimo elemento de la pila
		}

	}

}
