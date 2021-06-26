package cartoes;

public class CartaoLimitado extends CartaoCredito {
    
	public boolean pagarComCredito(double valor) {

		double valorFatura = this.valorCredito + valor;
		if (valorFatura <= 200) {
			valorCredito = valorCredito + valor;
			return  true;
		}else{
		    return false;
		}
	}
}
