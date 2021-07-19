package navegador;

public class AbaBuscador extends AbaNavegador {

	public void postar(String expressao) {
		this.expressao = expressao;
		return "Busca:" + this.expressao;
	}
	
	@Override
	public String getTipo() {
		return "Buscador";
	}
}
