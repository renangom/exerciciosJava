package Lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class OperadorBinario {
	public static void main(String[] args) {
		BinaryOperator<Double> media = (n1, n2) -> {
			return (n1+n2)/2;
		};
		
		BiFunction<Double, Double, String> resultado = (n1,n2) -> {
			if((n1+n2)/2 >= 7) {
				return "Aprovado";
			}else {
				return "Reprovado";
			}
		};
	}
}
