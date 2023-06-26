package pessoas;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Pessoa pessoa = new Pessoa();
		
		System.out.print("Nome: ");
		pessoa.nome = in.next();
		
		System.out.print("Idade: ");
		pessoa.idade = in.nextInt();
		
		System.out.println("Peso em Kg: ");
		pessoa.peso = in.nextDouble();
		
		String[] a = pessoa.dadosPessoa();
		for(int i = 0; i < 5; i++) {
			System.out.println(a[i]);
		}

	}

}
