package clasee10.file;

import java.io.File;

public class App {

	public static void main(String[] args) {
		
		File f = new File("E:" + File.separator + "ficheros");
		
		System.out.println("se puede leer? " + f.canRead());
		System.out.println("se puede escribir? " + f.canWrite());
		System.out.println("es un directorio? " + f.isDirectory());
		System.out.println("el directorio existe? " + f.exists());
		System.out.println("nombre: " + f.getName());
		
		leerContenido(f);

	}
	
	
	private static void leerContenido(File f) {
		
		File[] ficheros = f.listFiles();
		
		for (File file : ficheros) {
			System.out.println(file.isDirectory() ? "es un directorio" : "es un archivo" + " - " + file.getAbsolutePath());
						
			if(file.isDirectory()) {
				leerContenido(file);
			}			
		}
		
	}

}
