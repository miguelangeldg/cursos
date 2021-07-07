package clase7.priorityqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class App {

	/**
	 * COLAS
	 */
	public static void main(String[] args) {
		
		Queue<String> nombres = new PriorityQueue<String>();
		
		nombres.add("analia");
		nombres.add("mariana");
		nombres.add("octavio");
		
		System.out.println(nombres.element()); //devuelve el primer elemento
		
		nombres.offer("sabrina"); // agrega un elemento al final de la cola
		
		while (!nombres.isEmpty()) {
			System.out.println(nombres.peek());	// devuelve el primer elemento de la cola		
			System.out.println(nombres.poll()); // devuelve y elimina el primer elemento de la cola
		}

	}

}
