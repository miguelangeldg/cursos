package clasee13.laboratorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface ConexionMariaDB {

	default Connection getConexion() {

		Connection aux = null;

		try {
			String DRIVER = "org.mariadb.jdbc.Driver"; // MariaDB
			
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
