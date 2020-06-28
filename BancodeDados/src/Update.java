import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/java?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String sql = "UPDATE pessoas SET nome='victoria' , idade=21 WHERE idade=19";
			try {
			Connection conexao = DriverManager.getConnection(url, "root", "");
			PreparedStatement atualizar = conexao.prepareStatement(sql);
			atualizar.executeUpdate();
		} catch (Exception erro) {
			erro.printStackTrace();
		}

	}
}