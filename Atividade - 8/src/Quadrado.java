import javax.swing.JOptionPane;
public class Quadrado extends formas{
	 private double quadrado;

	Quadrado(double base, double altura, double baseM, double baseG, double lados) {
		super(base, altura, baseM, baseG, lados);
		
		
		this.setLados(lados);
		
		
	}

	
	void calcularArea(double base, double altura, double baseM, double baseG, double lados) {
		
		
		
		lados = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite os lados do quadrado:","Digite os Lados",JOptionPane.QUESTION_MESSAGE));
		this.setLados(lados);
		
		quadrado = lados*lados;
		 JOptionPane.showMessageDialog( null, "A area do Quadrado é: "+quadrado ,"Resultado da Area", JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	

	

}
