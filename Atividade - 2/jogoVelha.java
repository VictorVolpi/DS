import java.util.Scanner;

public class jogoVelha {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String matriz[][] = new String [3][3];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("Digite o valor da posição [" + i + "] [" + j + "] da matriz");
				matriz[i][j] = in.next();
			}
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}
		
		int j = 0;
		
		for (int i = 0; i < 3; i++) {
			if (matriz[i][j] == "X") {
				
			}
		}
		
		for (int i = 0; i < 3; i++) {
			if (matriz[i][0] == "X") {
				
			}
		}
	}

}
