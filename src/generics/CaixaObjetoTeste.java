package generics;

public class CaixaObjetoTeste {
	public static void main(String[] args) {
		Caixa caixaA = new Caixa();
		
		caixaA.guardar(2.3); // double --> Double 
		
		Integer coisa = (Integer) caixaA.abrir(); // irá dar erro, pois o casting não bate
		
		
		// USANDO GENERICS
		CaixaGen<String> caixaB = new CaixaGen<>();
		
		caixaB.abrir(); // retorna um string, sem precisar fazer casting
			
	}
}
