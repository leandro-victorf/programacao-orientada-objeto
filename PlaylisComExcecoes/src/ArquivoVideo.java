package multimidia;

public class ArquivoVideo extends ArquivoMultimidia {
	protected int largura, altura;
	
	public ArquivoVideo(String nomeArquivo, int tamanho, int largura, int altura) {
		super(nomeArquivo, tamanho);
		this.largura = largura;
		this.altura = altura;
	}
	
	public String toString() {
		return "Video: " + this.nomeArquivo + " " + this.tamanho;
	}
}
 