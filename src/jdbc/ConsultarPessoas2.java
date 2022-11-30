package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {
	public static void main(String[] args)throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		
		Connection conexao = FabricaConexao.getConexao();
		String sql = "SELECT * FROM pessoa WHERE nome LIKE ?";
		
		System.out.println("Informe o valor para pesquisa: ");
		String nome = entrada.nextLine();
		
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, "%" + nome + "%");
		ResultSet resultado = stmt.executeQuery();
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		while(resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nomeAchado = resultado.getString("nome");
			
			pessoas.add(new Pessoa(codigo, nomeAchado));
		}
		
		for(Pessoa p:pessoas) {
			System.out.println(p.getCodigo() + " ==> " + p.getNome());
		}
		
	}
}
