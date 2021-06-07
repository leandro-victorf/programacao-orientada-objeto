import java.util.Scanner;

public class Estatisticas {
	public static void main (String [] args) {
		Scanner leitor = new Scanner (System.in);
		int soma = 0, minimo = Integer.MAX_VALUE, maximo = 0;
		float media, contadorItens = 0.0f;
		
		while (true) {
    		int n = leitor.nextInt ();
		    if (n < 0) break;
		    if (n < minimo) {
		        minimo = n;
		    }
		    
		    if (n > maximo) {
		        maximo = n;
		    }
		    
		    soma +=n;
		    contadorItens ++;
		}
		media = soma / contadorItens;
	    System.out.println(soma);
	    System.out.println(String.format("%.2f", media));
	    System.out.println(minimo);
	    System.out.println(maximo);
	    
	}
}