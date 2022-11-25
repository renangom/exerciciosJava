package StreamAPI;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class iterador {
	public static void main(String[] args) {
		List<String> lista = Arrays.asList("Lu", "Gui", "Luca", "Ana");
		
		System.out.println("Primeira forma");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println("Segunda forma");
		for(String nome : lista) {
			System.out.println(nome);
		}
		
		System.out.println("Usando iterator");
		Iterator<String> iterator = lista.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("Usando Stream");
		Stream<String> st = lista.stream();
		st.forEach(System.out::println);
	}
}
