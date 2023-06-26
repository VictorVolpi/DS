package formasAtualizado;

public class Trapezio extends Forma {
	
	private double baseMaior;
	
	public double getBaseMaior() {
		return baseMaior;
	}

	public void setBaseMaior(double baseMaior) {
		this.baseMaior = baseMaior;
	}

	public double calcularArea() {
		return (baseMaior + super.getBase()) * super.getAltura() / 2;
	}
}
