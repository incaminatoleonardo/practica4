package persistenciaJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ar.unrn.tp4.ej3.modelo.Concurso;
import ar.unrn.tp4.ej3.modelo.PersistenciaConcursos;

public class JdbcConcurso implements PersistenciaConcursos {// aca debo leer concurso

	@Override
	public List<Concurso> leerConcursos() {

		List<Concurso> concursos = new ArrayList<>();

		Connection con = null;
		try {

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/objetos2", "root", "");
			Statement statement = con.createStatement();
			ResultSet rs = statement
					.executeQuery("select idConcurso, nombre, fechaInicioInsc, fechaFinInsc from concursos");

			while (rs.next()) {
				Concurso concurso = new Concurso(rs.getInt("idConcurso"), rs.getString("nombre"),
						LocalDate.of(2022, 5, 1), LocalDate.of(2022, 6, 1));
//						rs.getDate("fechaInicioInsc").toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
//						rs.getDate("fechaFinInsc").toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
				concursos.add(concurso);
			}

		} catch (SQLException e) {
			throw new RuntimeException("No se leer en la BD", e);

		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					throw new RuntimeException("No pudo cerrar conexion", e);

				}
			}
		}

		return concursos;
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
