package ar.unrn.tp4.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ar.unrn.tp4.modelo.Participante;
import ar.unrn.tp4.modelo.RepositorioDeParticipantes;

public class JdbcParticipante implements RepositorioDeParticipantes {

	private Connection setupBaseDeDatos() {

		try {
			String url = "jdbc:mysql://localhost:3306/objetos2";
			String user = "root";
			String password = "";

			Connection conecction = DriverManager.getConnection(url, user, password);

			return conecction;
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	public void nuevoParticipante(Participante participante) {
		Connection conn = setupBaseDeDatos();
		try (PreparedStatement st = conn
				.prepareStatement("insert into participantes(nombre, telefono, region) values(?,?,?)");) {

			st.setString(1, participante.nombre());
			st.setString(2, participante.telefono());
			st.setString(3, participante.region());
			st.executeUpdate();

		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		} finally { // Preguntar aca para dejar mas prolijo
			try {
				conn.close();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}

	}
//	
//				 
//		
//		this.setupBaseDeDatos();
//
//		PreparedStatement st = dbConn
//				.prepareStatement("insert into participantes(nombre, telefono, region) values(?,?,?)");
//		try {
//			st.setString(1, participante.nombre());
//			st.setString(2, participante.telefono());
//			st.setString(3, participante.region());
//			st.executeUpdate();
//		} finally {
//			st.close();
//		}

}
