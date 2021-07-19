package navegador;

public abstract class AbaNavegador {
	protected String titulo;
	
	public String getTitulo() {
		return titulo;
	}
	
	public abstract String getTipo();
}
