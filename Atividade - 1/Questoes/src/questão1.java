import java.util.Scanner;
public class questão1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int  area,perimetro,base,a;
		
			System.out.println("digite a base");
				base = in.nextInt();
			System.out.println("digite a altura");
				a = in.nextInt();
		
				area = base*a;
				perimetro = 2*(base+a);

				System.out.println("essa é a area do retangulo "+area);
				System.out.println("esse é o perimetro "+perimetro);

	}
}

