package Lambdas;

import java.util.function.BinaryOperator;

public class Teste3 {
	public static void main(String[] args) {
		BinaryOperator<Double> calc = (x,y) -> {
			return x + y;
		};
		
		System.out.println(calc.apply(2d, 3d));
	}
}
