package chat;

public class ListaMensagens {
	private Mensagem[] listaMensagem;

	
	public ListaMensagens() {
		this.listaMensagem = new Mensagem[0];
	}
	
	public void adicionarMensagem(Mensagem mensagem){
		int tamanhoAnterior = this.listaMensagem.length;
		Mensagem[] vetorAnterior =  new Mensagem[tamanhoAnterior];
		System.arraycopy(this.listaMensagem, 0, vetorAnterior, 0, tamanhoAnterior);
		this.listaMensagem = new Mensagem[tamanhoAnterior + 1];
		System.arraycopy(vetorAnterior, 0, this.listaMensagem, 0, tamanhoAnterior);
		this.listaMensagem[tamanhoAnterior] = mensagem;
		
	}
	
	public void responderMensagem(int indiceMensagemOriginal, Mensagem resposta) {
		this.listaMensagem[indiceMensagemOriginal].responder(resposta);
		adicionarMensagem(resposta);
	}
	
	public Mensagem[] getMensagens() {
		return this.listaMensagem;
	}
	
	public String[] getMensagensString() {
		int tamanho = this.listaMensagem.length;
		String[] listaMensagemString;
		listaMensagemString = new String[tamanho];
		for (int i = 0; i < tamanho; i++) {
			listaMensagemString[i] = listaMensagem[i].getRepresentacao();
		}
		return listaMensagemString;
	}
	
	public void like(int indiceMensagem){
	   this.listaMensagem[indiceMensagem].like();
	}
}
