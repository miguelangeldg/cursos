package clase1;

import java.util.Random;
import java.util.Scanner;

public class AdivinarNumero {

	public static void main(String[] args) {

		Scanner consola = new Scanner(System.in);
		
		Random ran = new Random();
		
		int nroUsuario, nroAleatorio;

		nroAleatorio = ran.nextInt(10) + 1;

//		System.out.println(nroAleatorio);

		do {
			System.out.println("Adivine el numero");
			nroUsuario = consola.nextInt();

			if (nroAleatorio == nroUsuario) {
				System.out.println("Felicitaciones adivino!!");
				break;

			} else if (nroUsuario > nroAleatorio) {
				System.out.println("Intente con un numero menor");

			} else {
				System.out.println("Intente con un numero mayor");
			}

		} while (true);

		consola.close();

	}

}
