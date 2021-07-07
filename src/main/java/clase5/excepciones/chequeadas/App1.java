package clase5.excepciones.chequeadas;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class App1 {

	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader("archivo.txt");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
