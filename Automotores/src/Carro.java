package automotores;

public class Carro extends Veiculo {
    private int nPortas;
	
	public void setNumeroPortas(int nPortas) {
		this.nPortas = nPortas;
	}
	
	public int getNumeroPortas() {
		return this.nPortas;
	}
	
	public String getTipo () {
		return "Carro modelo " + super.modelo;
	}
}
