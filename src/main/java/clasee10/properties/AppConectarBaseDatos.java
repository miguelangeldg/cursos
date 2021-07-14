package clasee10.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class AppConectarBaseDatos {

	public static void main(String[] args) {

		System.out.println("Incio del Programa Basico de Java con SQL");

		Connection con = null;
		
		try {
			con = conectarBaseDeDatos();
			System.out.println("Me conecte!");

		} catch (SQLException e) {
			System.out.println("Algo salio mal...");

		} finally {
			try {
				if (con != null) {
					con.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Fin del Programa");

	}
	

	private static Connection conectarBaseDeDatos() throws SQLException {

		Connection conexion = null;
		
		Properties propiedades = new Properties();

		try {
			propiedades.load(new FileInputStream("src/main/resources/database.properties"));
			
			String driver = propiedades.getProperty("db.driver");
			String url = propiedades.getProperty("db.url");
			String usuario = propiedades.getProperty("db.user");
			String clave = propiedades.getProperty("db.pass");

			Class.forName(driver);

			conexion = DriverManager.getConnection(url, usuario, clave);

		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}

		return conexion;
	}

}
