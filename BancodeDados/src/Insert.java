import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class Insert {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/java?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String name1="Paulo";
		int age = 65;
//		String sql = "INSERT INTO customers(name,age) values ('Vanda', 70)";
		String sql = "INSERT INTO customers(name,age) values ('"+name1+"',"+age+")";

			try {
			Connection con = DriverManager.getConnection(url, "root", "");
			PreparedStatement insert = con.prepareStatement(sql);
			insert.executeUpdate();
			JOptionPane.showMessageDialog(null,"Customer '"+name1+"' was inserted with success");
		} catch (Exception error) {
			error.printStackTrace();
		}

	}
}