package matematica;

public class Fracao {
	private int numerador = 1;
	private int denominador = 1;
	
	public Fracao() {
		int numerador = 1;
		int denominador = 1;
	}
	
	public Fracao(int numerador) {
		this.numerador = numerador;
	}
	
	public Fracao(int numerador, int denominador) {
		int divisorMaximo;
		
		if (numerador > denominador )
		    divisorMaximo = numerador;
		else 
		    divisorMaximo = denominador;
		    
	    if(divisorMaximo % 2 != 0)
	        divisorMaximo +=1;
	    
	    for (int i = 2; i <= divisorMaximo/2; i++){
	        while(numerador % i == 0 && denominador % i == 0){
	            numerador /= i;
	        	denominador /= i;
	        }
	    }
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	public String getRepresentacao() {
		return this.numerador + "/" + this.denominador;
	}
	
	public Fracao somar(Fracao f2) {
		int numeradorSomaUm = (numerador * f2.denominador) + (f2.numerador * this.denominador);
		int denominadorSomaUm = this.denominador * f2.denominador;
		
		return new Fracao(numeradorSomaUm, denominadorSomaUm);
	}
	
	public static Fracao somar(Fracao f1, Fracao f2) {
	    int numeradorSoma = (f1.numerador * f2.denominador) + (f2.numerador * f1.denominador);
		int denominadorSoma = f1.denominador * f2.denominador;
		
		return new Fracao(numeradorSoma, denominadorSoma);
	}
	
	public static Fracao somar(Fracao[] fracoes) {
	    Fracao sum = fracoes[0];
	    for(int i = 1; i < fracoes.length; i++){
	        sum = sum.somar(fracoes[i]);
	    }
        return new Fracao(sum.numerador, sum.denominador);
	}
	
	public static Fracao multiplicar(Fracao f1, Fracao f2) {
		int numeradorMultiplicacao = f1.numerador * f2.numerador;
		int denominadorMultiplicacao = f1.denominador  * f2.denominador;
		return new Fracao(numeradorMultiplicacao, denominadorMultiplicacao);
	}
}
