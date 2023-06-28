import javax.swing.JOptionPane;

public class AppFormas {
	 
	public static void main(String[] args) {
	
		int forma;
		int resposta;
		
		
		
			
			
		do {
			forma = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a forma que deseja saber a Area: \n1-Quadrado\n2-Retângulo\n3-Triângulo\n4-Trapézio","Digite a forma que deseja", JOptionPane.QUESTION_MESSAGE));
			
			if(forma==1) {
				Quadrado quadrado = new Quadrado(0, 0, 0, 0, 0);
				quadrado.calcularArea(0, 0, 0, 0, 0);
			}else if(forma==2) {
				Retangulo retangulo = new Retangulo(0, 0, 0, 0, 0);
				retangulo.calcularArea(0, 0, 0, 0, 0);
			}else if(forma==3) {
				Triangulo triangulo = new Triangulo(0, 0, 0, 0, 0);
				triangulo.calcularArea(0, 0, 0, 0, 0);
			}else if(forma==4) {
				Trapezio trapezio = new Trapezio(0, 0, 0, 0, 0);
				trapezio.calcularArea(0, 0, 0, 0, 0);
			}
			resposta = JOptionPane.showConfirmDialog(null, "Deseja saber a area de outra forma?", "Deseja Continuar?", JOptionPane.YES_NO_OPTION);
		}while(resposta == JOptionPane.YES_OPTION);
		JOptionPane.showMessageDialog(null, "Fim do Programa","AVISO", JOptionPane.WARNING_MESSAGE);
	}
	

}
