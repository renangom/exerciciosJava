package Lambdas;

import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionInterface {
	public static void main(String[] args) {
		Function<Integer, String> parOuImpar = (num) -> {
			if(num % 2 == 0) {
				return "Par";
			}else {
				return "Impar";
			}
		};
		
		Consumer<String> imprimir = (string) -> {
			System.out.println(string);
		};
		
		imprimir.accept(parOuImpar.apply(23));
	}
}
