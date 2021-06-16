
public class ContaCorrente {
	private String nome;
	private double saldo = 0.0;
	private static int quantidadeConta = 0;
	
	public ContaCorrente(String nome) {
		quantidadeConta++;
		this.nome = nome;
		double saldo = 0.0 ;
	}
	
	public ContaCorrente(String nome, double saldo) {
		quantidadeConta++;
		this.nome = nome;
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public String getTitular() {
		return this.nome;
	}
	
	public boolean depositar(double valor) {
		if (valor < 0.0)
			return false;
		else
		    this.saldo += valor;
			return true;
	}
	
	public boolean sacar(double valor) {
		if (valor < 0.0 || valor > this.saldo)
			return false;
		else
		    this.saldo -= valor;
			return true;
	}
	
	public static boolean transferir(ContaCorrente de, ContaCorrente para, double valor) {
		if (de.sacar(valor) == true && para.depositar(valor) == true)
		    return true;
		else
		    return false;
	}

	
	public static int getQuantidadeContas() {
		return quantidadeConta;
	}
}
