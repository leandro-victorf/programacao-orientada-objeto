import java.util.Scanner;

public class CampoMinado {
	public static void main (String [] args) {
		Scanner leitor = new Scanner (System.in);
		int linha = leitor.nextInt ();
		int coluna = leitor.nextInt ();
		int[][] mapaCampo = new int[linha][coluna];
		
		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				mapaCampo[i][j] = leitor.nextInt ();
			}
		}
		
		int linhaCelula = leitor.nextInt ();
		int colunaCelula = leitor.nextInt ();
		int soma = 0;
		int linhaBombaInicio, colunaBombaInicio,linhaBombaFim, colunaBombaFim;
		
		if (linhaCelula == 0) {
			linhaBombaInicio = linhaCelula;
		}else linhaBombaInicio = linhaCelula -1;
		
		if (linhaCelula == (linha - 1)) {
			linhaBombaFim = linhaCelula;
		}else linhaBombaFim = linhaCelula + 1;
		
		if (colunaCelula == 0) {
			colunaBombaInicio = colunaCelula;
		}else colunaBombaInicio = colunaCelula -1;
		
		if (colunaCelula == (coluna - 1)) {
			colunaBombaFim = colunaCelula;
		}else colunaBombaFim = colunaCelula + 1;
		
		for (int i = linhaBombaInicio; i <= linhaBombaFim; i++){
			for (int j = colunaBombaInicio; j <= colunaBombaFim; j++){
				soma += mapaCampo[i][j];
			}
		}
		int totalBombas = soma - mapaCampo[linhaCelula][colunaCelula];
		System.out.println(totalBombas);	
	}
}
