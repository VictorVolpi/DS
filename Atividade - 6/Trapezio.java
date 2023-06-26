package formas;

public class Trapezio extends Forma {
	private double area;
	private double B;
	
	public double calcular() {
		area = (B + getB()) / 2 * getH();
		return area;
	}

	public double getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}
	
}
