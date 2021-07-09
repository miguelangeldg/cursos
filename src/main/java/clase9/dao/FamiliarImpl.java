package clase9.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FamiliarImpl implements DAO<Auto, String>, ConexionMySQL {
	

	@Override
	public void insertar(Auto element) {
		
		Familiar f = (Familiar) element;
		
		try (Connection conexion = getConexion()) { 

			String sql = "insert into familiar(patenteNumero, patenteActiva, marca, categoria, color, encendido) "
					+ "values(?, ?, ?, ?, ?, ?)";

			PreparedStatement pst = conexion.prepareStatement(sql);
			
			pst.setString(1, f.getPatente().getNumero());
			pst.setBoolean(2, f.getPatente().isActiva());
			pst.setString(3, f.getMarca());
			pst.setString(4, f.getCategoria());
			pst.setString(5, f.getColor());
			pst.setBoolean(6, f.isEncendido());
			
			pst.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	

	@Override
	public Auto get(String patente) {
		
		Familiar auto = null;
		
		try (Connection conexion = getConexion()) {

			String sql = "select patenteNumero, patenteActiva, marca, categoria, color, encendido " + "from familiar "
					+ "where patenteNumero = ?"; 

			PreparedStatement st = conexion.prepareStatement(sql);
			st.setString(1, patente);

			System.out.println(sql);

			ResultSet r = st.executeQuery();

			while (r.next()) {
				auto = new Familiar();
				Patente p = new Patente(r.getString(1), r.getBoolean(2));
				auto.setPatente(p);
				auto.setMarca(r.getString(3));
				auto.setCategoria(r.getString(4));
				auto.setColor(r.getString(5));
				auto.setEncendido(r.getBoolean(6));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return auto;		
		
	}

	@Override
	public boolean actualizar(Auto element) {
		
		try (Connection conexion = getConexion()) {

			String sql = "update familiar set patenteActiva = ? where patenteNumero = ?";

			PreparedStatement st = conexion.prepareStatement(sql);
			st.setBoolean(1, true);
			st.setString(2, element.getPatente().getNumero());
			
			return st.executeUpdate() > 0 ? true : false;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean eliminar(Auto element) {
		
		boolean res = false;
		
		try (Connection conexion = getConexion()) {

			String sql = "delete from familiar where patenteNumero = ?";

			PreparedStatement st = conexion.prepareStatement(sql);
			st.setString(1, element.getPatente().getNumero());
			
			res = st.executeUpdate() > 0 ? true : false;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return res;
	}

}
