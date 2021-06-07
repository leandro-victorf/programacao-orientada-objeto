import java.util.Scanner;

public class Piramide {
	public static void main (String [] args) {
		Scanner leitor = new Scanner (System.in);
		int n = leitor.nextInt ();
		int coluna = (2 * n) - 1;
		
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < coluna; k++) {
				if (k >= (n - 1 -i) && k < (coluna - n + 1 + i)) {
					System.out.print("1");
				}else System.out.print("-");
			}
			System.out.println();
		}
	}
}
