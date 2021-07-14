package clasee10.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class App {

	public static void main(String[] args) {
		
		Properties propiedades = new Properties();
		
		try {
			propiedades.load(new FileInputStream("src/main/resources/database.properties"));
			
			String driver = propiedades.getProperty("db.driver");
			String url = propiedades.getProperty("db.url");
			String user = propiedades.getProperty("db.user");
			String pass = propiedades.getProperty("db.pass");
			
			System.out.println("El driver es: " + driver);
			System.out.println("El url es: " + url);
			System.out.println("El user es: " + user);
			System.out.println("El pass es: " + pass);
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
