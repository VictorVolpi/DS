package formas;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Triangulo triangulo = new Triangulo();
		Retangulo retangulo = new Retangulo();
		Trapezio trapezio = new Trapezio();
		Quadrado quadrado = new Quadrado();
		
		triangulo.setB(in.nextInt());
		triangulo.setH(in.nextInt());
		System.out.println(triangulo.calcular());
		
		retangulo.setB(in.nextInt());
		retangulo.setH(in.nextInt());
		System.out.println(retangulo.calcular());
		
		trapezio.setB(in.nextInt());
		trapezio.setH(in.nextInt());
		System.out.println(trapezio.calcular());
		
		quadrado.setB(in.nextInt());
		quadrado.setH(in.nextInt());
		System.out.println(quadrado.calcular());
	}

}
