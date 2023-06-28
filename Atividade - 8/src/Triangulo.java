import javax.swing.JOptionPane;

public class Triangulo extends formas{
	public double triangulo;
	Triangulo(double base, double altura, double baseM, double baseG, double lados) {
		super(base, altura, baseM, baseG, lados);
		
		
		this.setBase(base);
		this.setAltura(altura);
		
	}
	
	void calcularArea(double base, double altura, double baseM, double baseG, double lados) {
		
		
		
		base = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a base do Triângulo:","Digite a Base",JOptionPane.QUESTION_MESSAGE));
		altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a base do Triãngulo:","Digite a Altura",JOptionPane.QUESTION_MESSAGE));
		
		this.setBase(base);
		this.setAltura(altura);
		
		triangulo = (base+altura)/2;
		JOptionPane.showMessageDialog( null, "A area do Triângulo é: "+triangulo ,"Resultado da Area", JOptionPane.INFORMATION_MESSAGE);
	}

}
