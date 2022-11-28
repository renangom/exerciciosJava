package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		
		Stream<String> linguagens = Stream.of("Java ", "Lua ", "Javascript \n");
		linguagens.forEach(print);
		
		String[] maisLangs = {"Python ", "Lisp ", "Pearl ", "Go\n"};
		Stream.of(maisLangs).forEach(print);
		
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outrasLangs.stream().forEach(print);
	}
}
