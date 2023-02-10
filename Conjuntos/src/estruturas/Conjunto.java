package estruturas;

public class Conjunto implements Lista {
	
	private int qtdItem;
	private NoLista inicio = null;
	
	static class NoLista {
		int numero;
		
		NoLista prox = null;
		
		NoLista(int numero) {
			this.numero = numero;
		}
		
	}
	
	public int getQtd() {
		return this.qtdItem;
	}
	
	public void adicionar(int numero){
		if (this.buscar(numero) != -1) return;
		NoLista novo = new NoLista(numero);
				
		if (this.inicio == null) {
			this.inicio = novo;
		}else {
			NoLista anterior = null;
			NoLista atual = this.inicio;
			anterior = atual;
			anterior.prox = novo;

		}
		this.qtdItem = this.getQtd() + 1;
	}
	
	public void remover(int numero) {
		if (this.inicio != null) {
			NoLista anterior = null;
			NoLista atual = this.inicio;
			while(atual != null && numero != atual.numero) {
				anterior = atual;
				atual = atual.prox;
			}
			if (atual == null) return;
			if (anterior == null) {
				this.inicio = atual.prox;
			}else {
				anterior.prox = atual.prox;
			}
			atual.prox = null;
			atual = null;
			
			this.qtdItem = this.getQtd() - 1;
		}
	}
	
	public int buscar(int numero) {
		int i = 0;
		for(NoLista atual = this.inicio; atual != null; atual = atual.prox) {
			if (atual.numero == numero) {
				return i;
			} else {
				i++;
			}
		}
		return -1;
	}
	

	public String toString() {
		String listaStr = "";
		for (NoLista atual = this.inicio; atual != null; atual = atual.prox) {
		    if (atual.prox != null) {
			    listaStr += atual.numero + " ";
		    } else {
		        listaStr += atual.numero;
		    }
		}
		return listaStr;
	}
	
	public static Conjunto uniao(Conjunto a, Conjunto b) {
		Conjunto u = new Conjunto();
		String[] vetorA = a.toString().split(" ");
		for (int i = 0; i < vetorA.length; i++) {
			int num = Integer.parseInt(vetorA[i]);
			u.adicionar(num);
		}
		String[] vetorB = b.toString().split(" ");
		for (int i = 0; i < vetorB.length; i++) {
			int num = Integer.parseInt(vetorB[i]);
			if (u.buscar(num) == -1) {
				u.adicionar(num);
			}
		}
		return u;
	}
	
	public static Conjunto intersecao(Conjunto a, Conjunto b) {
		Conjunto u = new Conjunto();
		String[] vetorA = a.toString().split(" ");
		for (int i = 0; i < vetorA.length; i++) {
			int num = Integer.parseInt(vetorA[i]);
			if (b.buscar(num) != -1) {
				u.adicionar(num);
			}
		}
		return u;
	}
}
