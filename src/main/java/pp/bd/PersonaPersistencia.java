package pp.bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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

 	public Persona selecNomPers(String nombre) {
		Persona pers = null;

		String query = "SELECT DNI, NOMBRE, APELLIDOS, F_NACIMIENTO, EDAD, TELEFONO, DIRECCION FROM PERSONAS WHERE NOMBRE LIKE ?";

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rslt = null;

		try {
			con = adb.getConexion();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, "%" + nombre + "%");
			rslt = pstmt.executeQuery();

			String nom;
			String dni;
			String ape;
			String fnac;
			int edad;
			String telf;
			String dir;

			while (rslt.next()) {
				dni = rslt.getString(1);
				nom = rslt.getString(2);
				ape = rslt.getString(3);
				fnac = rslt.getString(4);
				edad = rslt.getInt(5);
				telf = rslt.getString(6);
				dir = rslt.getString(7);

				pers = new Persona(dni, nom, ape, fnac, edad, telf, dir);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rslt != null)
					rslt.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return pers;

	}

	public int updatePersona(Persona persona) {
		
		String query = "UPDATE PERSONAS SET DNI = ?, APELLIDOS = ?, F_NACIMIENTO = ?, EDAD = ?, TELEFONO = ?, DIRECCION = ? WHERE NOMBRE = ?";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		int pers = 0;
		
		try {
			con = adb.getConexion();
			pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, persona.getDni());
			pstmt.setString(2, persona.getApellidos());
			pstmt.setString(3, persona.getFechaNac());
			pstmt.setInt(4, persona.getEdad());
			pstmt.setString(5, persona.getTelefono());
			pstmt.setString(6, persona.getDireccion());
			pstmt.setString(7, persona.getNombre());
			
			pers = pstmt.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			pers = -1;
			e.printStackTrace();
		}finally {
			try {
				if (pstmt != null) pstmt.close();
				if (con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return pers;
		
		//OTRA OPCIÓN
		/*int pers = 0;

		String query = "UPDATE PERSONAS SET DNI = ?, NOMBRE = ?, APELLIDOS = ?, F_NACIMIENTO = ?, EDAD = ?, TELEFONO = ?, DIRECCION = ? WHERE NOMBRE = ?";

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = adb.getConexion();
			pstmt = con.prepareStatement(query);

			pstmt.setString(1, persona.getDni());
<<<<<<< HEAD
			pstmt.setString(2, persona.getApellidos());
			pstmt.setString(3, persona.getFechaNac());
			pstmt.setInt(4, persona.getEdad());
			pstmt.setString(5, persona.getTelefono());
			pstmt.setString(6, persona.getDireccion());
			pstmt.setString(7, persona.getNombre());
			
=======
			pstmt.setString(2, persona.getNombre());
			pstmt.setString(3, persona.getApellidos());
			pstmt.setString(4, persona.getFechaNac());
			pstmt.setInt(5, persona.getEdad());
			pstmt.setString(6, persona.getTelefono());
			pstmt.setString(7, persona.getDireccion());
	
>>>>>>> b2cbedbb0094db251e976cc6b4891e24b42a0114

			// res acumula el numero de registros modificados
			pers = pstmt.executeUpdate();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			pers = -1;
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return pers;*/
	}
	
	public ArrayList<Persona> selectPersonas() {
		ArrayList<Persona> listaPeronas = new ArrayList<Persona>();
		String query = "SELECT DNI, NOMBRE, APELLIDOS, F_NACIMIENTO, EDAD, TELEFONO, DIRECCION FROM PERSONAS";
		
		Connection con = null;
		java.sql.Statement stmt = null;
		ResultSet rslt = null;
		try {
			con = adb.getConexion();
			
			stmt = con.createStatement();
			
			rslt = stmt.executeQuery(query);
			
			String dni;
			String nom;
			String ape;
			String nac;
			int edad;
			String tel;
			String dir;
			
			
			while (rslt.next()) {
				dni = rslt.getString(1);
				nom = rslt.getString(2);
				ape = rslt.getString(3);
				nac = rslt.getString(4);
				edad = rslt.getInt(5);
				tel = rslt.getString(6);
				dir = rslt.getString(7);
				
				
				listaPeronas.add(new Persona(dni, nom, ape, nac, edad, tel, dir));
				
				}
			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rslt != null) rslt.close();
				if (stmt != null) stmt.close();
				if (con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return listaPeronas;
		
	}
	
	public int deletePersonas(String dniPer) {
		String query = "DELETE FROM PERSONAS WHERE DNI = ?";
		int res = 0;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			
			con = adb.getConexion();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, dniPer);
			res = pstmt.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if (pstmt != null) pstmt.close();
				if (con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return res;
	}

}
