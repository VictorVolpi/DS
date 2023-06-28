import java.util.Scanner;

import javax.swing.JOptionPane;
public class Retangulo extends formas {
	private double retangulo;
	Retangulo(double base, double altura, double baseM, double baseG, double lados) {
		super(base, altura, baseM, baseG, lados);
		
		
		
		this.setBase(base);
		this.setAltura(altura);
		
	}
	
	void calcularArea(double base, double altura, double baseM, double baseG, double lados) {
		Scanner in = new Scanner(System.in);
		
		
		base = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a base do Retângulo:","Digite a Base",JOptionPane.QUESTION_MESSAGE));
		altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura do Retângulo:","Digite a Altura",JOptionPane.QUESTION_MESSAGE));
		
		this.setBase(base);
		this.setAltura(altura);
		
		retangulo = base*altura;
		JOptionPane.showMessageDialog( null, "A area do Retângulo é: "+retangulo ,"Resultado da Area", JOptionPane.INFORMATION_MESSAGE);
		
	}

}
