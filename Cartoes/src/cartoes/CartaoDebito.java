package cartoes;

public class CartaoDebito {
	protected String titular;
	protected double saldo ;
	protected double valor;
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public double adicionarSaldoDebito(double valor) {
		saldo = saldo + valor;
		return saldo;
	}
	
	public double verificarSaldoDebito() {
		return saldo;
	}
	
	public boolean pagarComDebito(double valor) {
		if (valor<= saldo) {
			saldo = saldo - valor;
			return true;
		}else {
			return false;
		}
	}
}
