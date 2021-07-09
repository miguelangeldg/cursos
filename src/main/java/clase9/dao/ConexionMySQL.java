package clase9.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface ConexionMySQL {

	default Connection getConexion() {

		Connection con = null;

		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/autos";

			String usuario = "root";
			String clave = "123";

			Class.forName(driver);

			con = DriverManager.getConnection(url, usuario, clave);

			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return con;

	}

}
