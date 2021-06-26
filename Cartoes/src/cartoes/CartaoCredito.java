package cartoes;

public class CartaoCredito extends CartaoDebito {
	public double valorCredito;
	
	public boolean pagarComCredito(double valor) {
		valorCredito = valorCredito + valor;
		return true;
	}
	
	public double quitarCredito(double valor) {
		valorCredito = valorCredito - valor;
		return valorCredito;
	}
	
	public double verificarExtrato() {
		return valorCredito;
	}
}
