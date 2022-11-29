package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class CreatePessoa {
	public static void main(String[] args) throws SQLException {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o nome: ");
		String nome = scan.next();
		
		Connection conexao = FabricaConexao.getConexao();
		
		
		String sql = "INSERT INTO pessoa (nome) VALUES (?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1 , nome);
		stmt.execute();
		
		System.out.println("Pessoa incluída com sucesso");
		
		
		
		scan.close();
	}
}
