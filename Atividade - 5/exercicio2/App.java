package exercicio2;
import java.util.*;

public class App {
	public static void main (String []args) {
		Produto p = new Produto();
		Scanner in = new Scanner(System.in);
		System.out.println("informe o id ");
		p.setId(in.nextInt());
		System.out.println("informe o nome do produto ");
		p.setProduto(in.next());
		System.out.println("informe a descrição do produto ");
		p.setdescProduto(in.next());
		System.out.println("informe o valor do produto ");
		p.setValor(in.nextDouble());
		System.out.println("informe a data do cadastro ");
		p.setdataDoCadastro(in.next());
		
		System.out.println(p.getId());
		System.out.println(p.getProduto());
		System.out.println(p.getdescProduto());
		System.out.println(p.getValor());
		System.out.println(p.getdataDoCadastro());
		
		






	}
	
}
