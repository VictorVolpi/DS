import java.util.*;
public class apps {

	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		Jogador j= new Jogador();
		System.out.println("Digite o nome do Jogador :");
		j.nome=sc.nextLine();
		System.out.println("O Jogador escalado foi :"+ j.nome);
		j.chutar();
		j.fazerGOl();
		
	}
		
	}
 