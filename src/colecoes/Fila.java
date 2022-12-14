package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		
		// Offer and Add -> adicionam elementos na fila
		// o comportamento difere quando a fila está cheia
		fila.add("Ana");
		fila.offer("Olá");
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		
		System.out.println(fila.peek());
		System.out.println(fila.element());
	}
}
