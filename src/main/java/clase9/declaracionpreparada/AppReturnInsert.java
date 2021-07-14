package clase9.declaracionpreparada;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AppReturnInsert {

	public static void main(String[] args) throws SQLException {

		if (conectarBaseDeDatos() != null) {
			System.out.println("Me conecte a la base de datos!");

		} else {
			System.out.println("Algo salio mal...");
		}

		ejecutar();

	}

	
	private static boolean ejecutar() {

		boolean hayResultados = false;

		try (Connection conexion = conectarBaseDeDatos()) {

			String sqlInsert = "insert into auto(patenteNumero, patenteActiva, marca, categoria, color, encendido) "
					+ "values('ABC-003', 1, 'TATA', 'SEDAN', 'AMARILLO', 1),"
					+ "('ABC-004', 0, 'Mercedez', 'SEDAN', 'AZUL', 0),"
					+ "('ABC-005', 0, 'Ferrari', 'SEDAN', 'ROJO', 0)," + "('ABC-006', 1, 'Fiat', 'SEDAN', 'VERDE', 1)";
			
			
			String sqlUpdate = "update auto set patenteActiva = 1";
			
			String sqlSelect = "select patenteNumero, patenteActiva, marca, categoria, color, encendido from auto";
						

			Statement st = conexion.createStatement();
			
			
			
//			hayResultados = st.execute(sqlInsert);
//			System.out.println("Resultado tras ejecutar insert: " + hayResultados); 
//			
//			
//			hayResultados = st.execute(sqlUpdate); 
//			System.out.println("Resultado tras ejecutar update: " + hayResultados);
//			System.out.println("Cantidad de registros actualizados: " + st.getUpdateCount()); 
//			
//			
//			hayResultados = st.execute(sqlSelect);
//			System.out.println("Resultado tras ejecutar select: " + hayResultados);
//			ResultSet rs = st.getResultSet(); 			
//			while(rs.next()) {
//				System.out.println(rs.getString(1));
//			}
			
			
//			if(hayResultados) {
//				rs = st.executeQuery(sqlSelect);
//				while(rs.next()) {
//					System.out.println(rs.getString(1));
//				}
//			}					
						
			
			st.execute(sqlInsert, Statement.RETURN_GENERATED_KEYS);
			ResultSet rs = st.getGeneratedKeys();
			
			if (rs != null) {
				while (rs.next()) {
					System.out.println("key generada: " + rs.getString(1));
				}
			}
			

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return hayResultados;
	}

	
	private static Connection conectarBaseDeDatos() throws SQLException {

		Connection conexion = null;

		try {
			String driver = "com.mysql.cj.jdbc.Driver"; 
			String url = "jdbc:mysql://localhost:3306/autos";

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
