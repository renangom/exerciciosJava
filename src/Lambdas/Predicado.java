package Lambdas;

import java.util.function.Predicate;

public class Predicado {
	public static void main(String[] args) {
		Predicate<Produto> isCaro = (produto) -> {
			if(produto.preco*(1-produto.desconto) > 1000) {
				return true;
			}else {
				return false;
			}
		};
		
		Produto produto = new Produto("Notebook" , 1000.89, 0.15);
		System.out.println(isCaro.test(produto));
	}
}	
