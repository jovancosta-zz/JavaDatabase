import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BancoDeDados {

	public static void main(String[] args) {
		System.out.println("teste1");
		String url = "jdbc:mysql://localhost/java?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		try {
			Connection conexao = DriverManager.getConnection(url, "root", "");
			PreparedStatement pesquisa = conexao.prepareStatement("SELECT * FROM pessoas");

			ResultSet resultado = pesquisa.executeQuery();

			while (resultado.next()) {
				String nome = resultado.getString("nome");
				String idade = resultado.getString("idade");
				System.out.println("Nome:" +nome+ " Idade:" +idade);

			}
		} catch (Exception erro) {
			erro.printStackTrace();
		}

	}
}