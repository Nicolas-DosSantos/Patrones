import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		try {
			BaseDeDatos db = BaseDeDatos.getInstance();
			db.query("FROM TABLA;"
					+ "SELECT ABRIBUTO");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
