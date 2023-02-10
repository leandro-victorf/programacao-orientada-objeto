package multimidia;

public class ArquivoAudio extends ArquivoMultimidia{

	protected boolean audioHD;
	
	public ArquivoAudio(String nomeArquivo, int tamanho, boolean audioHD) {
		super(nomeArquivo, tamanho);
		this.audioHD = audioHD;	
	}
	
	public String toString() {
		return "Audio: " + this.nomeArquivo + " " + this.tamanho;
	}
}
