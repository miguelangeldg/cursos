package clase5.excepciones.propias;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner consola = new Scanner(System.in);
		int n;

		System.out.println("Ingrese un valor");
		n = consola.nextInt();

		try {
			if (n == 0) {
				throw new ExcepcionPropia(1);
			}
			if(n < 0) {
				throw new ExcepcionPropia(2);
			}

			System.out.println(n);

		} catch (ExcepcionPropia e) {
			System.out.println(e.getMessage());
		}

	}

}
