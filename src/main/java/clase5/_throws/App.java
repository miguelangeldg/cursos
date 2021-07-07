package clase5._throws;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
			try {
				leerArchivo();
				guardar();
				
			} catch (FileNotFoundException | ClassNotFoundException e) {
				e.printStackTrace();
			}
			
	}

	
	private static void leerArchivo() throws FileNotFoundException  {

		File input = new File("archivo.txt");
		Scanner sc = new Scanner(input);
		String linea;
		
		do {
			linea = sc.nextLine();
			System.out.println(linea);

		} while (sc.hasNextLine());

		sc.close();		

	}
	
	
	private static void guardar() throws ClassNotFoundException {
		
		String driver = "com.mysql.jdbc.Driver";
		Class.forName(driver);
		
	}

}
