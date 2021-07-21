package clasee13.laboratorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface ConexionMySql {

	default Connection getConexion() {

		Connection aux = null;

		try {

//			final String DRIVER = "com.mysql.jdbc.Driver"; //MySQL 5
			String DRIVER = "com.mysql.cj.jdbc.Driver"; //MySQL 6 o Superior
			
			String URL = "jdbc:mysql://localhost/personas";
			String USER = "root";
			String PASS = "123";
			
			Class.forName(DRIVER);
			
			aux = DriverManager.getConnection(URL, USER, PASS);

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return aux;
	}

}
