package persistenciaJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

import ar.unrn.tp4.ej3.modelo.Concurso;
import ar.unrn.tp4.ej3.modelo.PersistenciaConcursos;

public class JdbcConcurso implements PersistenciaConcursos {// aca debo leer concurso

	@Override
	public List<String> leerConcursos() {

		List<Concurso> concursos = new ArrayList<>();

		Connection con = null;
		try {

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/objetos2", "root", "");
			PreparedStatement statement = (PreparedStatement) con.createStatement();
			ResultSet rs = statement
					.executeQuery("select idConcurso, nombre, fechaInicioInsc, fechaFinInsc from concursos");

			while (rs.next()) {
				Concurso concurso = new Concurso(rs.getInt("idConcurso"), rs.getString("nombre"),
						rs.getDate("fechaInicioInsc").toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
						rs.getDate("fechaFinInsc").toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
			}

			statement.executeUpdate();

		} catch (SQLException e) {
			throw new RuntimeException("No se pudo guardar en BD", e);

		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					throw new RuntimeException("No pudo cerrar conexion", e);

				}
			}
		}

		return null;
	}

//	List<Beneficio> beneficios = new ArrayList<Beneficio>();
//	try {
//		Connection conn = ConnectionManager.getConnection(labels);
//		Statement statement = conn.createStatement();
//		ResultSet rs = statement
//				.executeQuery("SELECT b.idBeneficio, b.descripcion,  b.costo  " + "FROM Beneficios b");
//
//		while (rs.next()) {
//			Beneficio beneficio = new Beneficio(rs.getInt("idBeneficio"), rs.getString("b.descripcion"),
//					rs.getInt("costo"));
//			beneficios.add(beneficio);
//		}
//	} catch (SQLException e) {
//		throw new AppException(labels.getString("exception.sql")+":"+e.getMessage());
//	}  finally {
//		ConnectionManager.disconnect();
//	}
//	return beneficios;

}
