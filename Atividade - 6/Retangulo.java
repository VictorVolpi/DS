package formas;

public class Retangulo extends Forma {
	private double area;
	
	public double calcular() {
		area = getB() * getH();
		return area;
	}

	public double getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}
	
}
