package clase9.declaracionpreparada;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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

		insertar();

//		seleccionar();

//		seleccionar("abc-001");
//		seleccionar("abc-001' OR '' = '");

//		actualizar();
//		
//		seleccionar();
//		
//		eliminar();
//		
//		seleccionar();	

	}

	/***
	 * INSERTAR UN REGISTRO EN LA BASE DE DATOS
	 */
	private static void insertar() {

		try (Connection conexion = conectarBaseDeDatos()) { 

			String sql = "insert into familiar(patenteNumero, patenteActiva, marca, categoria, color, encendido) "
					+ " values(?, ?, ?, ?, ?, ?)";

			PreparedStatement st = conexion.prepareStatement(sql);
			st.setString(1, "abc-002");
			st.setBoolean(2, false);
			st.setString(3, "ford");
			st.setString(4, "compacto");
			st.setString(5, "azul");
			st.setBoolean(6, true);

			st.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * 
	 * @param filtro
	 */
	private static void seleccionar(String filtro) {

		try (Connection conexion = conectarBaseDeDatos()) {

			String sql = "select patenteNumero, patenteActiva, marca, categoria, color, encendido " + "from familiar "
					+ "where patenteNumero = '" + filtro + "'";

			Statement st = conexion.createStatement();

			System.out.println(sql);

			ResultSet r = st.executeQuery(sql);

			while (r.next()) {
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
			ResultSet r = st.executeQuery(sql);

			while (r.next()) {
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
