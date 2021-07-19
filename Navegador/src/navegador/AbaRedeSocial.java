package navegador;

public class AbaRedeSocial extends AbaNavegador {
	public void postar(String texto) {
		this.texto = texto;
		return "Post:" + this.texto;
	}
	
	@Override
	public String getTipo() {
		return "RedeSocial";
	}
}
