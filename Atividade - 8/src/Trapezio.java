

import javax.swing.JOptionPane;

public class Trapezio extends formas {

	private double trapezio;
	Trapezio(double base, double altura, double baseM, double baseG, double lados) {
		super(base, altura, baseM, baseG, lados);
		
		
		this.setBaseG(baseG);
		this.setBaseM(baseM);
		this.setAltura(altura);
		
	}
	
	void calcularArea(double base, double altura, double baseM, double baseG, double lados) {
		
		
		
		baseG =  Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a base maior do trapézio:","Digite a Base Maior",JOptionPane.QUESTION_MESSAGE));
		baseM= Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a base menor do  trapézio:","Digite a Base Menor",JOptionPane.QUESTION_MESSAGE));
		
		
		altura =  Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura do trapezio:","Digite a Altura", JOptionPane.QUESTION_MESSAGE));
		
		
		this.setBaseG(baseG);
		this.setBaseM(baseM);
		this.setAltura(altura);
		
		trapezio= (altura+baseG+baseM)/2;
		JOptionPane.showMessageDialog( null, "A area do Trapézio é: "+trapezio ,"Resultado da Area", JOptionPane.INFORMATION_MESSAGE);
	}

}
