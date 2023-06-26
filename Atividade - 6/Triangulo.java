package formas;

public class Triangulo extends Forma {
	private double area;
	
	public double calcular() {
		area = getB() * getH() / 2;
		return area;
	}

	public double getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}
	
}
