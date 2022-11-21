package generics;

public class CaixaGen<TIPO> {
	
	private TIPO coisa;
	
	public void guardar(TIPO coisa) {
		this.coisa = coisa;
	}
	
	public TIPO abrir() {
		return this.coisa;
	}
}
