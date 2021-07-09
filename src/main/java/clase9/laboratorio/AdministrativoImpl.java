package clase9.laboratorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AdministrativoImpl implements DAO<Persona, Integer>, ConexionMariaDB {

	@Override
	public boolean insertar(Persona element) {
		
		Administrativo persona = (Administrativo) element;
		boolean r = false;

		try (Connection conexion = getConexion()) {

			String sql = "INSERT INTO administrativo (nombre, apellido, tipoDocumento, numeroDocumento, fechaNacimiento, fechaCargo, sueldo) "
					+ "VALUES  (?,?,?,?,?,?,?);";

			PreparedStatement declaracionPreparadaSQL = conexion.prepareStatement(sql);

			declaracionPreparadaSQL.setString(1, persona.getNombre());
			declaracionPreparadaSQL.setString(2, persona.getApellido());
			declaracionPreparadaSQL.setString(3, persona.getDocumento().getTipo().name());
			declaracionPreparadaSQL.setInt(4, persona.getDocumento().getNumero());
			declaracionPreparadaSQL.setDate(5, new java.sql.Date(persona.getFechaNacimiento().getTime()));
			declaracionPreparadaSQL.setDate(6, new java.sql.Date(persona.getFechaCargo().getTime()));
			declaracionPreparadaSQL.setDouble(7, persona.getSueldo());
			
			if(declaracionPreparadaSQL.executeUpdate() > 0) {
				r = true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return r;
		
	}

}
