package Lambdas;

import java.util.function.Consumer;

public class Consumidor {
	public static void main(String[] args) {
		Consumer<Produto> imprimir = (p) -> {
			System.out.println(p.nome);
		};
		
		Produto produto = new Produto("Caneta Bic Bolsonaro" , 1.0, 0);
		imprimir.accept(produto);
	}
}
