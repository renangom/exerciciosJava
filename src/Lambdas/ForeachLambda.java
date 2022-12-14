package Lambdas;

import java.util.Arrays;
import java.util.List;

public class ForeachLambda {
	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Gui", "Renan");
		
		System.out.println("Forma tradicional");
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\n Lambda #01...");
		aprovados.forEach((String nome) -> {
			System.out.println(nome);
		});
		
		System.out.println("\nMethod reference");
		aprovados.forEach(System.out::println);
		
		aprovados.forEach((nome) -> {
			meuImprimir(nome);
		});
	}
	
	static void meuImprimir(String nome) {
		System.out.println("Oi meu nome é: " + nome);
	}
}
