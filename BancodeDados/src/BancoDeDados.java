import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BancoDeDados {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/java?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		try {
			Connection con = DriverManager.getConnection(url, "root", "");
			PreparedStatement search = con.prepareStatement("SELECT * FROM customers");

			ResultSet rs = search.executeQuery();

			while (rs.next()) {
				String name = rs.getString("name");
				String age = rs.getString("age");
				System.out.println("Name:" +name+ " Age:" +age);

			}
		} catch (Exception error) {
			error.printStackTrace();
		}

	}
}
