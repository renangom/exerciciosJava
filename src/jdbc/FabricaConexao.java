package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {
	public static Connection getConexao() {
		try {
			String stringDeConexao = "jdbc:mysql://localhost:3306/curso_java?verifyServerCertificate=false&useSSL=true";
			String usuario = "root";
			String senha = "143300j=";
			
			return  DriverManager.getConnection(stringDeConexao, usuario, senha);
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
