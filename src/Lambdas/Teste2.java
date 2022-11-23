package Lambdas;

public class Teste2 {
	public static void main(String[] args) {
		Calculo soma = (a,b) -> {
			return a+b;
		};
		
		Calculo multiplicacao = (a,b) -> {
			return a*b;
		};
		
		Calculo divisao = (a,b) -> {
			return a/b;
		};
		
		soma  = (a,b) -> a-b;
		
		System.out.println(soma.executar(2, 3));
		System.out.println(multiplicacao.executar(2, 3));
		System.out.println(divisao.executar(2, 3));
	}
}
