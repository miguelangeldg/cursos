package clasee10.bufferedInputOutputStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
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
		
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			bis = new BufferedInputStream( new FileInputStream(fEntrada) );
			bos = new BufferedOutputStream( new FileOutputStream(fSalida) );
			
			bos.write(bis.readAllBytes());	
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		
		} finally {
			try {
				bis.close();
				bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}	
		
		System.out.println("Fin del programa");

	}
	

}
