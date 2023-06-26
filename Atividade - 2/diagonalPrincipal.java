import java.util.Scanner;

public class diagonalPrincipal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int matriz[][] = new int [5][5], j;
		
		for (int i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				System.out.println("Digite o valor da posição [" + i + "] [" + j + "] da matriz");
				matriz[i][j] = in.nextInt();
			}
		}
		
		
		for (int i = 0; i < 5; i++) {
			j = i;
			System.out.print(matriz[i][j] + " ");
		}
	}
}