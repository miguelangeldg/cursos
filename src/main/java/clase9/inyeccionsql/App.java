package clase9.inyeccionsql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class App {

	public static void main(String[] args) throws SQLException {		
		
//		seleccionar("abc-002");
		seleccionar("abc-001' OR '' = '");

	}
	
	
	/**
	 * 
	 * @param filtro
	 */
	private static void seleccionar(String filtro) {

		try (Connection conexion = conectarBaseDeDatos()) {

			String sql = "select patenteNumero, patenteActiva, marca, categoria, color, encendido "
					+ "from familiar "
					+ "where patenteNumero = '" + filtro + "'";

			Statement st = conexion.createStatement();
			
			System.out.println(sql);
			
			ResultSet r  = st.executeQuery(sql);
			
			while(r.next()) {
				System.out.println(r.getString(1));
				System.out.println(r.getBoolean(2));
				System.out.println(r.getString(3));
				System.out.println(r.getString(4));
				System.out.println(r.getString(5));
				System.out.println(r.getBoolean(6));
			}
			

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
		
	
	private static Connection conectarBaseDeDatos() throws SQLException {

		Connection conexion = null;

		try {
			
//			String driver = "com.mysql.jdbc.Driver"; // version anterior a 5
			
//			String driver = "com.mysql.cj.jdbc.Driver";
//			String url = "jdbc:mysql://localhost:3306/autos";
			
			String driver = "org.mariadb.jdbc.Driver";
			String url = "jdbc:mariadb://localhost:3306/autos";
			
			String usuario = "root";
			String clave = "123";

			Class.forName(driver);

			conexion = DriverManager.getConnection(url, usuario, clave);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return conexion;
	}

}
