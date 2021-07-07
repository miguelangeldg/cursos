package clase5.excepciones.chequeadas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {

		System.out.println("Inicio del programa");

		File input = new File("archivo.txt");
		Scanner sc = null;

		try {
			sc = new Scanner(input);

			do {
				String linea = sc.nextLine();
				System.out.println(linea);

			} while (sc.hasNextLine());
			

		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado");

		} catch (NullPointerException e) {
			System.out.println("El archivo no existe");

		} finally {
			try {
				sc.close();
				
			} catch (NullPointerException e) {
				System.out.println("La variable Scanner nunca se inicializo");
			}
			System.out.println("Fin del programa");
		}

		System.out.println("continua con la ejecucion del programa");
	}

}
