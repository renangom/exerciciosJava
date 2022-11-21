package generics;

public class CaixaNumeroTeste {
	public static void main(String[] args) {
		
		//Erro pois só é possível trabalhar com number
		//CaixaNumero<String> caixaA = new CaixaNumero<>();
		//caixaA.guardar("Teste");
		
		CaixaNumero<Double> caixaA = new CaixaNumero<>();
		caixaA.guardar(3.1415);
		System.out.println(caixaA.abrir());
	}
}
