package clase9.inyeccionsql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class App {

	public static void main(String[] args) throws SQLException {

//		if(conectarBaseDeDatos() != null) {
//			System.out.println("Me conecte a la base de datos!");
//			
//		}else {
//			System.out.println("Algo salio mal...");
//		}

//		insertar();		
		
//		seleccionar();
		
//		seleccionar("abc-001");
		seleccionar("abc-001' OR '' = '");
		
//		actualizar();
//		
//		seleccionar();
//		
//		eliminar();
//		
//		seleccionar();	

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
	
	
	/**
	 * BORRAMOS UN REGISTRO
	 */
	private static void eliminar() {
		
		try (Connection conexion = conectarBaseDeDatos()) {

			String sql = "delete from familiar where patenteNumero = 'abc-001'";

			Statement st = conexion.createStatement();
			st.execute(sql);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	/**
	 * ACTUALIZAMOS UN REGISTRO
	 */
	private static void actualizar() {
		
		try (Connection conexion = conectarBaseDeDatos()) {

			String sql = "update familiar set patenteActiva = 0 where patenteActiva = 1";

			Statement st = conexion.createStatement();
			st.execute(sql);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	

	/**
	 * CONSULTA A LA BASE DE DATOS
	 */
	private static void seleccionar() {

		try (Connection conexion = conectarBaseDeDatos()) {

			String sql = "select patenteNumero, patenteActiva, marca, categoria, color, encendido from familiar";

			Statement st = conexion.createStatement();
			ResultSet r  = st.executeQuery(sql);
			
			while(r.next()) {
				System.out.println(r.getString(1));
				System.out.println(r.getBoolean(2));
				System.out.println(r.getString(3));
				System.out.println(r.getString(4));
				System.out.println(r.getString(5));
				System.out.println(r.getBoolean(6));
				
//				System.out.println(r.getString("patenteNumero"));
//				System.out.println(r.getBoolean("patenteActiva"));
//				System.out.println(r.getString("marca"));
//				System.out.println(r.getString("categoria"));
//				System.out.println(r.getString("color"));
//				System.out.println(r.getBoolean("encendido"));				
			}
			

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/***
	 * INSERTAR UN REGISTRO EN LA BASE DE DATOS
	 */
	private static void insertar() {

		try (Connection conexion = conectarBaseDeDatos()) { // try with resources -- > cierra la conexion automaticamente

			String sql = "insert into familiar(patenteNumero, patenteActiva, marca, categoria, color, encendido) "
					+ "values('abc-001', 1, 'audi', 'sedan', 'rojo', 1)";

			Statement st = conexion.createStatement();
			st.execute(sql);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/***
	 * 
	 * @return Connection
	 * @throws SQLException
	 */
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
