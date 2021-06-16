public class Paralelogramo {
	private int ladoA;
	private int ladoB;
	
	
	public int getArea() {
		return this.ladoA * this.ladoB;
	}
	
	public String getTipo() {
	    String tipo;
		if(this.ladoA == this.ladoB)
			tipo = "quadrado";
		else
			tipo = "retangulo";
		return "Paralelogramo " + tipo;
	}
	
	public Paralelogramo(int ladoA) {
	   this.ladoA = ladoA;
	   this.ladoB = ladoA;
	}
	
	public Paralelogramo(int ladoA, int ladoB) {
        this.ladoA = ladoA;
	    this.ladoB = ladoB;
	}
}
