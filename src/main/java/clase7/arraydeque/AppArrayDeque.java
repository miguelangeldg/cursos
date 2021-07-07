package clase7.arraydeque;

import java.util.ArrayDeque;
import java.util.Queue;

public class AppArrayDeque {

	public static void main(String[] args) {

		/**
		 * QUEUE - IMPLEMENTAMOS UNA COLA
		 */
		Queue<String> nombres = new ArrayDeque<String>();

		nombres.add("analia");
		nombres.add("mariana");
		nombres.add("octavio");

		System.out.println(nombres.element()); // devuelve el primer elemento

		nombres.offer("sabrina"); // agrega un elemento al final de la cola

		while (!nombres.isEmpty()) {
			System.out.println(nombres.peek()); // devuelve el primer elemento de la cola
			System.out.println(nombres.poll()); // devuelve y elimina el primer elemento de la cola
		}

	}

}
