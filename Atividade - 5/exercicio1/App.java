package setGet;
import java.util.*;
public class App {
	public static void main (String []args) {
		Paciente p = new Paciente();
		Scanner in = new Scanner(System.in);
		System.out.println("informe o nome ");
		p.setNome(in.next());
		System.out.println("informe a idade ");
		p.setIdade(in.nextInt());
		System.out.println("informe o peso ");
		p.setPeso(in.nextDouble());
		System.out.println("informe a altura ");
		p.setAltura(in.nextDouble());
		System.out.println("informe o email ");
		p.setEmail(in.next());
		
		System.out.println(p.getNome());
		System.out.println(p.getIdade());
		System.out.println(p.getPeso());
		System.out.println(p.getAltura());
		System.out.println(p.getEmail());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


}
