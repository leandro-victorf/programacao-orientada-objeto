package quadrilateros;

public class Quadrado extends Retangulo{
	private double ladoA;
	
	public void setLados (double ladoA) {
		super.ladoAB = ladoA;
		super.ladoBC = ladoA;
		super.ladoCD = ladoA;
		super.ladoDA = ladoA;
	}
	
	public String getPropriedades() {
		return  super.getPropriedades() + " Todos os lados tem o mesmo tamanho.";
	}
}
