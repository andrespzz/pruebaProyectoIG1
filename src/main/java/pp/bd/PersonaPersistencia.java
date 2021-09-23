package pp.bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import pp.model.Persona;

public class PersonaPersistencia {
	private AccesoDb adb;

	public PersonaPersistencia() {
		adb = new AccesoDb();
	}

	public int insertPersona(Persona persona) {
		String query = "INSERT INTO PERSONAS (DNI, NOMBRE, APELLIDOS, F_NACIMIENTO, EDAD, TELEFONO, DIRECCION) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?)";

		Connection con = null;
		PreparedStatement pstmt = null;
		int res = 0;

		try {
			con = adb.getConexion();

			pstmt = con.prepareStatement(query);

			pstmt.setString(1, persona.getDni());
			pstmt.setString(2, persona.getNombre());
			pstmt.setString(3, persona.getApellidos());
			pstmt.setString(4, persona.getFechaNac());
			pstmt.setInt(5, persona.getEdad());
			pstmt.setString(6, persona.getTelefono());
			pstmt.setString(7, persona.getDireccion());

			res = pstmt.executeUpdate();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			res = -1;
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return res;
	}

}
