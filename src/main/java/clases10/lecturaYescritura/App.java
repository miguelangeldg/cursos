package clases10.lecturaYescritura;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		
		System.out.println("Inicio del programa");
		
		File fEntrada = new File("E:" + File.separator + "ficheros" + File.separator + "entrada.txt");
		File fSalida = new File("E:" + File.separator + "ficheros" + File.separator + "salida.txt");
		
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(fEntrada);//leer un flujo de bytes
//			fos = new FileOutputStream(fSalida);//escribir un flujo de bytes
			
//			fos.write(fis.readAllBytes());
			
			int c;
			while((c = fis.read()) != -1) {
				System.out.print( (char)c );
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}	
		
		System.out.println("Fin del programa");

	}
	

}
