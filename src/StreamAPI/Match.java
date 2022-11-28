package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 1.50);
		Aluno a2 = new Aluno("Roger", 1.70);
		Aluno a3 = new Aluno("Renan", 1.74);
		Aluno a4 = new Aluno("Maria", 1.64);
		
		List<Aluno> list = Arrays.asList(a1, a2,a3,a4);
		Predicate<Aluno> aprovado = a -> a.altura >= 1.69;
		
		System.out.println(list.stream().anyMatch(aprovado));
	}
}
