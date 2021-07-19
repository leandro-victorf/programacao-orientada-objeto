package navegador;

public class Navegador {
	private AbaNavegador[] abasAbertas;
	private int limiteAbas;
	
	public Navegador(int limiteAbas) {
		this.limiteAbas =  limiteAbas;
	}
	
	public AbaNavegador abrirAba(int tipo, String titulo) {
		if (abasAbertas.length > this.limiteAbas) {
			return null;
		}else {
			if(tipo == 1) {
				titulo = "AbaBuscador";
				return titulo;
			}else {
				titulo = "AbaRedeSocial";
			}
			return titulo;
		}
	}
}
