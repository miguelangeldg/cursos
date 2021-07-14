package clasee10.fileReaderWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirFichero {

	public static void main(String[] args) {
		
		System.out.println("Inicio del Programa");
		
		final String DIRECTORIO = "E:" + File.separator + "ficheros" + File.separator;

		File archivoEscritura = new File(DIRECTORIO + "salida.txt");
		
		final String PARRAFO = "El lenguaje de programacion Java tiene una filosofia: escribir una vez, ejecutar en cualquier lugar. \nEs un lenguaje moderno y orientado a objetos.\nEs ampliamente utilizado para desarrollar aplicaciones moviles en Android";
				
		
		try (FileWriter escribirFichero = new FileWriter(archivoEscritura, false)) {

			for (int i = 0; i < PARRAFO.length(); i++) {
				escribirFichero.write( PARRAFO.charAt(i) );
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Fin del Programa");

	}

}
