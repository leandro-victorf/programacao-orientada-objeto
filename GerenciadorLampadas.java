// impor lampadaINteligente
public class GerenciadorLampadas {
	private int contador = 0;
	private LampadaInteligente[] lampadas = new LampadaInteligente[10];
	
	public void adicionarLampada() {
		LampadaInteligente lampada = new LampadaInteligente();
		this.lampadas[this.contador] = lampada;
		this.contador = this.contador + 1;
	}
	
	public void ligarLampada(int indiceLampada) {
		LampadaInteligente lampada = this.lampadas[indiceLampada];
		
		if(lampada.getEstado() == false) {
			lampada.ligar();
		}
		this.lampadas[indiceLampada] = lampada;
	}
	