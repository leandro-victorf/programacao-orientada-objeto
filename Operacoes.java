public class Operacoes {
	private int A;
	private int B;
	private int C;
	private int valorMinimo = Integer.MAX_VALUE;
	private int valorMaximo = Integer.MIN_VALUE;
	
	public void setA(int a) {
		this.A = a;
	}
	
	public void setB(int b) {
		this.B = b;
	}
	
	public void setC(int c) {
		this.C = c;
	}
	
	private void comparacao(int valor) {
		if (valor < this.valorMinimo) {
			this.valorMinimo = valor;
		}

		if (valor > this.valorMaximo) {
			this.valorMaximo = valor;
		}
	}
	
	public int soma2() {
		int soma2 = this.A + this.B;
		this.comparacao(soma2);
		return soma2;
	}
	
	public int soma3() {
		int soma3 = this.A + this.B + this.C;
		this.comparacao(soma3);
		return soma3;
	}
	
	public int multiplica() {
		int multiplica = this.A * this.B;
		this.comparacao(multiplica);
		return multiplica;
	}
	
	public int getMin() {
		return this.valorMinimo;
	}
	
	public int getMax() {
		return this.valorMaximo;
	}
	
}
