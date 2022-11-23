package colecoes;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		ArrayList<ListaUsuario> lista = new ArrayList<>();
		ListaUsuario u1 = new ListaUsuario("Renan");
		
		lista.add(u1);
		lista.add(new ListaUsuario("Carlos"));
		lista.add(new ListaUsuario("Luiz"));
		lista.add(new ListaUsuario("Jorge"));
		lista.add(new ListaUsuario("Cleonice"));
		
		System.out.println(lista);
	}
}
