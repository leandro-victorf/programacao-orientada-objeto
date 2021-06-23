package automotores;

public class Motocicleta extends Veiculo {
    private boolean temCarroLateral;
    
	public void setTemCarroLateral(boolean temCarroLateral) {
		this.temCarroLateral = temCarroLateral;
	}
	
	public boolean getTemCarroLateral() {
		return this.temCarroLateral;
	}
	
	public String getTipo () {
		return "Motocicleta modelo " + super.modelo;
	}
}
