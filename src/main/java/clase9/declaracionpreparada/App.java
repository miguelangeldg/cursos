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

//		insertar();

//		seleccionar();

//		seleccionar("abc-001");
//		seleccionar("abc-002' OR '' = '");

//		actualizar("abc-001");
//		
//		seleccionar();
//		
		eliminar("abc-001");
//		
//		seleccionar();	

	}

	/***
	 * INSERTAR UN REGISTRO EN LA BASE DE DATOS
	 */
	private static void insertar() {

		try (Connection conexion = conectarBaseDeDatos()) { 

			String sql = "insert into familiar(patenteNumero, patenteActiva, marca, categoria, color, encendido) "
					+ "values(?, ?, ?, ?, ?, ?)";

			PreparedStatement pst = conexion.prepareStatement(sql);
			pst.setString(1, "ABC-001");
			pst.setBoolean(2, false);
			pst.setString(3, "ford");
			pst.setString(4, "compacto");
			pst.setString(5, "azul");
			pst.setBoolean(6, true);

			pst.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	
	private static void seleccionar(String filtro) {

		try (Connection conexion = conectarBaseDeDatos()) {

			String sql = "select patenteNumero, patenteActiva, marca, categoria, color, encendido " + "from familiar "
					+ "where patenteNumero = ?"; //"abc-002' OR '' = '"

			PreparedStatement st = conexion.prepareStatement(sql);
			st.setString(1, filtro);

			System.out.println(sql);

			ResultSet r = st.executeQuery();

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
	 * ACTUALIZAMOS UN REGISTRO
	 */
	private static void actualizar(String patente) {

		try (Connection conexion = conectarBaseDeDatos()) {

			String sql = "update familiar set patenteActiva = ? where patenteNumero = ?";

			PreparedStatement st = conexion.prepareStatement(sql);
			st.setBoolean(1, true);
			st.setString(2, patente);
			
			st.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	

	/**
	 * BORRAMOS UN REGISTRO
	 */
	private static void eliminar(String patente) {

		try (Connection conexion = conectarBaseDeDatos()) {

			String sql = "delete from familiar where patenteNumero = ?";

			PreparedStatement st = conexion.prepareStatement(sql);
			st.setString(1, patente);
			
			st.execute();

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
