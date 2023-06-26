package pessoas;

public class Pessoa {
	String nome;
	int idade;
	double peso;
	String vetor[] = new String [5];
	
	public String[] dadosPessoa() {
		
		vetor[0] = nome;
		
		if (idade < 18) {
			vetor[3] = "Menor de idade";
		} else {
			vetor[3] = "Maior de idade";
		}
		
		if (peso < 70) {
			vetor[4] = "Menos que 70kg";
		} else {
			vetor[4] = "Mais que 70kg";
		}
		
		vetor[1] = Integer.toString(idade);
		vetor[2] = Double.toString(peso);
		
		return vetor;
	}
}
