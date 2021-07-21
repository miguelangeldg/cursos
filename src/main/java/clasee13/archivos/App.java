package clasee13.archivos;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {
		
		String fEntrada = "E:" + File.separator + "ficheros" + File.separator + "entrada.txt";
		
		try(Stream<String> stream = Files.lines(Paths.get(fEntrada))){
			
			stream.forEach(System.out::println);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
