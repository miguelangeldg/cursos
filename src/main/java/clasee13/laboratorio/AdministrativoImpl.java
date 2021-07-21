package clasee13.laboratorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

	@Override
	public List<Persona> listar() {
		
		List<Persona> lista = new ArrayList<>();

		String sql = "select nombre, apellido, tipoDocumento, numeroDocumento, fechaNacimiento, fechaCargo, sueldo from administrativo";

		try {
			
			PreparedStatement pst = getConexion().prepareStatement(sql); 
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				String nombre = rs.getString("nombre");
				String apellido = rs.getString("apellido");
				TiposDocumento tipoDocumento = TiposDocumento.valueOf(rs.getString("tipoDocumento"));
				Integer numeroDocumento = rs.getInt("numeroDocumento");
				Date fechaNacimiento = rs.getDate("fechaNacimiento");
				Date fechaCargo = rs.getDate("fechaCargo");
				Double sueldo = rs.getDouble("sueldo");

				Administrativo administrativo = new Administrativo(nombre, apellido,
						new Documento(tipoDocumento, numeroDocumento), fechaNacimiento, fechaCargo, sueldo);

				lista.add(administrativo);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} 

		return lista;
	}
	
	
	public List<Persona> listar(boolean esOrdenadoBaseDeDatos) {
		
		List<Persona> lista = listar();

		if (!esOrdenadoBaseDeDatos) {
			lista.sort( (e1, e2) -> ((Double) ((Administrativo) e1).getSueldo()).compareTo( (Double) ((Administrativo) e2).getSueldo()) );
		}

		return lista;
	}

}
