package clasee10.fileReaderWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {

	public static void main(String[] args) {
		
		System.out.println("Inicio del Programa");
		
		final String DIRECTORIO = "E:" + File.separator + "ficheros" + File.separator;

		File archivoLectura = new File(DIRECTORIO + "entrada.txt");
		
		
		try (FileReader leerFichero = new FileReader(archivoLectura)) {
			
			System.out.println("Codificacion de caracteres: " + leerFichero.getEncoding());
			
			int c;
			while ((c = leerFichero.read()) != -1) {
				char caracter = (char) c;
				System.out.print(caracter);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Fin del Programa");

	}

}
