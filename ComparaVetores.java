import java.util.Scanner;

public class ComparaVetores {
	public static void main (String [] args) {
		Scanner leitor = new Scanner (System.in);
		int contador = 0;
		int n = leitor.nextInt ();
		int[] vetorA = new int[n];
		int[] vetorB = new int[n];
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = leitor.nextInt ();
		}
		
		for(int i = 0; i < vetorB.length; i++) {
			vetorB[i] = leitor.nextInt ();
		}
		
		for(int i = 1; i < n; i++) {
			int constante = vetorB[0] / vetorA[0];
			if (constante != vetorB[i] / vetorA[i]) {
				contador++;
			}
		}
		if(contador == 0) {
			System.out.println("SIM");
		}else System.out.println("NAO");
	}
}
