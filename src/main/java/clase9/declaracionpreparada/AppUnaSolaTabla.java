package clase9.declaracionpreparada;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AppUnaSolaTabla {

	public static void main(String[] args) throws SQLException {

//		insertarCamion();
//		
//		insertarPasajeros();
		
		seleccionarCamion();
		
		seleccionarPasajeros();		
		
	}
	
	
	private static void seleccionarPasajeros() {

		try (Connection conexion = conectarBaseDeDatos()) {

			String sql = "select patenteNumero, patenteActiva, marca, color, encendido,"
					+ "licencia, tipo, accesoEspecial from transporte "
					+ "where discriminador = 'P'";

			Statement st = conexion.createStatement();

			ResultSet r = st.executeQuery(sql);

			System.out.println("\nDatos de pasajeros-----------");
			while (r.next()) {
				System.out.println("patente: " + r.getString(1));
				System.out.println("activa: " + r.getBoolean(2));
				System.out.println("marca: " + r.getString(3));
				System.out.println("color: " + r.getString(4));
				System.out.println("encendido: " + r.getBoolean(5));
				System.out.println("licencia: " + r.getString(6));
				System.out.println("tipo licencia:" + r.getString(7));
				System.out.println("acceso especial: " + r.getBoolean(8));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	
	private static void seleccionarCamion() {

		try (Connection conexion = conectarBaseDeDatos()) {

			String sql = "select patenteNumero, patenteActiva, marca, color, encendido,"
					+ "licencia, tipo, ejes, capacidad from transporte "
					+ "where discriminador = 'C'";

			Statement st = conexion.createStatement();

			ResultSet r = st.executeQuery(sql);

			System.out.println("Datos del camion-----------");
			while (r.next()) {
				System.out.println("patente: " + r.getString(1));
				System.out.println("activa: " + r.getBoolean(2));
				System.out.println("marca: " + r.getString(3));
				System.out.println("color: " + r.getString(4));
				System.out.println("encendido: " + r.getBoolean(5));
				System.out.println("licencia: " + r.getString(6));
				System.out.println("tipo licencia:" + r.getString(7));
				System.out.println("cantidad ejes: " + r.getInt(8));
				System.out.println("capacidad: " + r.getDouble(9));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	
	private static void insertarCamion() {

		try (Connection conexion = conectarBaseDeDatos()) { 

			String sql = "insert into transporte(patenteNumero, patenteActiva, marca, color, encendido,"
					+ "licencia, tipo, ejes, capacidad, discriminador) "
					+ "values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

			
			PreparedStatement pst = conexion.prepareStatement(sql);
			pst.setString(1, "abc-002");
			pst.setBoolean(2, false);
			pst.setString(3, "ford");
			pst.setString(4, "azul");
			pst.setBoolean(5, true);
			pst.setString(6, "lic125");
			pst.setString(7, "p");
			pst.setInt(8, 8);
			pst.setDouble(9, 9.7);
			pst.setString(10, "C");

			pst.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	
	private static void insertarPasajeros() {

		try (Connection conexion = conectarBaseDeDatos()) { 

			String sql = "insert into transporte(patenteNumero, patenteActiva, marca, color, encendido,"
					+ "licencia, tipo, accesoEspecial, discriminador) "
					+ "values(?, ?, ?, ?, ?, ?, ?, ?, ?)";

			PreparedStatement pst = conexion.prepareStatement(sql);
			pst.setString(1, "cam-7896");
			pst.setBoolean(2, true);
			pst.setString(3, "mercedes bens");
			pst.setString(4, "verde");
			pst.setBoolean(5, true);
			pst.setString(6, "lic127");
			pst.setString(7, "p");
			pst.setBoolean(8, true);
			pst.setString(9, "P");
			
			pst.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private static Connection conectarBaseDeDatos() throws SQLException {

		Connection conexion = null;

		try {
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
