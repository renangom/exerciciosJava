package Lambdas;

import java.util.function.UnaryOperator;

public class UnaryInterface {
	public static void main(String[] args) { 
		UnaryOperator<Integer> maisDois = (num) -> {
			return num + 2;
		};
		
		UnaryOperator<Integer> vezesDois = (num) -> {
			return num * 2;
		};
		
		UnaryOperator<Integer> aoQuadrado = (num) -> {
			return num*num;
		};
		
		System.out.println(maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(3));
		
		//Da pra fazer composições de funções matemáticas
		System.out.println(aoQuadrado.compose(vezesDois).compose(maisDois).apply(3));
	}
}
