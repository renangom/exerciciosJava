package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class testeConexao {
	public static void main(String[] args)throws SQLException {
		String stringDeConexao = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true";
		String usuario = "root";
		String senha = "143300j=";
		
		Connection conexao = DriverManager.getConnection(stringDeConexao, usuario, senha);
		System.out.println("Conexão feita com sucesso");
		
		conexao.close();
	}
}
