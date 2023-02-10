package chat;

class MensagemTexto extends Mensagem{
	private String texto;
	
	public MensagemTexto(String texto) {
		this.texto = texto;
	}

	public String getRepresentacao() {
		return this.texto + " (likes=" + this.qtdLike + ")";
	}
}

class MensagemImagem extends Mensagem{

	private String arquivoImagem;
	private int largura, altura;
	
	public MensagemImagem(String arquivoImagem, int largura, int altura) {
		this.arquivoImagem = arquivoImagem;
		this.largura = largura;
		this.altura = altura;
	}

	public String getRepresentacao() {
		if (this.resposta != null){
		    return this.arquivoImagem  + " RESPOSTA A [Figura1 "+ this.largura + "x" + this.altura + "]" + " (likes=" + this.qtdLike + ")";
		} else {
	    	return this.arquivoImagem  + " "+ this.largura + "x" + this.altura + " (likes=" + this.qtdLike + ")";
		}
	}
}

public abstract class Mensagem {
	protected Mensagem resposta;
	int qtdLike = 0;
	
	public Mensagem(){
	    this.qtdLike = 0;
	}
	
	public void like() {
		this.qtdLike++;
	}
	
	public void responder( Mensagem resposta) {
		this.resposta =  resposta;	
	}
	
	abstract String getRepresentacao();
}
