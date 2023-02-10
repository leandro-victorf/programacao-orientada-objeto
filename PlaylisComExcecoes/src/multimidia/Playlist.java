package multimidia;

class QuantidadeLimiteArquivos extends Exception {
	public QuantidadeLimiteArquivos() {
		super("Quantidade limite de arquivos foi atingida.");
	}
}

class IndiceArquivoInvalido extends Exception {
	public IndiceArquivoInvalido(int indiceArquivo) {
		super("Indice de arquivo invalido = " + indiceArquivo);
	}
}

public class Playlist {
	private ArquivoMultimidia[] playlist;
	private int indice;
	
	public Playlist() {
		this.playlist = new ArquivoMultimidia[10];
		this.indice = 0;
	}
	
	public void adicionarItem(ArquivoMultimidia arquivo) throws QuantidadeLimiteArquivos {
		if(this.indice < 10){
			this.playlist[this.indice] = arquivo;
			this.indice++;
		}else{
			throw new QuantidadeLimiteArquivos();
		}
	}
	
	public void renomearItem(int indiceArquivo, String novoNomeArquivo) throws IndiceArquivoInvalido {
		
		if( indiceArquivo < this.indice && indiceArquivo >= 0){
			this.playlist[indiceArquivo].setNomeArquivo(novoNomeArquivo);
		} else{
			throw new IndiceArquivoInvalido(indiceArquivo);
		}
	}
	
	public void moverParaInicio(int indiceArquivo) throws IndiceArquivoInvalido {
		ArquivoMultimidia auxiliar;
		if ( indiceArquivo < this.indice && indiceArquivo >= 0) {
			auxiliar = this.playlist[indiceArquivo];
			for(int i = indiceArquivo; i > 0; i--) {
				this.playlist [i] = this.playlist [i - 1];
			}
			this.playlist[0] = auxiliar;
		} else {
			throw new IndiceArquivoInvalido(indiceArquivo);
		}
	}
	
	public String[] listarArquivos() {
		String[] arquivos;
		arquivos = new String[this.indice];
		for (int i = 0; i< this.indice; i++) {
			arquivos[i] = this.playlist[i].toString();
		}
		return arquivos;
	}
	
	public void ordenarArquivos(int tipo) {
		if (tipo == 2) {
			for(int i = 0; i < this.indice; i++) {
				for(int j = i + 1; j < this.indice; j++) {
					if(this.playlist[i].getTamanhoArquivo() > this.playlist[j].getTamanhoArquivo()) {
						ArquivoMultimidia auxiliar;
						auxiliar = this.playlist[j];
						this.playlist[j] = this.playlist[i];
						this.playlist[i] = auxiliar;
					} else if(
						this.playlist[i].getTamanhoArquivo() == this.playlist[j].getTamanhoArquivo()
						&& this.playlist[i].getNomeArquivo().compareTo(this.playlist[j].getNomeArquivo()) > 0
					) {
						ArquivoMultimidia auxiliar;
						auxiliar = this.playlist[j];
						this.playlist[j] = this.playlist[i];
						this.playlist[i] = auxiliar;
					}
				}
			}
		} else if (tipo == 1){
			for(int i = 0; i < this.indice; i++) {
				for(int j = i + 1; j < this.indice; j++) {
					if(this.playlist[i].getNomeArquivo().compareTo(this.playlist[j].getNomeArquivo()) > 0) {
						ArquivoMultimidia auxiliar;
						auxiliar = this.playlist[j];
						this.playlist[j] = this.playlist[i];
						this.playlist[i] = auxiliar;
					} else if(
						this.playlist[i].getNomeArquivo().compareTo(this.playlist[j].getNomeArquivo()) == 0
						&& this.playlist[i].getTamanhoArquivo() > this.playlist[j].getTamanhoArquivo()
					) {
						ArquivoMultimidia auxiliar;
						auxiliar = this.playlist[j];
						this.playlist[j] = this.playlist[i];
						this.playlist[i] = auxiliar;
					}
				}
			}
		}
	}
	
}
