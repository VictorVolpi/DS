import java.util.Scanner;

public class questão3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int valor = 0, c = 0, d = 0, u = 0;
		System.out.print("digite um numero inteiro de 3 digitos");
		valor = in.nextInt();
				
		u = valor % 10;
		d = (valor % 100) / 10;
		c = valor / 100;

		System.out.println("o numero invertido fica "+ u+d+c);
	}
}