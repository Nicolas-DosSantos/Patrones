// Singleton

// No contempla multihilo

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDeDatos {

	private static BaseDeDatos instancia;
	private Connection conexion;

	private BaseDeDatos(String url, String user, String pass) throws SQLException {

		conexion = DriverManager.getConnection(url, user, pass);
		conexion.setAutoCommit(true);
	}

	public static BaseDeDatos getInstance() throws SQLException {
		if (instancia == null) {
			instancia = new BaseDeDatos("jdbc:postgresql://servidor:5432/database", "usuario", "contraseña");
			
			/*
			 * Conectores
			 * 
			 * MySQL "jdbc:mysql://IPservidor:3306/database" 
			 * PostgreSQL"jdbc:postgresql://IPservidor:5432/database" 
			 * Oracle "jdbc:mysql://IPservidor:3306/database" 
			 * Access "jdbc:odbc:nombre_fuente_datos"
			 * 
			 */
		}
		return instancia;
	}

	public void query(String consulta) {

	}

}
