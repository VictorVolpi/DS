import java.util.Scanner;

public class somaMatrizes {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int matriz[][] = new int [4][2], soma = 0;
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println("Digite o valor da posição [" + i + "] [" + j + "] da matriz");
				matriz[i][j] = in.nextInt();
			}
		}
		
		for (int i = 0; i < 4; i++) {
			soma = 0;
			for (int j = 0; j < 2; j++) {                                                                                                                                                                   
				soma += matriz[i][j];
			}
			System.out.println("Soma total da linha [" + i + "]: " + soma);
		}
	}

}
