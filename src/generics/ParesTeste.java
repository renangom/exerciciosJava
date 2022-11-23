package generics;

public class ParesTeste {

	public static void main(String[] args) {
		Pares<Integer, String> resultadoConcurso = new Pares<>();
		
		resultadoConcurso.adicionar(1, "Maria");
		resultadoConcurso.adicionar(2, "Pedro");
		resultadoConcurso.adicionar(3, "Renan");
		resultadoConcurso.adicionar(2, "Luiz");
		
		System.out.println(resultadoConcurso.getValor(2));
	}
}
