public class Porta {

	private String nome = "Porta sem nome"; 
 	private boolean aberta = true;
 	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	

	public boolean estaAberta() {
		if (aberta){
		    return true;
		}else{
		    return false;
		} 
	}
	
	public int abrir() {
		if(this.estaAberta() == true) {
			return 1;
		}else {
			this.aberta = true;
			return 0;
		}
	}
	
	public int fechar() {
		if(this.estaAberta() == false) {
			return 1;
		}else {
		    this.aberta = false;
			return 0;
		}
	}
}
