package Lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {
	public static void main(String[] args) {
		Predicate<Integer> isPar = (num) -> {
			if(num % 2 == 0 ) {
				return true;
			}else {
				return false;
			}
		};
		
		Predicate<Integer> isTresDigitos = (num) -> {
			if(num >= 100 && num <= 999) {
				return true;
			}else {
				return false;
			}
		};
		
		System.out.println(isPar.and(isTresDigitos).test(101));
	}
}
