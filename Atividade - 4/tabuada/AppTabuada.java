package tabuada;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Tabuador tabuada = new Tabuador();
		
		System.out.print("Qual tabuada deseja calcular: ");
		tabuada.fator = in.nextInt();
		tabuada.fazerTabuada();
	}

}
