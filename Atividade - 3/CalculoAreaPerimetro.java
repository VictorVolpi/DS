
public class CalculoAreaPerimetro {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		calcuAreaPerimetro calcu2 = new calcuAreaPerimetro();
		
		
		System.out.println("Informe o valor da Base do retangulo ");
		calcu2.base = in.nextInt();
		
		
		System.out.println("Informe o valor da Altura do retangulo ");
		calcu2.altura = in.nextInt();
		
		calcu2.calcuPerimetro();
		calcu2.calcuArea();
		
	}

}
