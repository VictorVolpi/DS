package formas;

public class Quadrado extends Forma {
	private double area;
	
	public double calcular() {
		area = Math.pow(getB(), getH());
		return area;
	}

	public double getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}
	
}
