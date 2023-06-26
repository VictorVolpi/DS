package formasAtualizado;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Quadrado quadrado = new Quadrado();
		quadrado.setBase(in.nextDouble());
		
		Triangulo triangulo = new Triangulo();
		triangulo.setAltura(in.nextDouble());
		triangulo.setBase(in.nextDouble());
		
		Trapezio trapezio = new Trapezio();
		System.out.println("Trapézio: ");
		trapezio.setAltura(in.nextDouble());
		trapezio.setBase(in.nextDouble());
		trapezio.setBaseMaior(in.nextDouble());
		
		Retangulo retangulo = new Retangulo();
		retangulo.setAltura(in.nextDouble());
		retangulo.setBase(in.nextDouble());
		
		System.out.println("Área do quadrado: " + quadrado.calcularArea());
		System.out.println("Área do triangulo: " + triangulo.calcularArea());
		System.out.println("Área do trapézio: " + trapezio.calcularArea());
		System.out.println("Área do retângulo: " + retangulo.calcularArea());
		
		in.close();
	}
}
