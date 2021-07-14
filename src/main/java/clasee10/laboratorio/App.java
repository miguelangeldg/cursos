package clasee10.laboratorio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		System.out.println("Inicio del Programa");
		
		System.out.println("Escriba el texto que desea guardar y al finalizar escriba una linea con la palabra 'fin':");

		
		Scanner teclado = new Scanner(System.in);
		
		List<String> texto = new ArrayList<>();
		
		final String DIRECTORIO = "E:" + File.separator + "ficheros" + File.separator;

		File archivo = new File(DIRECTORIO + "archivo.txt");
		
		
		do {
			
			String linea = teclado.nextLine();
			
			if (linea.equalsIgnoreCase("fin")) {
				break;
			}
			
			texto.add(linea);

		} while (true);
		
		
		
		escribir(archivo, texto);
		leer(archivo);

		teclado.close();
		
		System.out.println("Fin del Programa");
	}
	

	
	static boolean escribir(File archivoEscritura, List<String> texto) {
		
		try (BufferedWriter escribirFichero = new BufferedWriter(new FileWriter(archivoEscritura, true))) { // true sobreescribe el archivo

			for (String linea : texto) {
				escribirFichero.write(linea);
				escribirFichero.newLine();
			}
			
			return true;
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	
	
	static void leer(File archivoLectura) {
				
		try (BufferedReader leerFichero = new BufferedReader(new FileReader(archivoLectura))) {
			

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

	}
}
