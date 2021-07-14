package clasee10.bufferedReaderWriter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {

	public static void main(String[] args) {
		
		System.out.println("Inicio del Programa");
		
		final String DIRECTORIO = "E:" + File.separator + "ficheros" + File.separator;

		File archivoLectura = new File(DIRECTORIO + "entrada.txt");

		
		try (BufferedReader leerFichero = new BufferedReader( new FileReader(archivoLectura)) ) {
									
			if (leerFichero.ready()) {			
				
				String mensaje = null;
				
				while ((mensaje = leerFichero.readLine()) != null) {
					System.out.println(mensaje);
				}			
				
			}
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Fin del Programa");

	}

}
