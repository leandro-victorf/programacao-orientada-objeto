package quadrilateros;

public class Paralelogramo extends Quadrilatero{
	private double ladoA;
	private double ladoB;
	
	public void setLados (double ladoA, double ladoB) {
		super.ladoAB = ladoA;
		super.ladoBC = ladoB;
		super.ladoCD = ladoA;
		super.ladoDA = ladoB;
	}
	
	public String getPropriedades() {
		return  super.getPropriedades() + " Lados opostos paralelos.";
	}
}
