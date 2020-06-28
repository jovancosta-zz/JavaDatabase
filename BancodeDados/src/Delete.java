import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class Delete {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/java?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String name1="Paulo";
		int age = 65;
		String sql = "DELETE FROM customers WHERE name='"+name1+"'";

			try {
			Connection con = DriverManager.getConnection(url, "root", "");
			PreparedStatement delete = con.prepareStatement(sql);
			delete.executeUpdate();
			JOptionPane.showMessageDialog(null,"Customer '"+name1+"' was deleted with success");
		} catch (Exception error) {
			error.printStackTrace();
		}

	}
}