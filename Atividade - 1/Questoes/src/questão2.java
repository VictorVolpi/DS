import java.util.Scanner;
public class questão2 {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		double ValorAula, ValorHora, liquido, salario;
		
		System.out.println("Digite o valor da hora da aula");
		ValorHora = in.nextDouble();
		System.out.println("Digite as aulas dadas no mês");
		ValorAula= in.nextDouble();
		liquido = (ValorAula*ValorHora);
		if(liquido<=1212.00) {
			liquido =  liquido-((liquido/100)*7.5);
			System.out.println(liquido);
			
		}else if (liquido>1212.01) {
			salario =  liquido-((liquido/100)*9.0);
			System.out.println(salario);
			
		}else if (liquido>2427.35) {
			liquido =  liquido-((liquido/100)*12.0);
			System.out.println(liquido);
			
		}else if (liquido>23641.03) {
			liquido =  liquido-((liquido/100)*14.0);
			System.out.println(liquido);
			
		}else if (liquido>7087.22) {
			liquido =  liquido-((liquido/100)*14.5);
			System.out.println(liquido);
			
		}else if (liquido>12136.80) {
			liquido =  liquido-((liquido/100)*16.5);
			System.out.println(liquido);
		}
	}
	
}
