package colecoes;

import java.util.HashSet;
import java.util.Set;

public class SetComportado {
	public static void main(String[] args) {
		Set<String> lista = new HashSet<String>();
		
		lista.add("Olá");
		lista.add("Teste");
		lista.add("teste");
		System.out.println(lista);
	}
}
